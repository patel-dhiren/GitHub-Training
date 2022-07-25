package control_statement

// Nested if
fun main() {

    var num1 = 45
    var num2 = 67
    var num3 = 12

    var result = if (num1 > num2) {

        if (num1 > num3) {
            num1
        } else {
            num3
        }

    } else {
        if (num2 > num3)
            num2
        else
            num3
    }

    println("$result")

}