package factoryLab

interface Ability{
    fun getAction(): String
}

class Magic: Ability{
    override fun getAction() = "колдует"
}

class Shooting: Ability{
    override fun getAction() = "стреляет"
}

class Jumping: Ability{
    override fun getAction() = "прыгает"
}