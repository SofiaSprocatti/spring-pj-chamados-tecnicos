package br.com.fiap.springpjchamadostecnicos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "TB_CHAMADO")
public class Chamado {

    @Column (name = "ID_CHAMADO")
    private Long id;

    private String titulo;

    private String descricao;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "ESPECIALIDADE",
            referencedColumnName = "ID_ESPECIALIDADE_CHAMADO",
            foreignKey = @ForeignKey(
                    name = "FK_ESPECIALIDADE_CHAMADO"
            )
    )
    private Especialidade especialidade;



    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "STECNICO",
            referencedColumnName = "ID_TECNICO_CHAMADO",
            foreignKey = @ForeignKey(
                    name = "FK_TECNICO_CHAMADO"
            )
    )
    private Tecnico tecnico;



    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "SOLICITANTE",
            referencedColumnName = "ID_SOLICITANTE_CHAMADO",
            foreignKey = @ForeignKey(
                    name = "FK_SOLICITANTE_CHAMADO"
            )
    )
    private Solicitante solicitante;

    private LocalDateTime dataAbertura;
    private LocalDateTime dataPrimeiroAtendimento;
    private LocalDateTime dataEncerramento;

}
