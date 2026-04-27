import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

object DateFormatter {
    @Throws(ParseException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        // Formatting as per given pattern in the argument 
        var ft = SimpleDateFormat("dd-MM-yyyy")
        var str = ft.format(Date())
        println("Formatted Date : $str")

        // parsing a given String 
        str = "02/18/1995"
        ft = SimpleDateFormat("MM/dd/yyyy")
        val date = ft.parse(str)

        // this will print the date as per parsed string 
        println("Parsed Date : $date")
    }
}