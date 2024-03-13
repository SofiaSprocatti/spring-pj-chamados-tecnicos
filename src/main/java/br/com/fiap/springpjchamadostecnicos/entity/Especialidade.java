package br.com.fiap.springpjchamadostecnicos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "TB_ESPECIALIDADE")
public class Especialidade {

    @Column (name = "ID_ESPECIALIDADE")
    private Long id;

    @Column (name = "NM_ESPECIALIDADE")
    private String nome;
}
