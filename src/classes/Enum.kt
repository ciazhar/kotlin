package classes

/**
 * Created by ciazhar on 8/30/17.
 */

enum class Enum {
    EASY,
    MEDUIM,
    HARD,
    INSANE
}

///enum dg value
enum class Enum2(var int :Int) {
    EASY(1),
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