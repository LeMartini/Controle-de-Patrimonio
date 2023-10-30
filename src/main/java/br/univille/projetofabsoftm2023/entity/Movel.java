package br.univille.projetofabsoftm2023.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Movel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idMovel;
    private String nrSerie;
    private String forma;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date data;
    private String fornecedor;
    private String nrNota;
    private int vidaUtilMeses;

    public long getIdMovel() {
        return idMovel;
    }

    public void setIdMovel(long idMovel) {
        this.idMovel = idMovel;
    }

    public String getNrSerie() {
        return nrSerie;
    }

    public void setNrSerie(String nrSerie) {
        this.nrSerie = nrSerie;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNrNota() {
        return nrNota;
    }

    public void setNrNota(String nrNota) {
        this.nrNota = nrNota;
    }

    public int getVidaUtilMeses() {
        return vidaUtilMeses;
    }

    public void setVidaUtilMeses(int vidaUtilMeses) {
        this.vidaUtilMeses = vidaUtilMeses;
    }

}
