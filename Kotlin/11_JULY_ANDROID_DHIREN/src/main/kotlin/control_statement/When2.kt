package control_statement

fun main() {

    var num = 21

    var res = when(num)
    {
        0, 11 -> "0 or 11"
        in 1..10 -> "from 1 to 10"
        !in 12..14 -> "Not from 12 to 14"
        in 15 until 20 -> "from 15 to 19"
        else -> "invalid input"
    }

    println("$res")

}