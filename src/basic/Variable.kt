package basic

/**
 * Created by ciazhar on 8/23/17.
 */

fun main(args: Array<String>) {
    //static declaration
    var angka : Int
    var kata : String

    //static declaration with value
    var angka2 : Int = 0
    var kata2 : String = "Hello"

    //dynamic declaration
    var angka3 = 0
    var kata3 = "Hello"

    //final variable declaration (value tidak bisa dirubah)
    val kata4 = "Hello"
//    kata4 = "Ganti"

    //Number Declaration (Pada dasarnya tipe data di kotlin adalah objek, berbeda dengan java)
    val myInt = 10
    val myLong = 10L
    val myHex = 0x45
    val myBinary = 0x45

    //casting
    val myLongBaru = myInt.toLong() //kalo mau casting

    //Word Declaraion
    val myChar = 'a'
    val myString = "String"

    //using variable
    val newString = "Hello this is $myString "

    //get spesific details from variable
    val someNew = "The $myString length is ${myString.length}"
    
}