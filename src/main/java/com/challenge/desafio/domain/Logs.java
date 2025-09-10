package com.challenge.desafio.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "logs")
public class Logs extends Domain{


    @Column(nullable = false)
    private Date data;

    @Column(nullable = false)
    private String action;

    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
