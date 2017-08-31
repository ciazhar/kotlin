package basic

/**
 * Created by ciazhar on 8/23/17.
 */

fun main(args: Array<String>) {
    /**
     * Deklarasi static variabel (baca : bertipe data tidak dapat diubah)
     */
    var angka : Int
    var kata : String

    /**
     * Deklarasi static variabel dengan value
     */
    var angka2 : Int = 0
    var kata2 : String = "Hello"

    /**
     * Deklarasi dynamic variabel (baca : tipe data dapat berubah)
     */
    var angka3 = 0
    var kata3 = "Hello"

    /**
     * Deklarasi immutable variable (baca : value tidak bisa diubah)
     */
    val kata4 = "Hello"
//    kata4 = "Ganti"

    /**
     * Deklarasi tipe data angka
     */
    val myInt = 10
    val myLong = 10L
    val myHex = 0x45
    val myBinary = 0x45

    /**
     * Casting (baca:mengubah tipe data)
     */
    val myLongBaru = myInt.toLong() //kalo mau casting

    /**
     * Deklarasi tipe data huruf
     */
    val myChar = 'a'
    val myString = "String"

    /**
     * Menggunakan variabel
     */
    val newString = "Hello this is $myString "

    /**
     * Mendapatkan detail dari variabel. 
     */
    val someNew = "The $myString length is ${myString.length}"
    
}