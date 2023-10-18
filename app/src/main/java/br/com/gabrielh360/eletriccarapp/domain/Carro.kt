package br.com.gabrielh360.eletriccarapp.domain

data class Carro (
    val id: Int,
    val preco: String,
    val bateria: String,
    val potencia: String,
    val recarga: String,
    val urlPhoto: String,
    var isFavorite: Boolean
)