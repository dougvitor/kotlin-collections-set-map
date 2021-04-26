fun main(){

    val pedidos: MutableMap<Int?, Double?> = mutableMapOf(
        Pair(1, 30.0),
        Pair(2, 50.0),
        Pair(3, 40.0),
        4 to null,
        5 to 1000.0,
        null to 300.0,
        null to 500.0
    )

    println(pedidos)
    println(pedidos.getValue(5))
    println(pedidos.getValue(4))
    println(pedidos.getValue(null))

    println(pedidos.getOrElse(6) {"Chave não existe!"})

    println(pedidos.getOrDefault(6, -1.0))

   pedidos.keys.forEach{
       println(it)
   }

    pedidos.values.forEach {
        println(it)
    }

    val chavesImparesEValoresMaioresDe35 = pedidos.filter { (k, v) ->
        v != null && k != null && k % 2 == 1 && v > 35.0
    }
    println(chavesImparesEValoresMaioresDe35)

    println(pedidos.filterKeys {k -> k != null && k % 2 == 1})

    println(pedidos.filterValues { v -> v != null && v > 35 })

    println(pedidos + Pair(6, 2000.0))
    println(pedidos + mapOf(7 to 6800.0))
    println(pedidos + (8 to 12000.0))

    println(pedidos - null)
    println(pedidos - 5)

    pedidos.putAll(listOf(6 to 50.0, 7 to 12.0, Pair(8,35.0)))
    println(pedidos)
    pedidos.putAll(mapOf(6 to 27.0, 7 to 29.0, 8 to 15.0))
    println(pedidos)

    pedidos += setOf(9 to 35.0, 10 to 46.0)
    println(pedidos)

    pedidos.keys.remove(9.0.toInt())
    pedidos.values.remove(46.0)
    println(pedidos)

    pedidos -= setOf(5 , null)
    println(pedidos)


}