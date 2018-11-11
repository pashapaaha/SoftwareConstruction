package corLab

fun main(args: Array<String>) {
    val social = SocialSearchSystem(Inequality.LOW_IMPORTANCE)
    val police = PoliceSearchSystem(Inequality.MIDDLE_IMPORTANCE)
    val mchs = MCSSearchSystem(Inequality.HIGH_IMPORTANCE)
    val extra = ExtraordinarySearchSystem(Inequality.VERY_IMPORTANCE)

    social.nextInstance = police
    police.nextInstance = mchs
    mchs.nextInstance = extra

    social.searchPeople(Person("Костя", 3))
    println()
    social.searchPeople(Person("Саша", 2))
    println()
    social.searchPeople(Person("Даша", 1))
    println()
    social.searchPeople(Person("Валера", 0))
}