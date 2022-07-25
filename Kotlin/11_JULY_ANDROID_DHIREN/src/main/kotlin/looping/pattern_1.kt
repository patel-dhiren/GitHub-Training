package looping

fun main() {

    for(i in 0 until 5){

        for( j in 0..i){
            print("*")
        }

        println()

    }

}