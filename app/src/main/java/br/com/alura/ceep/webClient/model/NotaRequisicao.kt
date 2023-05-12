package br.com.alura.ceep.webClient.model

import br.com.alura.ceep.model.Nota
import java.util.UUID

data class NotaRequisicao(
    val titulo:String,
    val descricao:String,
    val imagem:String,
)