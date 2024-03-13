package br.com.fiap.springpjchamadostecnicos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.LongSummaryStatistics;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "TB_TECNICO")
public class Tecnico {

    @Column (name = "ID_TECNICO")
    private Long id;

    @Column (name = "NM_TECNICO")
    private String nome;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "TB_ESPECIALIDADES_CHAMADOS",
            joinColumns = {
                    @JoinColumn(
                            name = "TECNICO",
                            referencedColumnName = "ID_TECNICO",
                            foreignKey = @ForeignKey(
                                    name = "FK_TECNICO_ESPECIALIDADE"
                            )
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "ESPECIALIDADE",
                            referencedColumnName = "ID_ESPECIALIDADE",
                            foreignKey = @ForeignKey(
                                    name = "FK_ESPECIALIDADE_TECNICO"
                            )
                    )
            }
    )
    private Set<Especialidade> especialidadeChamados = new LinkedHashSet<>();

}
