package singletonLab

object CouriersSystem{
    private const val maxCount = 15
    private var count = 0
    private val couriersList = mutableListOf<Courier>()
    fun addCourier(courier: Courier){
        if(count < maxCount)
            couriersList.add(courier)
        count++
    }
    fun show(){
        println("Список курьеров и их текущие задания:")
        for((index, item) in couriersList.withIndex()){
            println("${index+1} -> Курьер #${item.id} на задании ${item.task}")
        }
    }
}

class Courier(val id: String, val task: String)