import kotlin.jvm.JvmStatic
import java.util.Arrays

// palindromic tree 
object PalindromicTree {
    const val MAXN = 1000

    // two special dummy Nodes as explained above 
    var root1 = Node()
    var root2 = Node()

    // stores Node information for constant time access 
    var tree = arrayOfNulls<Node>(MAXN)

    // Keeps track the current Node while insertion 
    var currNode = 0
    var s: String? = null
    var ptr = 0
    fun insert(idx: Int) {
        //STEP 1// 

        /* search for Node X such that s[idx] X S[idx] 
    is maximum palindrome ending at position idx 
    iterate down the suffix link of currNode to 
    find X */
        var tmp = currNode
        while (true) {
            val curLength = tree[tmp]!!.length
            if (idx - curLength >= 1 && s!![idx] == s!![idx - curLength - 1]) {
                break
            }
            tmp = tree[tmp]!!.suffixEdg
        }

        /* Now we have found X .... 
     * X = string at Node tmp 
     * Check : if s[idx] X s[idx] already exists or not*/if (tree[tmp]!!.insertEdg[s!![idx] - 'a'] != 0) {
            // s[idx] X s[idx] already exists in the tree 
            currNode = tree[tmp]!!.insertEdg[s!![idx] - 'a']
            return
        }

        // creating new Node 
        ptr++

        // making new Node as child of X with 
        // weight as s[idx] 
        tree[tmp]!!.insertEdg[s!![idx] - 'a'] = ptr

        // calculating length of new Node 
        tree[ptr]!!.length = tree[tmp]!!.length + 2

        // updating end point for new Node 
        tree[ptr]!!.end = idx

        // updating the start for new Node 
        tree[ptr]!!.start = idx - tree[ptr]!!.length + 1

        //STEP 2// 

        /* Setting the suffix edge for the newly created 
    Node tree[ptr]. Finding some String Y such that 
    s[idx] + Y + s[idx] is longest possible 
    palindromic suffix for newly created Node.*/tmp = tree[tmp]!!.suffixEdg

        // making new Node as current Node 
        currNode = ptr
        if (tree[currNode]!!.length == 1) {
            // if new palindrome's length is 1 
            // making its suffix link to be null string 
            tree[currNode]!!.suffixEdg = 2
            return
        }
        while (true) {
            val curLength = tree[tmp]!!.length
            if (idx - curLength >= 1 && s!![idx] == s!![idx - curLength - 1]) {
                break
            }
            tmp = tree[tmp]!!.suffixEdg
        }

        // Now we have found string Y 
        // linking current Nodes suffix link with s[idx]+Y+s[idx] 
        tree[currNode]!!.suffixEdg = tree[tmp]!!.insertEdg[s!![idx] - 'a']
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // initializing the tree 
        root1.length = -1
        root1.suffixEdg = 1
        root2.length = 0
        root2.suffixEdg = 1
        Arrays.fill(tree, Node())
        tree[1] = root1
        tree[2] = root2
        ptr = 2
        currNode = 1

        // given string 
        s = "abcbab"
        val l = s!!.length
        for (i in 0 until l) {
            insert(i)
        }
        // printing all of its distinct palindromic 
        // substring 
        println("All distinct palindromic substring for " + s + " :")
        for (i in 3..ptr) {
            print((i - 2).toString() + ") ")
            for (j in tree[i]!!.start..tree[i]!!.end) {
                print(s!![j])
            }
            println("")
        }
    }

    class Node {
        // store start and end indexes of current 
        // Node inclusively 
        var start = 0
        var end = 0

        // stores length of substring 
        var length = 0

        // stores insertion Node for all characters a-z 
        var insertEdg = IntArray(26)

        // stores the Maximum Palindromic Suffix Node for 
        // the current Node 
        var suffixEdg = 0

        constructor(start: Int, end: Int, length: Int, suffixEdg: Int) {
            this.start = start
            this.end = end
            this.length = length
            this.suffixEdg = suffixEdg
        }

        constructor() {}
    }
}