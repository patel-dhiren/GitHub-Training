package control_statement

// WAP to print largest number from given two number
fun main() {

    var num1 = 33
    var num2 = 56

    var result = if (num1 > num2) {
        //println("$num1 is greater")
        "$num1 is greater"      // string
    } else {
        //println("$num2 is greater")
        "$num2 is greater"
    }

    var large = if (num1>num2) num1 else num2

    println(large)
    println(result)

}