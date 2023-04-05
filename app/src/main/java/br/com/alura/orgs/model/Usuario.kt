package br.com.alura.orgs.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
data class Usuario(
    @PrimaryKey
    val id: String,
    val nome: String,
    val senha: String
)
