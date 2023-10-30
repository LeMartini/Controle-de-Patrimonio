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
public class Bem {
    /*
     * @Id
     * 
     * @GeneratedValue(strategy = GenerationType.IDENTITY)
     * private int idBem;
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBem;

    private String tpBem;
    private String nmMarca;
    private String nmModelo;
    private String nmItem;
    private String estadoConservacao;
    private String localInicial;
    private String localAtual;
    private String formaAquisicao;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtDepreciacao;
    private float percentualDepreciacao;
    private String situacaoBem;

    public Long getIdBem() {
        return idBem;
    }

    public void setIdBem(Long idBem) {
        this.idBem = idBem;
    }

    public String getTpBem() {
        return tpBem;
    }

    public void setTpBem(String tpBem) {
        this.tpBem = tpBem;
    }

    public String getNmMarca() {
        return nmMarca;
    }

    public void setNmMarca(String nmMarca) {
        this.nmMarca = nmMarca;
    }

    public String getNmModelo() {
        return nmModelo;
    }

    public void setNmModelo(String nmModelo) {
        this.nmModelo = nmModelo;
    }

    public String getNmItem() {
        return nmItem;
    }

    public void setNmItem(String nmItem) {
        this.nmItem = nmItem;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public String getLocalInicial() {
        return localInicial;
    }

    public void setLocalInicial(String localInicial) {
        this.localInicial = localInicial;
    }

    public String getLocalAtual() {
        return localAtual;
    }

    public void setLocalAtual(String localAtual) {
        this.localAtual = localAtual;
    }

    public String getFormaAquisicao() {
        return formaAquisicao;
    }

    public void setFormaAquisicao(String formaAquisicao) {
        this.formaAquisicao = formaAquisicao;
    }

    public Date getDtDepreciacao() {
        return dtDepreciacao;
    }

    public void setDtDepreciacao(Date dtDepreciacao) {
        this.dtDepreciacao = dtDepreciacao;
    }

    public float getPercentualDepreciacao() {
        return percentualDepreciacao;
    }

    public void setPercentualDepreciacao(float percentualDepreciacao) {
        this.percentualDepreciacao = percentualDepreciacao;
    }

    public String getSituacaoBem() {
        return situacaoBem;
    }

    public void setSituacaoBem(String situacaoBem) {
        this.situacaoBem = situacaoBem;
    }

}