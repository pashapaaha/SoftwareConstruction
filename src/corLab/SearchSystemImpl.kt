package corLab

class SocialSearchSystem(priority: Int): SearchSystem(priority){
    override fun search(person: Person) {
        println("${person.name}, вернись домой!")
    }
}


class PoliceSearchSystem(priority: Int): SearchSystem(priority){
    override fun search(person: Person) {
        println("Полиция разыскивает человека по имени ${person.name}")
    }
}


class MCSSearchSystem(priority: Int): SearchSystem(priority){
    override fun search(person: Person) {
        println("Приложены все усилия МЧС для поиска ${person.name}.")
    }
}


class ExtraordinarySearchSystem(priority: Int): SearchSystem(priority){
    override fun search(person: Person) {
        println("Имя: ${person.name}. Статус: Срочно разыскивается!")
    }
}