package org.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Categoria {

    private long id;
    private String descricao;
    private List<Modelo> modelos;
    private float valorlocacao;
   //**********************************************************************//
    //CONSTRUTORES
    public Categoria(){
        this.id = 0;
        this.descricao = "";
        this.modelos = new ArrayList<>();
        this.valorlocacao = 0;
    }

    public Categoria(long id, String descricao, List<Modelo> modelos, float valorlocacao) {
        this.id = id;
        this.descricao = descricao;
        this.modelos = modelos;
        this.valorlocacao = valorlocacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public float getValorlocacao() {
        return valorlocacao;
    }

    public void setValorlocacao(float valorlocacao) {
        this.valorlocacao = valorlocacao;
    }
}
