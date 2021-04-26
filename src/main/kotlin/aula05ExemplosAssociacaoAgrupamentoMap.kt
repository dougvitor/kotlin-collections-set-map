fun main(){

    val pedidos = listOf(
        Pedido(numero = 1, valor = 20.00),
        Pedido(numero = 2, valor = 55.0),
        Pedido(numero = 3, valor = 44.0),
        Pedido(numero = 4, valor = 77.0),
        Pedido(numero = 5, valor = 30.0)
    )
    println(pedidos)

    val pedidosPorNumero: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosPorNumero)
    println(pedidosPorNumero[3])

    val  pedidosPorFrete = pedidos.associateWith { pedido -> pedido.valor > 46.0 }
    println(pedidosPorFrete)
    println(pedidosPorFrete[( Pedido(numero = 4, valor = 77.0))])
    println(pedidosPorFrete.filterValues { v -> v })
    println(pedidosPorFrete.filterValues { v -> !v })

    val pedidosAgrupadosPorFrete:Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido -> pedido.valor > 46.0 }
    println(pedidosAgrupadosPorFrete)
    println(pedidosAgrupadosPorFrete[true])
    println(pedidosAgrupadosPorFrete[false])

    val nomes = setOf("Joana", "Marta", "Marcos", "Rafael", "Monique", "Ana", "Douglas", "Deusa", "Elias", "Dani")

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome -> nome.first().toLowerCase() }

    println(agenda)
    println(agenda['B'])
    agenda['D'.toLowerCase()]?.let { println(it.toSet()) }

    val agendaGrouping: Grouping<String, Char> = nomes.groupingBy { nome -> nome.first() }
    agendaGrouping.sourceIterator().forEach { print("$it ") }
    println("\n${agendaGrouping.eachCount()}")

}


data class Pedido(
    val numero: Int,
    val valor: Double
)