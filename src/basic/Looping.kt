package basic

/**
 * Created by ciazhar on 8/24/17.
 */

fun main(args: Array<String>) {
    //basic for loop
    for (a in 1..4){
        print(a)
    }

    //loop with variable
    val number = 1..4
    for (a in number){
        print(a)
    }

    //decrease loop
    for (a in 5 downTo 1){
        print(a)
    }

    //decrease loop with 3--
    for (a in 5 downTo 1 step 3){
        print(a)
    }

    ///String loop
    val Kota = listOf("Kota", "KOta", "kt", "ta")
    val apa = listOf("Kota", 1, "dd", 'a')
    for (a in apa){
        print(a)
    }

    ///loop with goto
    asa@ for (a in 1..4){
        for (a in 1..4){
            break@asa
        }
    }



}