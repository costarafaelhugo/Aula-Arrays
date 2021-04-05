fun main() {
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20


    val idades : IntArray= intArrayOf (25,19,33,20,55)

    var maiorIdade=Int.MIN_VALUE
    for (idade in idades){
        if(idade>maiorIdade){
            maiorIdade=idade
        }
    }
    println(maiorIdade)


    var menorIdade= Int.MAX_VALUE
    idades.forEach { idade->
        if (idade<menorIdade){
            menorIdade=idade
        }
    }
    println(menorIdade)
}


