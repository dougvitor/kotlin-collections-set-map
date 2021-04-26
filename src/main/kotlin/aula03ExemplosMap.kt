fun main(){

    val pedidos: Map<Int, Double> = mapOf(Pair(1, 20.0), Pair(2, 40.0), 3 to 60.0)
    println(pedidos)

    val pedido: Double? = pedidos[3]

    pedido?.let {
        println("Valor $it")
    }

    for(pedidoMapeado:Map.Entry<Int, Double> in pedidos){
        println("Pedido número ${pedidoMapeado.key} e valor ${pedidoMapeado.value}")
    }

    val pedidosMutaveis: MutableMap<Int, Double> = pedidos.toMutableMap()
    println(pedidosMutaveis)

    pedidosMutaveis.put(4, 200.0)
    println(pedidosMutaveis)

    pedidosMutaveis.put(4, 600.0)
    println(pedidosMutaveis)

    pedidosMutaveis.putIfAbsent(4, 300.0)
    println(pedidosMutaveis)

    pedidosMutaveis[5] = 900.0
    println(pedidosMutaveis)

    pedidosMutaveis[5] = 1500.0
    println(pedidosMutaveis)

    println(pedidosMutaveis.remove(5))
    println(pedidosMutaveis)

    println(pedidosMutaveis.remove(5))
    println(pedidosMutaveis)

    pedidosMutaveis.remove(4, 500.0)
    println(pedidosMutaveis)

    pedidosMutaveis.remove(4, 600.0)
    println(pedidosMutaveis)


}