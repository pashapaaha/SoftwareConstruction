package factoryLab

import java.util.*

val inputString: String
    get(){
        val sc = Scanner(System.`in`)
        return sc.nextLine()
    }

fun main(args: Array<String>) {

    val hero = getHero()
    hero.ability = getAbility()
    hero.act()
}

fun getHero() : Hero{
    println("""
        Выберите расу:
        1. Человек
        2. Орк
        3. Эльф
    """.trimIndent())
    val account = when (inputString){
        "2" -> OrkAccount()
        "3" -> ElfAccount()
        else -> HumanAccount()
    }
    return account.createHero()
}

fun getAbility(): Ability{
    println("""
        Выберите способность героя:
        1. Магия
        2. Стрельба
        3. Ловкость
    """.trimIndent())
    val abilityFactory = when(inputString){
        "2" -> ShootingAbilityFactory()
        "3" -> JumpingAbilityFactory()
        else -> MagicAbilityFactory()
    }
    return abilityFactory.createAbility()
}