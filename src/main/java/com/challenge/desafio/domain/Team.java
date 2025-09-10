package com.challenge.desafio.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "team")
public class Team extends Domain {

    @Column(nullable = false)
    private String name;

    private Boolean leader;

    @Column(nullable = false)
    private String projects;

    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
