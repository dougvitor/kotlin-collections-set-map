fun testaCollection() {
    val nomes: Collection<String> = listOf("Douglas", "França", "Silva", "Ana")
    println(nomes.contains("Douglas"))
    for (nome in nomes.iterator()) println(nome)

    val numbers = mutableListOf("one", "four", "four")
    val mutableListIterator = numbers.listIterator()
    mutableListIterator.next()
    mutableListIterator.add("two")
    mutableListIterator.next()
    mutableListIterator.set("three")
    println(numbers)

    val listIterator = numbers.listIterator()
    while (listIterator.hasNext()) listIterator.next()
    println("Iteração reversa:")
    while (listIterator.hasPrevious()) {
        print("Index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }
}