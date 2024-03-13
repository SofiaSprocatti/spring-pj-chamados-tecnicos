package br.com.fiap.springpjchamadostecnicos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "TB_TELEFONE")
public class Telefone {

    @Column (name = "ID_TELEFONE")
    private Long id;

    private String ddi;

    private String ddd;

    private Long numero;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "SOLICITANTE",
            referencedColumnName = "ID_SOLICITANTE_TELEFONE",
            foreignKey = @ForeignKey(
                    name = "FK_SOLICITANTE_TELEFONE"
            )
    )
    private Solicitante solicitante;

}
