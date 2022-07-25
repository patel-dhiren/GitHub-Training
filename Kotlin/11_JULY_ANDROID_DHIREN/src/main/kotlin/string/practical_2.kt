package string

fun main() {

    var str = "Tops technologies"
    var count = 0
    for(ch in str){

        count = 0

        for(char in str){
            if(ch.equals(char, ignoreCase = true)){
                   count++
            }
        }

        println("$ch = $count")
    }

}