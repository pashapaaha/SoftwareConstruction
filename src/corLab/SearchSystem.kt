package corLab

abstract class SearchSystem (private val priority: Int){

    var nextInstance: SearchSystem? = null

    fun searchPeople(person: Person){
        if(this.priority <= person.importance){
            search(person)
        }
        nextInstance?.searchPeople(person)
    }

    protected abstract fun search(person: Person)
}