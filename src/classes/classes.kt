package classes

import java.util.*

/**
 * Created by ciazhar on 8/24/17.
 */

//deklarasi class kosong
class NamaClass

//deklarasi class dengan property
class Costumer{
    var id : Int = 0
    var name : String = ""
}

//more short
class CostumerShort(var id : Int,var name:String)

//parameter bisa juga dibikin conditional
class CostumerContional(var id : Int=0,var name:String)

//nilai parameter bisa juga dirubah
class CostumerInit(var id : Int=0,var name:String){
    init {
        name = name.decapitalize()
    }
}
//membuat second constructor
class CostumerConst(var id : Int=0,var name:String){
    constructor(email : String) : this(0,"")
}

//custom getter and setter
class Cstmr(var id: Int = 0, var name: String, val yearOfBirth: Int){
    val age : Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var someString : String = ""
        set(value) {
            if (!value.startsWith("Apa")){
                throw IllegalArgumentException("Salah")
            }
            field = value //ngeset value ke someString
        }

    fun toBeString() :String = "id : $id - name : $name"
}

fun main(args: Array<String>) {
    ///membuat objek dari Costumer
    val costumer = Costumer()
    val cost = Cstmr(name = "Ya", yearOfBirth = 100)

    ///mengakses property
    costumer.id
    costumer.name

    ///membuat objek
    val costumerr = CostumerContional(name = "Saya")

    ///memanggil fungsi
    print(cost.toBeString())
}