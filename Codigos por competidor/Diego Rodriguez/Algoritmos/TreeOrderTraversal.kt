import kotlin.jvm.JvmStatic
import java.util.*

object TreeOrderTraversal {
    // Utility function to create a new tree node 
    fun newNode(key: Int): Node {
        val temp = Node()
        temp.key = key
        return temp
    }

    // Prints the n-ary tree level wise 
    fun LevelOrderTraversal(root: Node?) {
        if (root == null) {
            return
        }

        // Standard level order traversal code 
        // using queue 
        val q: Queue<Node> = LinkedList() // Create a queue 
        q.add(root) // Enqueue root  
        while (!q.isEmpty()) {
            var n = q.size

            // If this node has children 
            while (n > 0) {
                // Dequeue an item from queue 
                // and print it 
                val p = q.peek()
                q.remove()
                print(p.key.toString() + " ")

                // Enqueue all children of  
                // the dequeued item 
                for (i in p.child.indices) {
                    q.add(p.child[i])
                }
                n--
            }

            // Print new line between two levels 
            println()
        }
    }

    // Driver Code 
    @JvmStatic
    fun main(args: Array<String>) {

        /* Let us create below tree 
    *             10 
    *     / / \ \ 
    *     2 34 56 100 
    *     / \         | / | \ 
    *     77 88     1 7 8 9 
         */
        val root = newNode(10)
        root.child.add(newNode(2))
        root.child.add(newNode(34))
        root.child.add(newNode(56))
        root.child.add(newNode(100))
        root.child[0].child.add(newNode(77))
        root.child[0].child.add(newNode(88))
        root.child[2].child.add(newNode(1))
        root.child[3].child.add(newNode(7))
        root.child[3].child.add(newNode(8))
        root.child[3].child.add(newNode(9))
        println(
            "Level order traversal "
                    + "Before Mirroring "
        )
        LevelOrderTraversal(root)
    }

    // Represents a node of an n-ary tree 
    class Node {
        var key = 0
        var child = Vector<Node>()
    }
}