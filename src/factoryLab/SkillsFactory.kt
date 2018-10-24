package factoryLab

interface AbilityFactory{
    fun createAbility(): Ability
}

class MagicAbilityFactory: AbilityFactory{
    override fun createAbility() = Magic()
}

class ShootingAbilityFactory: AbilityFactory{
    override fun createAbility() = Shooting()
}

class JumpingAbilityFactory: AbilityFactory{
    override fun createAbility() = Jumping()
}