package com.fean.sistemaCorreios.dtos;

import javax.validation.constraints.NotEmpty;

public class UserDto {

    private String id;
    @NotEmpty
    private String nome;
    @NotEmpty
    private String cpf;
    private String data_nascimento;
    private String email;
    private String senha;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String numero;

    public UserDto(){

    }

    public UserDto(String id, @NotEmpty String nome, @NotEmpty
                   String email, String cpf, String data_nascimento,
                   String cep, String logradouro, String bairro, String cidade,
                   String estado, String numero)
    {
        this.id =id;
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.email = email;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getData_nascimento() {return data_nascimento;}

    public void setData_nascimento(String data_nascimento) {this.data_nascimento = data_nascimento;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha; }

    public String getCep() {return cep;}

    public void setCep(String cep) {this.cep = cep;}

    public String getLogradouro() {return logradouro;}

    public void setLogradouro(String logradouro) {this.logradouro = logradouro;}

    public String getBairro() {return bairro;}

    public void setBairro(String bairro) {this.bairro = bairro;}

    public String getCidade() {return cidade;}

    public void setCidade(String cidade) {this.cidade = cidade;}

    public String getEstado() {return estado;}

    public void setEstado(String estado) {this.estado = estado;}

    public String getNumero() {return numero;}

    public void setNumero(String numero) {this.numero = numero;}
}
