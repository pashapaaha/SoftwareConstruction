package compositeLab

import java.lang.StringBuilder

interface Graphic{
    fun invert(n: Int)
    fun move(n: Int)
}

class Figure(val id: String): Graphic{
    override fun invert(n: Int) {
        val spaces = spacesSet(n)
        println("$spaces Фигура #$id инвертирована")
    }

    override fun move(n: Int) {
        val spaces = spacesSet(n)
        println("$spaces Фигура #$id подвинута")
    }
}

fun spacesSet(count: Int): String{
    val str = StringBuilder()
    for(i in 0..count)
        str.append(' ')
    return str.toString()
}

class Container(private val children: ArrayList<Graphic> = arrayListOf()): Graphic{

    fun add(child: Graphic){
        children.add(child)
    }

    override fun invert(n: Int) {
        for(item in children)
            item.invert(n+2)
    }

    override fun move(n: Int) {
        for (item in children)
            item.move(n+2)
    }
}