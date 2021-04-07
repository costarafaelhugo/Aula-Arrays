package list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAno = prateleira.organizarPorAnoPublicacao()

    porAno.imprimeComMarcadores()
    porAutor.imprimeComMarcadores()
}