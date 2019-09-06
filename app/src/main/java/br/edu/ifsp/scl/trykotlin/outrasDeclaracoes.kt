package br.edu.ifsp.scl.trykotlin

fun main(args: Array<String>){


    //string explicito
    var nome: String = "Saulo"

    // string implicito
    var sobrenome = "Alves"

    // inicializacao tardia
    var nomeMeio: String

    nomeMeio = "Eduardo"

    val altura: Float = 1.74f

    //inteiro
    val idade: Int = 37

    // casting (tudo em kotlin é objeto
    var peso : Double = 77.toDouble() // => 72.0

    println("Nome: ${nome} ${nomeMeio} ${sobrenome} \n Idade:${idade} Altura:${altura} Peso:${peso}")

}