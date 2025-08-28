package org.model;

import java.util.Date;
import java.util.List;

public class Locacao {
    private long id;
    private List<Veiculo> veiculos;
    private List<Modelo> modelos;
    private float valorlocacao;
    private Date datalocacao;
    private Date datalimite;
    private int qtdveiculo;

    public Locacao() {
        this.id = 1;
        this.veiculos = veiculos;
        this.modelos = modelos;
        this.valorlocacao = valorlocacao;
        this.datalocacao = datalocacao;
        this.datalimite = datalimite;
        this.qtdveiculo = qtdveiculo;
    }


    public Locacao(long id, List<Veiculo> veiculos, List<Modelo> modelos, float valorlocacao, Date datalocacao, Date datalimite, int qtdveiculo) {
        this.id = id;
        this.veiculos = veiculos;
        this.modelos = modelos;
        this.valorlocacao = valorlocacao;
        this.datalocacao = datalocacao;
        this.datalimite = datalimite;
        this.qtdveiculo = qtdveiculo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
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

    public Date getDatalocacao() {
        return datalocacao;
    }

    public void setDatalocacao(Date datalocacao) {
        this.datalocacao = datalocacao;
    }

    public Date getDatalimite() {
        return datalimite;
    }

    public void setDatalimite(Date datalimite) {
        this.datalimite = datalimite;
    }

    public int getQtdveiculo() {
        return qtdveiculo;
    }

    public void setQtdveiculo(int qtdveiculo) {
        this.qtdveiculo = qtdveiculo;
    }
}

