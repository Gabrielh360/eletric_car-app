package br.com.gabrielh360.eletriccarapp.data

import br.com.gabrielh360.eletriccarapp.domain.Carro
import retrofit2.Call
import retrofit2.http.GET

interface CarsApi {

    @GET("cars.json")
    fun getAllCars() : Call<List<Carro>>

}