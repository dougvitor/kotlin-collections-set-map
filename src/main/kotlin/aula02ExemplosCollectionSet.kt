fun main(){

    val assistiramCursoAndroidList = listOf("Marta", "Cassandra", "Edu", "Henrique")
    val assistiramCursoKotlinList = listOf("Douglas", "Cassandra", "Matheus", "Edu", "Juma")
    val assistiramAmbosList = assistiramCursoAndroidList + assistiramCursoKotlinList
    println(assistiramAmbosList)
    println(assistiramAmbosList.distinct())

    val assistiramCursoAndroidSet:MutableSet<String> = mutableSetOf("Marta", "Cassandra", "Edu", "Henrique")
    val assistiramCursoKotlinSet: Set<String> = mutableSetOf("Douglas", "Cassandra", "Matheus", "Edu", "Juma")
    val assistiramAmbosSet: Set<String> = assistiramCursoAndroidSet.plus(assistiramCursoKotlinSet) // + operator overloading
    println(assistiramCursoAndroidSet.add("Marta"))
    println(assistiramCursoAndroidSet.add("Ana"))
    println(assistiramAmbosSet)

    println(assistiramCursoAndroidSet union assistiramCursoKotlinSet)
    println(assistiramCursoKotlinSet subtract  assistiramCursoAndroidSet) // - operator overloading
    println(assistiramCursoAndroidSet intersect  assistiramCursoKotlinSet)

    val copiaToList: MutableList<String> = assistiramCursoKotlinSet.toMutableList()
    copiaToList.add("Juma")
    println(copiaToList)
    println(copiaToList.toSet())

}