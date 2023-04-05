package br.com.alura.orgs.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.alura.orgs.model.Usuario
import kotlinx.coroutines.flow.Flow

@Dao
interface UsuarioDao {

    @Insert
    suspend fun salvar(usuario: Usuario)

    @Query("SELECT * FROM Usuario WHERE id = :usuarioId AND senha=:senha")
    suspend fun auth(usuarioId: String, senha: String): Usuario?

    @Query("SELECT * FROM Usuario WHERE id = :usuarioId")
    fun buscaPorId(usuarioId: String):Flow<Usuario>
}