package singletonLab

class Courier{
    private constructor()
    lateinit var task: Task
    companion object {
        var curer: Courier? = null
        fun newCurer() = curer ?: Courier()
    }
}

enum class Task{
    DELIVERY_TO_SHOP, DELIVERY_TO_HOUSE, DELIVERY_TO_OFFICE
}

class Task1{
    val taskList: MutableList<Task> = mutableListOf()
//    var cour: Courier =

}