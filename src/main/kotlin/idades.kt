fun main() {
   val idades: IntArray= intArrayOf(10,12,18,33,40,67)
    val maiorIdade = idades.maxOrNull()
    val menorIdade = idades.minOrNull()
    println("maior idade: $maiorIdade")
    println("menor idade: $menorIdade")

    val mediaIdades = idades.average()
    println(mediaIdades)

    val todosMaiores = idades.all{it>=18}
    println(todosMaiores)

    val algumMaior = idades.any{it>18}
    println(algumMaior)

    val retornaMaior = idades.filter { it>18 }
    println(retornaMaior)

    val retornaValorEspecifico = idades.find { it==18 }
    println(retornaValorEspecifico)
}