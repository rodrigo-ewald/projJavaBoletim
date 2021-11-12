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
public class Professor {

    private int idProfessor;
    private String nomeProfessor;
    private String cpfProfessor;
    private int tipoUsuario;

    /**
     * @return the idProfessor
     */
    public int getIdProfessor() {
        return idProfessor;
    }

    /**
     * @param idProfessor the idProfessor to set
     */
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    /**
     * @return the nomeProfessor
     */
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    /**
     * @param nomeProfessor the nomeProfessor to set
     */
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    /**
     * @return the cpfProfessor
     */
    public String getCpfProfessor() {
        return cpfProfessor;
    }

    /**
     * @param cpfProfessor the cpfProfessor to set
     */
    public void setCpfProfessor(String cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }

    /**
     * @return the tipoUsuario
     */
    public int getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
