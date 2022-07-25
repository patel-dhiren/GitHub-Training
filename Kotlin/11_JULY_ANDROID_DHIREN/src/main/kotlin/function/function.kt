package function

fun main() {

    factorial()

}

fun factorial(){
    var num = 5
    var fact = 1

    for(i in 1..num){
        fact*=i
    }

    println("factorial : $fact")

}