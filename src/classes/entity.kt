package classes

/**
 * Created by ciazhar on 8/30/17.
 */

///Sebuah class dengan property, constructor, hashmap, equals, to string
data class Costumer1(var id : Int, var name : String, var email : String)

///kita juga bisa override methode nya
data class Costumer2(var id : Int, var name : String, var email : String){
    override fun toString(): String {
        return "{\n  \"id\" : \"$id\",\n  \"name\" : \"$name\",\n  \"email\" : \"$email\"\n}"
    }
}
