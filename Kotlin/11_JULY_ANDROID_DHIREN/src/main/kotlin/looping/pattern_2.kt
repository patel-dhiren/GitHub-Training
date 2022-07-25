package looping

fun main() {

    var num = 1

    for(i in 0 until 5){

        for( j in 0..i){
            //print(num)
            if(num%2==0)
                print(0)
            else
                print(1)

            num++
        }

        println()

    }

}