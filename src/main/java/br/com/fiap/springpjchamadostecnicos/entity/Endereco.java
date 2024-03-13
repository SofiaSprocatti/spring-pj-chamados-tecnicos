package br.com.fiap.springpjchamadostecnicos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {

    @Column (name = "ID_ENDERECO")
    private Long id;

    private String numero;

    private String cep;

    private String complemento;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "SOLICITANTE",
            referencedColumnName = "ID_SOLICITANTE_ENDERECO",
            foreignKey = @ForeignKey(
                    name = "FK_SOLICITANTE_ENDERECO"
            )
    )
    private Solicitante solicitante;

}
