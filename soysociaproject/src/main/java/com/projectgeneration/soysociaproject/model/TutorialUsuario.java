package com.projectgeneration.soysociaproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name ="tutorial_usuario")

public class TutorialUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tutorialusuario_id;
    private Long usuario_id;
    private Long tutorial_id;


}
