/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmd.auladb.controller;

import com.acmd.auladb.dao.Conexao;
import com.acmd.auladb.dao.UsuarioDAO;
import com.acmd.auladb.model.Usuario;
import com.acmd.auladb.view.FormCadastroView;
import com.acmd.auladb.view.FormLoginView;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class FormCadastroController {
    
    private FormCadastroView view;
    
    public FormCadastroController(FormCadastroView view){
    this.view = view;
    
    }

 
    public void SalvaUsuario(){
    
       
        String Usuario = view.getTxtUser().getText();
        String senha = view.getTxtSenha().getText();

        Usuario user = new Usuario(Usuario,senha);
        try{
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(user);
            
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado com sucesso");

        }catch (SQLException ex){
            Logger.getLogger(FormLoginView.class.getName()).log(Level.SEVERE,null,ex);
        }
    
    }
}
