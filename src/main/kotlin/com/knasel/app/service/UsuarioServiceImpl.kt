package com.knasel.app.service

import com.knasel.app.model.Usuario
import com.knasel.app.repository.UsuarioRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioServiceImpl(val repository: UsuarioRepository):UsuarioService {
    val logger: Logger = LoggerFactory.getLogger(javaClass)

    override fun createUsuario(usuario: Usuario): Optional<Usuario> {
        TODO("Not yet implemented")
    }

    override fun updateUsuario(id: Long, usuario: Usuario): Optional<Usuario> {
        TODO("Not yet implemented")
    }

    override fun deleteUsuario(id: Long): Optional<Usuario> {
        TODO("Not yet implemented")
    }

    override fun findAll(): MutableList<Usuario> {
        var data = repository.findAll()
        logger.info("findAll: $data")
        return data
    }


}