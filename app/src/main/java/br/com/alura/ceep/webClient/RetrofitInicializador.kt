package br.com.alura.ceep.webClient

import br.com.alura.ceep.webClient.services.NotasService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitInicializador {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://10.61.104.110:8080/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val notaService:NotasService = retrofit.create(NotasService::class.java)
}