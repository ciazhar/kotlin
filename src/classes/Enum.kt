package classes

/**
 * Created by ciazhar on 8/30/17.
 */

/**
 * Enum -> suatu instance yang dapat melakukan behavior
 */

/**
 * Deklarasi enum class
 */
enum class Enum {
    EASY,
    MEDUIM,
    HARD,
    INSANE
}

/**
 * Deklarasi enum class dengan indeks/value
 */
enum class Enum2(var int :Int) {
    EASY(1),
    MEDUIM(2),
    HARD(3),
    INSANE(4)
}

/**
 * Bisa juga di override valuenya
 */
enum class Enum3(var int :Int) {
    EASY(1){
        override fun toString(): String {
            return "noob easy lol"
        }
    },
    MEDUIM(2),
    HARD(3),
    INSANE(4)
}


fun main(args: Array<String>) {
    //memanggil enum
    val someEnum = Enum.EASY
    print(someEnum)

    ///memanggil value
    val otherEnum = Enum2.EASY.int
    print(otherEnum)
}