object Line_Mid_Point {
    fun midpoint(
        x1: Int, x2: Int,
        y1: Int, y2: Int
    ) {
        print(
            ((x1 + x2) / 2
                    ).toString() + " , " + (y1 + y2) / 2
        )
        println("")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val x1 = -1
        val y1 = 2
        val x2 = 3
        val y2 = -6
        midpoint(x1, x2, y1, y2)
    }
}