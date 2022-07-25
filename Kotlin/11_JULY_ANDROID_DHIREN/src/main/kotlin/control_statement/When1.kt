package control_statement

fun main() {

    var num = 3
    var res = when(num){
        1,3,5,7,9 -> "Odd number"       // 1  || 3 || 5 || 7 || 9
        2,4,6,8 -> "Even number"
        else -> "invalid number"
    }

    println(res)
}