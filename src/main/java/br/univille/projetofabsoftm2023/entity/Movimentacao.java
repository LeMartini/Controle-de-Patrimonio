package br.univille.projetofabsoftm2023.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idMovimentacao;
    private Date dtMovimentacao;
    private String tpMovimentacao;

    public long getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(long idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public Date getDtMovimentacao() {
        return dtMovimentacao;
    }

    public void setDtMovimentacao(Date dtMovimentacao) {
        this.dtMovimentacao = dtMovimentacao;
    }

    public String getTpMovimentacao() {
        return tpMovimentacao;
    }

    public void setTpMovimentacao(String tpMovimentacao) {
        this.tpMovimentacao = tpMovimentacao;
    }

}
