package com.knasel.app.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "usuarios")
data class Usuario(
    @Id @GeneratedValue
    @Column(name = "id_usuario")
    var idUsuario: Long,
    var login: String,
    var nome: String,
    var senha: String,
    var isAtivo: Boolean
) : Serializable {
    constructor():this(0,"","","",false)
}