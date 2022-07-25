// WAP to print addition of two numbers
fun main() {

    print("Enter num1 : ")
    var num1 = readLine()!!.toInt()     // Not null assertion

    print("Enter num2 : ")
    var num2 = readLine()!!.toInt()
    
    println("Summation : $num1+num2")
    println("Summation : $num1+$num2")
    println("Summation : ${num1+num2}")

}