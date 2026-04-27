import kotlin.jvm.JvmStatic

// on Trie 
object Trie {
    // Alphabet size (# of symbols) 
    const val ALPHABET_SIZE = 26
    var root: TrieNode? = null

    // If not present, inserts key into trie 
    // If the key is prefix of trie node, 
    // just marks leaf node 
    fun insert(key: String) {
        var level: Int
        val length = key.length
        var index: Int
        var pCrawl = root
        level = 0
        while (level < length) {
            index = key[level] - 'a'
            if (pCrawl!!.children[index] == null) {
                pCrawl.children[index] = TrieNode()
            }
            pCrawl = pCrawl.children[index]
            level++
        }

        // mark last node as leaf 
        pCrawl!!.isEndOfWord = true
    }

    // Returns true if key presents in trie, else false 
    fun search(key: String): Boolean {
        var level: Int
        val length = key.length
        var index: Int
        var pCrawl = root
        level = 0
        while (level < length) {
            index = key[level] - 'a'
            if (pCrawl!!.children[index] == null) {
                return false
            }
            pCrawl = pCrawl.children[index]
            level++
        }
        return pCrawl != null && pCrawl.isEndOfWord
    }

    // Driver 
    @JvmStatic
    fun main(args: Array<String>) {
        // Input keys (use only 'a' through 'z' and lower case) 
        val keys = arrayOf(
            "the", "a", "there", "answer", "any",
            "by", "bye", "their"
        )
        val output = arrayOf("Not present in trie", "Present in trie")
        root = TrieNode()

        // Construct trie 
        var i: Int
        i = 0
        while (i < keys.size) {
            insert(keys[i])
            i++
        }

        // Search for different keys 
        if (search("the") == true) {
            println("the --- " + output[1])
        } else {
            println("the --- " + output[0])
        }
        if (search("these") == true) {
            println("these --- " + output[1])
        } else {
            println("these --- " + output[0])
        }
        if (search("their") == true) {
            println("their --- " + output[1])
        } else {
            println("their --- " + output[0])
        }
        if (search("thaw") == true) {
            println("thaw --- " + output[1])
        } else {
            println("thaw --- " + output[0])
        }
    }

    // trie node 
    class TrieNode {
        var children = arrayOfNulls<TrieNode>(ALPHABET_SIZE)

        // isEndOfWord is true if the node represents 
        // end of a word 
        var isEndOfWord = false

        init {
            for (i in 0 until ALPHABET_SIZE) {
                children[i] = null
            }
        }
    }
}