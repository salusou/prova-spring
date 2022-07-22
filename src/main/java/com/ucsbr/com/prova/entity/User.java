package com.ucsbr.com.prova.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "usuario")
@Data
public class User implements Serializable {

  private static final Long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String nome;

  @Column(nullable = false)
  private String login;

  @Column(nullable = false)
  private String email;

  @Column(nullable = false)
  private String password;
}
