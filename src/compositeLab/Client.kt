package compositeLab

fun main(args: Array<String>) {
    var ids = 0
    val container1 = Container(arrayListOf(Figure((ids++).toString()), Figure((ids++).toString()), Figure((ids++).toString())))
    val container2 = Container(arrayListOf(container1, Figure((ids++).toString()), Figure((ids++).toString())))
    val container3 = Container(arrayListOf(Figure((ids++).toString()), Figure((ids++).toString())))
    val scene = Container(arrayListOf(container2, container3, Figure((ids++).toString())))

    println("Инвертируем объекты сцены")
    scene.invert(0)
    println("Двигаем объекты сцены")
    scene.move(0)

    val container4 = Container(arrayListOf(Figure((ids++).toString()), Figure(ids.toString())))
    scene.add(container4)
    println("\n\nДвигаем объекты сцены")
    scene.move(0)
}