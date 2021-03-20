package com.knasel.app.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "usuarios_observacoes_fichas")
data class UsuarioObservacaoFicha (
    @Id @GeneratedValue
    @Column(name = "id_usuario_observacao_ficha")
    var id: Long,
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    var usuario: Usuario,
    @ManyToOne
    @JoinColumn(name = "id_observacao")
    var observacao: Observacao,
    @ManyToOne
    @JoinColumn(name = "id_ficha")
    var fichaDeControle: FichaDeControle
        ): Serializable{
            constructor():this(0, Usuario(), Observacao(),FichaDeControle())
}