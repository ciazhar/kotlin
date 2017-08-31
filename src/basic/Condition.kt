package basic

/**
 * Created by ciazhar on 8/24/17.
 */


fun main(args: Array<String>) {
    /**
     * Penggunaan Kondisi sederhana
     */
    val kata = "Kata"
    if (kata != null){
        println("Tidak Null")
    }
    else{
        println("Null")
    }

    /**
     * Memasukkan hasil kondisi ke sebuah variabel
     */
    val kata2 = if (kata != null){
        "Tidak Null"
    }
    else{
        "Null"
    }
    println(kata2)

    /**
     * Penggunaan when. Seperti switch case
     */
    when(kata){
        is
        String -> print("Ini String")
        "String" -> print("Value String")
        "Bukan String" -> {
            println("Value bukan String") //multiple line
            print("Value bukan String")
        }
    }

    /**
     * Memasukkan hasil when ke variabel
     */
    val whenValue = when(kata){
        is String -> print("Ini String")
        "String" -> print("Value String")
        "Bukan String" -> {
            print("Value bukan String")
        }
        else ->{
            "Value"
        }
    }
    print(whenValue)
}