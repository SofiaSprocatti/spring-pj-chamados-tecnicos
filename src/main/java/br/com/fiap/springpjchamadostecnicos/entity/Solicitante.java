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
@Table(name = "TB_SOLICITANTE")
public class Solicitante {

    @Column (name = "ID_SOLICITANTE")
    private Long id;

    @Column (name = "NM_SOLICITANTE")
    private String nome;
}
