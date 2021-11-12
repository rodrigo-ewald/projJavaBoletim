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
public class Admin {
    private String cpfAdmin;
    private String senhaAdmin;
    private int tipoUsuario;
    private int idAdmin;

    /**
     * @return the cpfAdmin
     */
    public String getCpfAdmin() {
        return cpfAdmin;
    }

    /**
     * @param cpfAdmin the cpfAdmin to set
     */
    public void setCpfAdmin(String cpfAdmin) {
        this.cpfAdmin = cpfAdmin;
    }

    /**
     * @return the senhaAdmin
     */
    public String getSenhaAdmin() {
        return senhaAdmin;
    }

    /**
     * @param senhaAdmin the senhaAdmin to set
     */
    public void setSenhaAdmin(String senhaAdmin) {
        this.senhaAdmin = senhaAdmin;
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

    /**
     * @return the idAdmin
     */
    public int getIdAdmin() {
        return idAdmin;
    }

    /**
     * @param idAdmin the idAdmin to set
     */
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

}
