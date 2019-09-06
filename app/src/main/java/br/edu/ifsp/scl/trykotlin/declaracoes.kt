package br.edu.ifsp.scl.trykotlin
fun  main(args: Array<String>){
    // mutaveis  -- variavles - var

    var frase: String = "Hello World"
    println(frase)

    // imprimir com string template
    println("$frase")

    // alterando valor da variavel
    frase = "Mudou frase"

    println("${frase}")

    // imprimir com chamada de funcao
    println("Quantidade de chars: ${frase.count()}")


    // imprimir com propriedade (get)
    println("Quantidade de chars: ${frase.length}")

    // imutavel values - val
}
