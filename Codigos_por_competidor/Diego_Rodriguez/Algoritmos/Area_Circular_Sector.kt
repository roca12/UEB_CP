object Area_Circular_Sector {
    fun sectorArea(radius: Double, angle: Double) {
        if (angle >= 360) {
            println("Angulo no posible")
        } else {
            val sector = 22 * radius * radius / 7 * (angle / 360)
            println(sector)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val radius = 9.0
        val angle = 60.0
        sectorArea(radius, angle)
    }
}