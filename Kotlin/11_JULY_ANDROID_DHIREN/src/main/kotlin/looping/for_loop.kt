package looping

fun main() {

    for(i in 1..10){
        print("$i  ")
    }

    println()

    for(i in 1 until 10){
        print("$i  ")
    }

    println()

    for(i in 10 downTo 1){
        print("$i  ")
    }

    println()

    for(num in 1..10 step 2){
        print("$num  ")
    }

    var array = arrayOf(12,45,78,34,23)
    for(num in array){
        print("$num  ")
    }

}