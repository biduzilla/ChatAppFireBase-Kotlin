package br.com.alura.ceep.webClient

import android.util.Log
import br.com.alura.ceep.model.Nota

class NotaWebClient {
    suspend fun notaBuscaTodas(): List<Nota> {
        val notasResposta = RetrofitInicializador().notaService.buscaTodasCoroutine()
        return notasResposta.map { notaResposta ->
            notaResposta.nota
        }

    }
}