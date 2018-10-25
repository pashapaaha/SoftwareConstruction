package singletonLab
import factoryLab.inputString

fun main(args: Array<String>) {
    var flag = true
    while(flag){
        println("""
        Выберите действие:
        1. Добавить курьера
        2. Вевести список курьеров
        3. Выход
    """.trimIndent())
        when(inputString){
            "1" -> insert()
            "2" -> outPut()
            else -> flag = false
        }
    }
}

fun outPut() {
    CouriersSystem.show()
}

var id = 0

fun insert() {
    println("Введите задание для курьера")
    CouriersSystem.addCourier(Courier(id.toString(), inputString))
    id++
}

