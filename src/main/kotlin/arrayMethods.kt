fun main() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5.000, 8000.0, 10.000)

    val aumento = 1.1

    for (salario in salarios) {
        salario * aumento
    }


}