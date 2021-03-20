package com.knasel.app.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "identificadores")
data class Identificador(
    @Id @GeneratedValue
    @Column(name = "id_identificador")
    val idIdentificador: Long,
    val numeroDeControle: String,
    @Column(name = "dsc_identificador")
    val descricaoDoIdentificador: String
) : Serializable {
    constructor() : this(0, "", "")
}