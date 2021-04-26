fun testaCopia() {
    val nomes = BancoDeNomes()
    nomes.publicos.add("Joana")
    println(nomes.publicos)

    nomes.adiciona("Maria", "Carla")
    println(nomes.privados)

    val maisNomes = BancoDeNomes()
    println(maisNomes.privados)

    var copiaNomes: MutableList<String> = maisNomes.privados as MutableList<String>
    maisNomes.adiciona("Cecilia")
    println(copiaNomes)
    println(maisNomes.privados)
}