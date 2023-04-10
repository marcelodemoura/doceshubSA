package com.apirest.doceshubSA.entity;

import java.io.Serializable;
import java.util.Objects;

public class UserClient implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String empresa;
    private String email;
    private String telefone;

    public UserClient() {
    }

    public UserClient(Long id, String nome, String empresa, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
        this.email = email;
        this.telefone = telefone;
    }

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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserClient that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNome(), that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome());
    }
}
