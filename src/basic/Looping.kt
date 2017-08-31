package basic

/**
 * Created by ciazhar on 8/24/17.
 */

fun main(args: Array<String>) {
    /**
     * Looping sederhana
     */
    for (a in 1..4){
        print(a)
    }

    /**
     * Looping dengan variavel
     */
    val number = 1..4
    for (a in number){
        print(a)
    }

    /**
     * Looping decrement
     */
    for (a in 5 downTo 1){
        print(a)
    }

    /**
     * Looping decrement 3--
     */
    for (a in 5 downTo 1 step 3){
        print(a)
    }

    /**
     * Looping string
     */
    val Kota = listOf("Kota", "KOta", "kt", "ta")
    val apa = listOf("Kota", 1, "dd", 'a')
    for (a in apa){
        print(a)
    }

    /**
     * Looping dengan goto
     */
    asa@ for (a in 1..4){
        for (a in 1..4){
            break@asa
        }
    }



}