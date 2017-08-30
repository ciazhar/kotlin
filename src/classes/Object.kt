package classes

/**
 * Created by ciazhar on 8/30/17.
 */

object Object{
    val someProperty = "value"
}

fun main(args: Array<String>) {
    ///memanggil object
    print(Object.someProperty)

    //deklarasi local object
    val localObject = object {
        val otherProperty = "other value"
    }
    print(localObject.otherProperty)
}