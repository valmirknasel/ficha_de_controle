package com.knasel.app.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "fichas_de_controle")
data class FichaDeControle(
    @Id @GeneratedValue
    @Column(name = "id_ficha")
    var idFicha: Long,
    @OneToOne
    @JoinColumn(name = "id_identificador")
    var identificador: Identificador,
    @Column(name = "data_hora_entrada")
    var dataHoraEntradaNoSetor: String,
    var ordemDePrioridade: Int,
    @OneToOne
    @JoinColumn(name = "id_nivel_complexidade")
    var nivelDeComplexidade: NivelDeComplexidade,
    var isAtendida: Boolean
) : Serializable {
    constructor():this(0,Identificador(),"",0,NivelDeComplexidade(),false)
}