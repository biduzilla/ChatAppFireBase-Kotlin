package br.com.alura.ceep.webClient

import retrofit2.Retrofit

class RetrofitInicializador {

    val retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:8080/")
        .build()
}