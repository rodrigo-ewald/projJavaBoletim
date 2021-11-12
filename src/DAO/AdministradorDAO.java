/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conecta;
import Persistencia.Admin;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author rodri
 */
public class AdministradorDAO {

    public boolean verificaLogin(String cpf, String senha) {
        Connection con = Conecta.iniciaConexao();
        PreparedStatement prepara = null;
        ResultSet rs = null;
        boolean verifica = false;
        try {
            prepara = con.prepareStatement("SELECT * FROM admin WHERE cpfAdmin = ? and senhaAdmin = ?");
            prepara.setString(1, cpf);
            prepara.setString(2, senha);
            rs = prepara.executeQuery();
            if (rs.next()) {
                verifica = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(professorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conecta.fechaConexao(con, prepara, rs);
        }
        return verifica;
    }

    public Admin consultar(String cpf) {
        Connection con = Conecta.iniciaConexao();
        PreparedStatement prepara = null;
        ResultSet rs = null;
        try {
            Admin a = new Admin();
            prepara = con.prepareStatement("SELECT * FROM admin WHERE cpfAdmin = ?");
            prepara.setString(1, cpf);
            rs = prepara.executeQuery();
            if (rs.next()) {
                a.setIdAdmin(rs.getInt("idAdmin"));
                a.setCpfAdmin(rs.getString("cpfAdmin"));
                a.setSenhaAdmin(rs.getString("senhaAdmin"));
                a.setTipoUsuario(rs.getInt("tipoUsuario"));
                return a;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(professorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            Conecta.fechaConexao(con, prepara, rs);
        }
    }

}
