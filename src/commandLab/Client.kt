package commandLab

fun main(args: Array<String>) {
    val searchSystem = SearchSystem()
    searchSystem.addInfoListener = object :Command{
        override fun execute() {
            println("Информация была добавлена")
        }
    }

    searchSystem.searchInfoListener = object: Command{
        override fun execute() {
            println("Выполняется поиск...")
        }
    }

    searchSystem.add()
    searchSystem.search()
}