/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conecta;
import Persistencia.Professor;
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
public class professorDAO {

    public boolean verificaLogin(String cpf, String senha) {
        Connection con = Conecta.iniciaConexao();
        PreparedStatement prepara = null;
        ResultSet rs = null;
        boolean verifica = false;
        try {
            prepara = con.prepareStatement("SELECT * FROM professor WHERE cpfProfessor = ? and senhaProfessor = ?");
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

    public Professor consultar(String cpf) {
        Connection con = Conecta.iniciaConexao();
        PreparedStatement prepara = null;
        ResultSet rs = null;
        try {
            Professor p = new Professor();
            prepara = con.prepareStatement("SELECT * FROM professor WHERE cpfProfessor = ?");
            prepara.setString(1, cpf);
            rs = prepara.executeQuery();
            if (rs.next()) {
                p.setIdProfessor(rs.getInt("idProfessor"));
                p.setNomeProfessor(rs.getString("nomeProfessor"));
                p.setCpfProfessor(rs.getString("cpfProfessor"));
                p.setTipoUsuario(rs.getInt("tipoUsuario"));
                return p;
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
