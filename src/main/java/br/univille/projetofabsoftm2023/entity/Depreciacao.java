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
public class Depreciacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDepreciacao;
    private String bemDepreciado;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtDepreciacao;
    private float vlAntesDepreciacao;
    private float vlDepreciado;

    public long getIdDepreciacao() {
        return idDepreciacao;
    }

    public void setIdDepreciacao(long idDepreciacao) {
        this.idDepreciacao = idDepreciacao;
    }

    public String getBemDepreciado() {
        return bemDepreciado;
    }

    public void setBemDepreciado(String bemDepreciado) {
        this.bemDepreciado = bemDepreciado;
    }

    public Date getDtDepreciacao() {
        return dtDepreciacao;
    }

    public void setDtDepreciacao(Date dtDepreciacao) {
        this.dtDepreciacao = dtDepreciacao;
    }

    public float getVlAntesDepreciacao() {
        return vlAntesDepreciacao;
    }

    public void setVlAntesDepreciacao(float vlAntesDepreciacao) {
        this.vlAntesDepreciacao = vlAntesDepreciacao;
    }

    public float getVlDepreciado() {
        return vlDepreciado;
    }

    public void setVlDepreciado(float vlDepreciado) {
        this.vlDepreciado = vlDepreciado;
    }

}
