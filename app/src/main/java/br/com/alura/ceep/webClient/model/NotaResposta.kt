package br.com.alura.ceep.webClient.model

import br.com.alura.ceep.model.Nota

data class NotaResposta(
    val id:String?,
    val titulo:String?,
    val descricao:String?,
    val imagem:String?,
){
    val nota: Nota get() = Nota(
        id = 0,
        titulo = titulo?:"",
        descricao=descricao?:"",
        imagem=imagem?:"",


    )
}
