/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conecta;
import Persistencia.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class AlunoDAO {

    public void cadastrarAluno(Aluno a) {
        Connection con = Conecta.iniciaConexao();
        PreparedStatement prepara = null;
        try{
            prepara = con.prepareStatement("INSERT INTO aluno (matriculaAluno, cpfAluno, nomeAluno, turnoAluno, turmaAluno, senhaAluno, emailAluno)VALUES(?,?,?,?,?,?,?)");
            prepara.setInt(1, a.getMatriculaAluno());
            prepara.setString(2, a.getCpfAluno());
            prepara.setString(3, a.getNomeAluno());
            prepara.setString(4, a.getTurnoAluno());
            prepara.setInt(5, a.getTurmaAluno());
            prepara.setString(6, a.getSenhaAluno());
            prepara.setString(7, a.getEmailAluno());
            prepara.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        }catch(SQLException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar os dados: " + ex);
        }finally{
            Conecta.fechaConexao(con, prepara);
        }
    }
}
