package basic

/**
 * Created by ciazhar on 8/24/17.
 */


fun main(args: Array<String>) {
    ///Simple condition
    val kata = "Kata"
    if (kata != null){
        println("Tidak Null")
    }
    else{
        println("Null")
    }

    //Hasil Kondisi menjadi value variable
    val kata2 = if (kata != null){
        "Tidak Null"
    }
    else{
        "Null"
    }
    println(kata2)

    ///when seperti switch case
    when(kata){
        is String -> print("Ini String")
        "String" -> print("Value String")
        "Bukan String" -> {
            print("Value bukan String")
        }
    }

    //value when ke variable
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