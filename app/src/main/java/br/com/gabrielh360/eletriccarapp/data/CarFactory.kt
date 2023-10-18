package br.com.gabrielh360.eletriccarapp.data

import br.com.gabrielh360.eletriccarapp.domain.Carro

object CarFactory {

    val list = listOf(
        Carro(
            id = 1,
            preco = "R$ 300.000.00",
            bateria = "300 kWh",
            potencia = "200 cv",
            recarga = "30 min",
            urlPhoto = "www.google.com.br",
            isFavorite = false
        ),
        Carro(
            id = 2,
            preco = "R$ 200.000.00",
            bateria = "200 kWh",
            potencia = "150 cv",
            recarga = "40 min",
            urlPhoto = "www.google.com.br",
            isFavorite = false
        )
    )
}