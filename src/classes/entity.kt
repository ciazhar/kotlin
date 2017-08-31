package classes

/**
 * Created by ciazhar on 8/30/17.
 */

/**
 * Entity -> Class pada umumnya yang mendiskripsikan entitas.
 * Biasanya berisi property, constructor, hashmap, equals dan to string.
 */

/**
 * Sebuah class dengan property, constructor, hashmap, equals, to string
 */
data class Costumer1(var id : Int, var name : String, var email : String)

/**
 * Kita juga bisa override methode nya
 */
data class Costumer2(var id : Int, var name : String, var email : String){
    override fun toString(): String {
        return "{\n  \"id\" : \"$id\",\n  \"name\" : \"$name\",\n  \"email\" : \"$email\"\n}"
    }
}
