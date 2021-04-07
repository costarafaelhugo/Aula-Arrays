fun main() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5.000, 8000.0, 10.000)

    val aumento = 1.1
//    var indice = 0
//    for (salario in salarios) {
//        salarios[indice] = salario * aumento
//        indice++
//    }
//    println(salarios.contentToString())

    for (indice in salarios.indices){
        salarios[indice]= salarios[indice]*aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed{ i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}