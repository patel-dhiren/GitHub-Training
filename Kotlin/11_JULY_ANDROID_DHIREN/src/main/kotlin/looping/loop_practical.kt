package looping

fun main() {

    var num = 1

    while (num<10){         // 1..9     10

        println(num)
        num++

    }

    num = 5

    do{
           println(num)
           num++

    }while(num<=11)

    println("value of num = $num")


}