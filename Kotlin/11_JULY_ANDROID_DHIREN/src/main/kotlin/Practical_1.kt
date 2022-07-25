import java.util.Scanner

fun main() {

    print("Enter int value : ")
    var num1 = readLine()!!.toInt()     // converting String to Int

    print("Enter float value : ")
    var num2 = readLine()!!.toFloat()   // converting String to Float

    print("Enter Name : ")
    var name = readLine()

    print("Enter character : ")
    var ch = readLine()!![0]        // char input
    //var ch = readLine()!!.toCharArray()[0]

    println("int : $num1")
    println("float : $num2")
    println("name : $name")
    println("ch : $ch")

    //Scanner scanner = new Scanner(System.in)  // in Java
    var scanner = Scanner(System.`in`)          // in Kotlin

}