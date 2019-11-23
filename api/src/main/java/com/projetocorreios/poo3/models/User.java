package com.projetocorreios.poo3.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    private Long id;
    private String nome;
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
    private List<Produto> produto;

    public User(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() { return id; }

    @Column(nullable = false)
    public String getNome() { return nome; }

    @Column(unique = true, nullable = false)
    public String getEmail() { return email; }

    public String getSenha() { return senha; }

//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false)

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<Produto> getProduto() { return produto; }

    public void setId(Long id) {this.id = id;}

    public void setNome(String nome) {this.nome = nome;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public void setData_nascimento(String data_nascimento) {this.data_nascimento = data_nascimento;}

    public void setEmail(String email) {this.email = email;}

    public void setSenha(String senha) {this.senha = senha;}

    public void setCep(String cep) {this.cep = cep;}

    public void setLogradouro(String logradouro) {this.logradouro = logradouro;}

    public void setBairro(String bairro) {this.bairro = bairro;}

    public void setCidade(String cidade) {this.cidade = cidade;}

    public void setEstado(String estado) {this.estado = estado;}

    public void setNumero(String numero) {this.numero = numero;}

    public void setProduto(List<Produto> produto) {this.produto = produto;}
}
