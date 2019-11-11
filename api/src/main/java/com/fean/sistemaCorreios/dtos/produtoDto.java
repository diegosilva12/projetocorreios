package com.fean.sistemaCorreios.dtos;

import javax.validation.constraints.NotEmpty;

public class produtoDto {

    private Integer id;
    @NotEmpty
    private String nome;
    @NotEmpty
    private  String data_compra;
    private String codigo_rastreio;
    @NotEmpty

    public produtoDto(){

    }

    public produtoDto(Integer id, @NotEmpty String nome,
                      @NotEmpty String data_compra,
                      String codigo_rastreio) {
        this.id = id;
        this.nome = nome;
        this.data_compra = data_compra;
        this.codigo_rastreio = codigo_rastreio;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getData_compra() {return data_compra;}

    public void setData_compra(String data_compra) {this.data_compra = data_compra;}

    public String getCodigo_rastreio() {return codigo_rastreio;}

    public void setCodigo_rastreio(String codigo_rastreio) {this.codigo_rastreio = codigo_rastreio;}
}
