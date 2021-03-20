package com.knasel.app.controller

import com.knasel.app.model.Usuario
import com.knasel.app.repository.UsuarioRepository
import com.knasel.app.service.UsuarioService
import com.knasel.app.service.UsuarioServiceImpl
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView

@RestController
@RequestMapping("/usuarios")
class UsuarioController(val repository: UsuarioRepository) {
    /* val logger:Logger = LoggerFactory.getLogger(javaClass) */
    val usuarioService = UsuarioServiceImpl(repository)

    @PostMapping("/cadastrar")
    fun createUsuario(@RequestBody usuario: Usuario) = ResponseEntity.ok(usuarioService.createUsuario(usuario))

    /* Redireciona o resultado para a view usuarioLista.html e passa o parametro listaDeUsuarios
    * TODO("Separar o mapeamento que redireciona para uma view do mapeamento que retorna o JSON") */
    @GetMapping("/view")
    fun findAll(): ModelAndView {
        val lista = usuarioService.findAll()
        ResponseEntity.ok(lista)
        return ModelAndView("usuarioLista").addObject("listaDeUsuarios", lista)

    }

    /* Retorna um JSON contendo a lista de usuarios, através da api REST*/
    @GetMapping("/api")
    fun findAllApi() = usuarioService.findAll()

}