package com.knasel.app.service

import com.knasel.app.model.Usuario
import java.util.*


interface UsuarioService {
    fun createUsuario(usuario: Usuario):Optional<Usuario>
    fun updateUsuario(id: Long, usuario: Usuario):Optional<Usuario>
    fun deleteUsuario(id: Long):Optional<Usuario>
    fun findAll(): MutableList<Usuario>

}