package factoryLab

abstract class GameAccount{
    abstract fun createHero(): Hero
}

class OrkAccount: GameAccount(){
    override fun createHero() = OrkHero()
}

class HumanAccount: GameAccount(){
    override fun createHero() = HumanHero()
}

class ElfAccount: GameAccount(){
    override fun createHero() = ElfHero()
}
