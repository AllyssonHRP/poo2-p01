package org.model;

import java.util.Date;

public class Veiculo {

    private long id;
    private int km;
    private Date anofabricacao;
    private String placa;
    private String chassi;
    private String cor;
    private String renavam;
    private Modelo modelo;
    private Enum status;

    public Veiculo() {
        this.id = 1;
        this.km = 0;
        this.anofabricacao = new Date();
        this.placa = "";
        this.chassi = "";
        this.cor = "";
        this.renavam = "";
        this.modelo = modelo;
        this.status = status;
    }

    public Veiculo(long id, int km, Date anofabricacao, String placa, String chassi, String cor, String renavam, Modelo modelo, Enum status) {
        this.id = id;
        this.km = km;
        this.anofabricacao = anofabricacao;
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.renavam = renavam;
        this.modelo = modelo;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Date getAnofabricacao() {
        return anofabricacao;
    }

    public void setAnofabricacao(Date anofabricacao) {
        this.anofabricacao = anofabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }
}
