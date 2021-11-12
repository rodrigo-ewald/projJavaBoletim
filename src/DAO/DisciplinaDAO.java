/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conecta;
import Persistencia.Disciplina;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class DisciplinaDAO {

    public void cadastrarNotas(Disciplina D) {
        Connection con = Conecta.iniciaConexao();
        PreparedStatement prepara = null;
        try {
            prepara = con.prepareStatement("INSERT INTO disciplina_aluno (codigoDisciplina, matriculaAluno, cargaHoraria, primeira_nota, segunda_nota, media, etapa, numeroFaltas)VALUES(?,?,?,?,?,?,?,?)");
            prepara.setInt(1, D.getCodigoDisciplina());
            prepara.setInt(2, D.getMatriculaAluno());
            prepara.setInt(3, D.getCargaHoraria());
            prepara.setDouble(4, D.getPrimeiraNota());
            prepara.setDouble(5, D.getSegundaNota());
            prepara.setDouble(6, D.getMedia());
            prepara.setInt(7, D.getEtapa());
            prepara.setInt(8, D.getNumeroFaltas());
            prepara.executeUpdate();
            JOptionPane.showMessageDialog(null, "Os dados foram cadastrados com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar os dados: " + ex);
        } finally {
            Conecta.fechaConexao(con, prepara);
        }
    }
}
