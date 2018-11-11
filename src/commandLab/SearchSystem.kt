package commandLab

class SearchSystem{
    var addInfoListener: Command? = null
    var searchInfoListener: Command? = null

    fun add(){
        addInfoListener?.execute()
    }

    fun search(){
        searchInfoListener?.execute()
    }
}