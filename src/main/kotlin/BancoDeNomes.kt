class BancoDeNomes{

    val publicos: MutableList<String> = mutableListOf<String>()

    companion object{
        private val elementos: MutableList<String> = mutableListOf<String>()
    }

    val privados: Collection<String> get() = elementos.toList()

    fun adiciona(vararg nomes: String){
        elementos.addAll(nomes)
    }
}