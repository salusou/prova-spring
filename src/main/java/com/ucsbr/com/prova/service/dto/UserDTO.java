package com.ucsbr.com.prova.service.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class UserDTO implements Serializable {

  private static final Long serialVersionUID = 1L;

  @ApiModelProperty(value = "Código do usuário", example = "1")
  private Long id;

  @ApiModelProperty(value = "Nome do Usuário", example = "Jonas Doe", required = false)
  private String nome;

  @ApiModelProperty(value = "Nome do Login", example = "jonas", required = true)
  @NotNull
  private String login;

  @ApiModelProperty(value = "E-mail", example = "jonas@net.com", required = true)
  @Email(message = "Este campo precisa receber um campo de e-mail")
  private String email;

  @ApiModelProperty(value = "Password", example = "1234", required = true)
  @Min(value = 4, message = "Mínimo 4 caracteres para senha")
  @NotNull
  private String password;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
