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
@Table(name = "projects")
public class Projects {


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Boolean completed;

    @JoinColumn(name = "projects_team")
    private Team team;

}
