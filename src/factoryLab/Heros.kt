package factoryLab

open abstract class Hero {
    public var ability: Ability? = null
    abstract fun act()
}


class OrkHero: Hero(){

    override fun act() {
        print("Орк ${ability?.getAction()}")

    }
}

class HumanHero: Hero(){
    override fun act() {
        println("Человек ${ability?.getAction()}")
        ability?.getAction()
    }
}

class ElfHero: Hero(){
    override fun act() {
        println("Эльф ${ability?.getAction()}")
        ability?.getAction()
    }
}