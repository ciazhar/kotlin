package function

/**
 * Created by ciazhar on 8/24/17.
 */

//deklarasi void
fun iniVoid(){
    print("Halo ini void")
}

///contoh fungsi yang tidak mengembalikan apapun, misal cuma buat ngeluarin exception
fun iniVoidException() : Nothing{
    throw Exception("Ini Exception")
}
/// fungsi string
fun toString(string : String):String{
    return string
}
///fungsi int
fun sum(x : Int, y : Int):Int{
    return x*y
}
//fungsi int with lamda
fun shortSum(x:Int, y: Int)=x*y

//function with default parameter in int. Kita bisa set parameter itu wajib atau tidak
fun defaultParameter(x:Int, y: Int, z:Int =0)=x*y*z

//function with default parameter in string
fun defaultPString(nama:String, email:String="", hp:String) = "Nama : $nama - email : $email - phone : $hp"

///function with unlimited parameter. Parameter mirip array tapi unlimited.
// Kita bisa input parameter dengan jumlah value sesuka kita
fun bikinString(vararg strings:String){
    for (string in strings){
        print(string)
    }
}

//fungsi yang memanggil fungsi lainya. * ini seperti this atau pointer
fun realBikinString(vararg string:String){
    bikinString(*string)
}


fun main(args: Array<String>) {
    iniVoid()

    val value = toString("Ini Value")

    defaultParameter(1,2,3)
    defaultParameter(1,2)
    defaultPString("Nama",hp = "14045")// email tidak di input
    defaultPString("Nama",hp = "14045", email = "email") //bisa diubah susunanya

    bikinString("1")
    bikinString("1","2")
    bikinString("1","3")
    bikinString("1","4","5")
    realBikinString("1","2","3")
}
