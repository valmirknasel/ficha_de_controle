package com.knasel.app.repository

import com.knasel.app.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UsuarioRepository: JpaRepository<Usuario,Long> {
    fun findUsuarioByLogin(login: String)

    /* @Query("from Usuario where nome like nome")
    fun findUsuarioByNome(nome: String): Optional<Usuario>*/
}