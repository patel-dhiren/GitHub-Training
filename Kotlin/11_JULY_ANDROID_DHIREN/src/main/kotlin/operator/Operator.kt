package operator

fun main() {

    //Arithmetic Operators (+, -, / ,*, %)

    var num1 = 23
    var num2 = 3

    println("addition : ${num1+num2}")
    println("addition : ${num1.plus(num2)}")
    println("subtraction : ${num1-num2}")
    println("subtraction : ${num1.minus(num2)}")
    println("multiplication : ${num1*num2}")
    println("multiplication : ${num1.times(num2)}")
    println("division : ${num1/num2.toFloat()}")
    println("division : ${num1.div(num2.toFloat())}")
    println("modulas : ${num1%num2}")
    println("modulas : ${num1.mod(num2)}")


    var ch = '@'
    print("toInt : ${ch.toInt()}")      // giving its ASCII value

    // Assignment Operator (+=, -=, *=, /= , %=)

    var num = 56
    num %= 2        // num = num%2
    println("\nvalue of num : $num")

    // Increment / Decrement Operator (++, --)


    println("value of num : ${num++}")  // Postfix
    println("value of num : ${++num}")       // Prefix

    // Comparison Operator (>, < , >= ,<= ,== , !=)
    println(num==2)
    println(num!=10)

    // Logical Operator (&& , || , !)
    num = 10

    println(num>0 && num<=10)   //    println(num in 1..10)

    println(num%3==0 || num%5==0)

    println(!(num>0))

}