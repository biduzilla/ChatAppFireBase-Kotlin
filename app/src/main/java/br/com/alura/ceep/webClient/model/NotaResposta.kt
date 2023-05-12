package br.com.alura.ceep.webClient.model

import br.com.alura.ceep.model.Nota
import java.util.UUID

data class NotaResposta(
    val id:String?,
    val titulo:String?,
    val descricao:String?,
    val imagem:String?,
){
    val nota: Nota get() = Nota(
        id = id?:UUID.randomUUID().toString(),
        titulo = titulo?:"",
        descricao=descricao?:"",
        imagem=imagem?:"",


    )
}
