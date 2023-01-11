package br.com.ada.adm.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Despesas")
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fornecedor;
    private String catergoria;
    private String numeroNF;
    private Double valorNF;
    private LocalDate dataVencimento;
    private Boolean pago;

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCatergoria() {
        return catergoria;
    }

    public void setCatergoria(String catergoria) {
        this.catergoria = catergoria;
    }

    public String getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(String numeroNF) {
        this.numeroNF = numeroNF;
    }

    public Double getValorNF() {
        return valorNF;
    }

    public void setValorNF(Double valorNF) {
        this.valorNF = valorNF;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }
}
