package br.com.alura.ceep.webClient.services

import br.com.alura.ceep.webClient.model.NotaResposta
import retrofit2.Call
import retrofit2.http.GET

interface NotasService {

    @GET("/notas")
    fun buscaTodas(): Call<List<NotaResposta>>
}