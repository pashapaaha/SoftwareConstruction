package singletonLab

class Cour(val task: Task)

class Singl{
    val maxSize = 10

    private constructor()

    val couriersList: MutableList<Cour> = mutableListOf()

    companion object {

        var couriers: Singl? = null

        fun get(): Singl{
            if(couriers == null)
                couriers = Singl()
            return couriers as Singl
        }

    }
    fun add(item: Cour){
        if(couriersList.size < maxSize)
            couriersList.add(item)
    }
}