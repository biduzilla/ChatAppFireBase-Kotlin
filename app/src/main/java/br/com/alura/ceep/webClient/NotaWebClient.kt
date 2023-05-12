package br.com.alura.ceep.webClient

import android.util.Log
import br.com.alura.ceep.model.Nota
import br.com.alura.ceep.webClient.model.NotaRequisicao
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

    suspend fun salvar(nota: Nota) {
        try {
            val resposta = notaService.salvar(
                nota.id,
                NotaRequisicao(titulo = nota.titulo, descricao = nota.descricao, imagem = nota.imagem?:"")
            )

            if (resposta.isSuccessful){
                Log.i("infoteste", "Nota Salva")
            }else{
                Log.i("infoteste", "Nota não Salva")
            }
        } catch (e: Exception) {
            Log.e("infoteste", "Falha ao tentar salvar", e)
            e.printStackTrace()
        }
    }
}