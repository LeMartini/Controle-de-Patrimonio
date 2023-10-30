package br.univille.projetofabsoftm2023.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idImovel;
    private String nrSerie;
    private String forma;
    private String zona;
    private String matriculaImovel;
    private String localRegistro;
    private String proprietarioAnterior;

    public long getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(long idImovel) {
        this.idImovel = idImovel;
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

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getMatriculaImovel() {
        return matriculaImovel;
    }

    public void setMatriculaImovel(String matriculaImovel) {
        this.matriculaImovel = matriculaImovel;
    }

    public String getLocalRegistro() {
        return localRegistro;
    }

    public void setLocalRegistro(String localRegistro) {
        this.localRegistro = localRegistro;
    }

    public String getProprietariooAnterior() {
        return proprietarioAnterior;
    }

    public void setProprietariooAnterior(String proprietariooAnterior) {
        this.proprietarioAnterior = proprietariooAnterior;
    }

}
