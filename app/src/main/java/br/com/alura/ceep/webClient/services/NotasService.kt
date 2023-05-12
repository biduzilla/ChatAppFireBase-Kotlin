package br.com.alura.ceep.webClient.services

import br.com.alura.ceep.webClient.model.NotaRequisicao
import br.com.alura.ceep.webClient.model.NotaResposta
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface NotasService {

    @GET("/notas")
    fun buscaTodas(): Call<List<NotaResposta>>

    @GET("/notas")
    suspend fun buscaTodasCoroutine(): List<NotaResposta>

    @PUT("/notas/{id}")
    suspend fun salvar(@Path("id") id: String, @Body notaRequisicao: NotaRequisicao): Response<NotaResposta>
}