/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author rodri
 */
public class Disciplina {
    
    private int codigoDisciplina;
    private int matriculaAluno;
    private double media;
    private int cargaHoraria;
    private double primeiraNota;
    private double segundaNota;
    private int etapa;
    private int numeroFaltas;

    /**
     * @return the codigoDisciplina
     */
    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    /**
     * @param codigoDisciplina the codigoDisciplina to set
     */
    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    /**
     * @return the matriculaAluno
     */
    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    /**
     * @param matriculaAluno the matriculaAluno to set
     */
    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the primeiraNota
     */
    public double getPrimeiraNota() {
        return primeiraNota;
    }

    /**
     * @param primeiraNota the primeiraNota to set
     */
    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    /**
     * @return the segundaNota
     */
    public double getSegundaNota() {
        return segundaNota;
    }

    /**
     * @param segundaNota the segundaNota to set
     */
    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    /**
     * @return the etapa
     */
    public int getEtapa() {
        return etapa;
    }

    /**
     * @param etapa the etapa to set
     */
    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    /**
     * @return the numeroFaltas
     */
    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    /**
     * @param numeroFaltas the numeroFaltas to set
     */
    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }

}
