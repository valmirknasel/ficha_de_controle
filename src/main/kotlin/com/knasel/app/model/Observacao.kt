package com.knasel.app.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "observacoes")
data class Observacao(
    @Id @GeneratedValue
    @Column(name = "id_observacao")
    var idObervacao: Long,
    var dataCriacao: String,
    @Column(name = "dsc_observacao")
    var descricaoObservacao: String,
    var isAtiva: Boolean
) : Serializable {
    constructor():this(0,"","",false)
}