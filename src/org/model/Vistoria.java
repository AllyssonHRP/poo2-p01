package org.model;

import java.util.List;

public class Vistoria {
    private long id;
    private float valormanutencao;
    private List<Pagamento> pagamento;
    private List<Veiculo> veiculos;

    public Vistoria() {
        this.id = 1;
        this.valormanutencao = "";
        this.pagamento = 0;
        this.veiculos = veiculos;
    }

    public Vistoria(long id, float valormanutencao, List<Pagamento> pagamento, List<Veiculo> veiculos) {
        this.id = id;
        this.valormanutencao = valormanutencao;
        this.pagamento = pagamento;
        this.veiculos = veiculos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValormanutencao() {
        return valormanutencao;
    }

    public void setValormanutencao(float valormanutencao) {
        this.valormanutencao = valormanutencao;
    }

    public List<Pagamento> getPagamento() {
        return pagamento;
    }

    public void setPagamento(List<Pagamento> pagamento) {
        this.pagamento = pagamento;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
