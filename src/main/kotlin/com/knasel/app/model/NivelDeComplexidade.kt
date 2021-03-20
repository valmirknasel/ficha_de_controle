package com.knasel.app.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "niveis_de_complexidade")
data class NivelDeComplexidade(
    @Id @GeneratedValue
    @Column(name="id_nivel_complexidade")
    val idNivelComplexidade: Long,
    @Column(name = "dsc_nivel")
    var descricaoNivelDeComplexidade: String
): Serializable {
    constructor():this(0,"")
}