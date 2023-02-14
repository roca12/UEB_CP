import UkkonenSuffixTree.Ukkonen
import java.lang.StringBuilder

object UkkonenSuffixTree {
    @JvmStatic
    fun main(args: Array<String>) {
        val suffixTree = Ukkonen()
        suffixTree.process("abcabxabcd$")
        // suffixTree.process("cacao$")
    }

    internal class Ukkonen {
        // set to true if each step should be printed out and detail about
        // active node should be printed. Increases runtime to O(n^2).
        var DETAILED = true

        // Unique ending character appended to end of string
        // to ensure suffix tree is not implicit.
        var UNIQUE = '$'

        // String given (if running offline)
        private var phrase: String? = null

        // Root of the suffix tree.
        private val root: Node

        // Global variable to maintain constant time extension of suffixes.
        private var leafEnd: Int

        // Holds internal node whose suffix link remains to be set/finalized.
        private var internalNode: Node? = null

        // Active Point Variables
        // Can be root or internal node.
        private var activeNode: Node?

        // Holds the index the edge we should traverse next starts with.
        private var activeEdge: Int

        // Tells how many characters we need to walk down.
        private var activeLength: Int

        // Number of explicit extensions that need to be made for this phase.
        private var remainingSuffixCount: Int
        fun process(str: String) {
            require(str.indexOf(UNIQUE) == str.length - 1) { "String must end in the unique character $" }
            phrase = str
            for (i in 0 until phrase!!.length) {
                if (DETAILED) {
                    println("----------Step " + (i + 1) + "-------------")
                }
                processIndex(i)
                if (DETAILED) {
                    printTree()
                }
            }
            if (!DETAILED) {
                printTree()
            }
        }

        // Used when running offline
        private fun processIndex(index: Int) {
            var localinternalnode=this.internalNode
            // Rule One: if leaf, append latest character.
            // Trick Three: Update end value of all leaf edges by updating
            // the global end variable.
            if (DETAILED) {
                println("Rule One/Trick Three")
            }
            leafEnd = index
            remainingSuffixCount++
            internalNode = null
            while (remainingSuffixCount > 0) {
                // ALZ: ActivePoint Change for Active Length Zero
                // At the start of extension, when activeLength is zero, activeEdge 
                // is set to the current character being processed
                if (activeLength == 0) {
                    if (DETAILED) {
                        println("ALZ")
                    }
                    activeEdge = index
                    if (DETAILED) {
                        printActivePoint()
                    }
                }
                if (!activeNode!!.edgeMap.containsKey(phrase!![activeEdge])) {
                    // Rule Two: Creates a new leaf edge if not seen before
                    if (DETAILED) {
                        println("Rule Two: new leaf")
                    }
                    activeNode!!.edgeMap[phrase!![activeEdge]] = Node(index)
                    if (internalNode != null) {
                        if (DETAILED) {
                            println("Set up suffixLink from last internal node to activeNode")
                        }
                        if (localinternalnode != null) {
                            localinternalnode.suffixLink = activeNode
                        }
                        internalNode = localinternalnode
                    }
                } else {
                    val next = activeNode!!.edgeMap[phrase!![activeEdge]]

                    // Trick One: Skip/Count. Using ActivePoint to save time on the
                    // walk down. 
                    if (DETAILED) {
                        println("Trick One: Skip/Count")
                    }
                    if (walkedDown(next)) {
                        continue
                    }

                    // Rule Three: ends the current phase (when current character is 
                    // found in current edge being traversed)
                    if (phrase!![next!!.start + activeLength] == phrase!![index]) {
                        if (DETAILED) {
                            println("Rule Three")
                        }
                        if (internalNode != null && activeNode !== root) {
                            // if (DETAILED) System.out.println("Set up suffixLink from last internal node to previous internal node");
                            if (localinternalnode != null) {
                                localinternalnode.suffixLink = activeNode
                            }
                            internalNode = localinternalnode
                        }

                        // ER3: ActivePoint Change For Extension Rule 3
                        if (DETAILED) {
                            println("ER3")
                        }
                        activeLength++
                        if (DETAILED) {
                            printActivePoint()
                        }

                        // Trick Two: Stop the processing of any phase as soon as rule 3 applies. 
                        // All further extensions are already present in tree implicitly. 
                        if (DETAILED) {
                            println("Trick Two")
                        }
                        break
                    }

                    // Rule Two: suffix only partially matches edge. Inner edge must be created.
                    if (DETAILED) {
                        println("Rule Two: Split Node")
                    }
                    val splitEnd = next.start + activeLength - 1
                    val split: Node = Node(next.start, splitEnd)
                    // replace existing pointer to new inner node.
                    activeNode!!.edgeMap[phrase!![activeEdge]] = split
                    // add new leaf edge
                    split.edgeMap[phrase!![index]] = Node(index)
                    // move old leaf node to be below new inner node.
                    next.start += activeLength
                    // add leaf node as a child of the created inner node.
                    split.edgeMap[phrase!![next.start]] = next
                    if (internalNode != null) {
                        if (DETAILED) {
                            println("Set up suffixLink from last internal node to this newly created one")
                        }
                        if (localinternalnode != null) {
                            localinternalnode.suffixLink = split
                        }
                    }
                    internalNode = localinternalnode
                }
                remainingSuffixCount--

                // ER2C1: ActivePoint Change For Extension Rule 2 Change 1
                if (activeNode === root && activeLength > 0) {
                    if (DETAILED) {
                        println("ER2C1")
                    }
                    activeLength--
                    activeEdge = index - remainingSuffixCount + 1
                    if (DETAILED) {
                        printActivePoint()
                    }
                } else if (activeNode !== root) { // ER2C2
                    if (DETAILED) {
                        println("ER2C2")
                    }
                    activeNode = activeNode!!.suffixLink
                    if (DETAILED) {
                        printActivePoint()
                    }
                }
            }
        }

        // If activeLength < edgeLength, no walk down needed.
        private fun walkedDown(n: Node?): Boolean {
            // WD: ActivePoint Change For Walk Down
            // Transform ActivePoint variables to synonymous ActivePoint of 
            // smaller length while walking down the tree. Such as from root node
            // to inner node.
            if (activeLength >= edgeLength(n)) {
                if (DETAILED) {
                    println("WD")
                }
                activeNode = n
                activeEdge += edgeLength(n)
                activeLength -= edgeLength(n)
                if (DETAILED) {
                    printActivePoint()
                }
                return true
            }
            return false
        }

        private fun edgeLength(n: Node?): Int {
            return if (n!!.end != -1) n.end - n.start + 1 else leafEnd - n.start + 1
        }

        // Labels the edges with -1 if it's an inner node or
        // 0...phrase.length()-1 for the leaves and prints them in DFS order.
        fun dfsSetAndPrint(n: Node?, labelHeight: Int) {
            if (n == null) {
                return
            }
            // if it is not a root
            if (n.start != -1) {
                print(n)
            }
            var isLeaf = true
            for ((_, node) in n.edgeMap) {
                // if n is inner node
                if (isLeaf && n.start != -1) {
                    println(" " + n.suffixIndex)
                }
                isLeaf = false
                dfsSetAndPrint(node, labelHeight + edgeLength(node))
            }
            // if n is a leaf
            if (isLeaf) {
                n.suffixIndex = phrase!!.length - labelHeight
                println(" " + n.suffixIndex)
            }
        }

        internal inner class Node {
            // start index of substring labeling edge from parent to this.
            var start: Int

            // end index of substring. -1 for leaf edges as those follow leafEnd.
            var end: Int

            // map from first character seen in edge to the node that contains the edge.
            var edgeMap: MutableMap<Char, Node?>

            // speeds up node traversal by linking to node with same edge content.
            var suffixLink: Node?

            // used when printing tree for clarity. -1 for inner nodes, 0...m for leaf nodes.
            var suffixIndex: Int

            constructor(start: Int) {
                this.start = start
                end = -1
                edgeMap = HashMap()
                suffixLink = root
                suffixIndex = -1
            }

            constructor(start: Int, end: Int) {
                this.start = start
                this.end = end
                edgeMap = HashMap()
                suffixLink = root
                suffixIndex = -1
            }

            override fun toString(): String {
                return if (end == -1) phrase!!.substring(start, leafEnd + 1) else phrase!!.substring(start, end + 1)
            }
        }

        private fun printActivePoint() {
            val sb = StringBuilder()
            sb.append("ActivePoint is (")
            if (activeNode!!.start == -1) {
                sb.append("root, ")
            } else {
                sb.append(phrase!!.substring(activeNode!!.start, activeNode!!.start + 1))
                sb.append(", ")
            }
            sb.append(phrase!!.substring(activeEdge, activeEdge + 1))
            sb.append(", ")
            sb.append(activeLength).append(")")
            println(sb.toString())
        }

        fun printTree() {
            dfsSetAndPrint(root, 0)
            if (DETAILED) {
                printActivePoint()
            }
        }

        init {
            root = Node(-1)
            leafEnd = -1
            activeNode = root
            activeEdge = -1
            activeLength = 0
            remainingSuffixCount = 0
        }
    }
}