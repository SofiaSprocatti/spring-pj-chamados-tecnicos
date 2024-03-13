package br.com.fiap.springpjchamadostecnicos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "TB_OCORRENCIA")
public class Ocorrencia {

    @Column (name = "ID_OCORRENCIA")
    private Long id;

    private String descricao;

    private LocalDateTime data;

}

