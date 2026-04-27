import java.text.DecimalFormat

object JavaDecimalFormatter {
    @JvmStatic
    fun main(args: Array<String>) {
        val num = 123.4567

        // prints only numeric part of a floating number 
        var ft = DecimalFormat("####")
        println("Without fraction part: num = " + ft.format(num))

        // this will print it upto 2 decimal places 
        ft = DecimalFormat("#.##")
        println("Formatted to Give precison: num = " + ft.format(num))

        // automatically appends zero to the rightmost part of decimal 
        // instead of #,we use digit 0 
        ft = DecimalFormat("#.000000")
        println("appended zeroes to right: num = " + ft.format(num))

        // automatically appends zero to the leftmost of decimal number 
        // instead of #,we use digit 0 
        ft = DecimalFormat("00000.00")
        println("formatting Numeric part : num = " + ft.format(num))

        // formatting money in dollars 
        val income = 23456.789
        ft = DecimalFormat("$###,###.##")
        println("your Formatted Dream Income : " + ft.format(income))
    }
}