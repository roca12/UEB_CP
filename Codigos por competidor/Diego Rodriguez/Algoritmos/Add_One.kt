object Add_One {
    fun addOne(x: Int): Int {
        return -x.inv()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var a = 13
        println(a.toString() + " -->" + Integer.toString(a, 2))
        a = addOne(a)
        println(a.toString() + " -->" + Integer.toString(a, 2))
    }
}