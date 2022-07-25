package looping

fun main() {

    do{

        print("Enter number of rows : ")
        var row = readLine()!!.toInt()

        for(i in 1..row){

            for(j in row-1 downTo i)
            {
                print(" ")
            }

            for( k in 1..i){
                print("* ")
            }

            println()
        }


    }while (row!=0)


}