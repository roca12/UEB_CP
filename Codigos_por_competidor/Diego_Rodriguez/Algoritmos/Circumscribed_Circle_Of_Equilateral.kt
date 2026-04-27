object Circumscribed_Circle_Of_Equilateral {
    var PI = 3.14159265
    fun area_cicumscribed(a: Double): Double {
        return a * a * (PI / 3)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = 6.0
        println(
            "Area of circumscribed circle is :"
                    + area_cicumscribed(a)
        )
    }
}