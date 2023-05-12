package br.com.alura.ceep.webClient

import android.util.Log
import br.com.alura.ceep.model.Nota
import br.com.alura.ceep.webClient.services.NotasService

class NotaWebClient {
    private val notaService: NotasService = RetrofitInicializador().notaService

    suspend fun notaBuscaTodas(): List<Nota>? {
        return try {
            val notasResposta = notaService.buscaTodasCoroutine()
            notasResposta.map { notaResposta ->
                notaResposta.nota
            }
        } catch (e: Exception) {
            Log.e("infoteste", "notaBuscaTodas: ", e)
            null
        }

    }
}