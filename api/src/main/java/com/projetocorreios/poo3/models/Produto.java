package com.projetocorreios.poo3.models;

import javax.persistence.*;

@Entity
public class Produto {

    private Long id;
    private String nome;
    private String codigo;
    private String data_compra;
    private User user;

    public Produto (){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() { return id; }

    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getData_compra() {return data_compra;}

    public void setData_compra(String data_compra) {this.data_compra = data_compra;}

    @ManyToMany(fetch = FetchType.EAGER)
    public User getUser() {return user;}

    public void setUser(User user) {this.user = user;}
}
