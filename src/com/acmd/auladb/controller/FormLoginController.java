
package com.acmd.auladb.controller;

import com.acmd.auladb.dao.Conexao;
import com.acmd.auladb.dao.UsuarioDAO;
import com.acmd.auladb.model.Usuario;
import com.acmd.auladb.view.FormLoginView;
import com.acmd.auladb.view.MenuView;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author julia
 */
public class FormLoginController {
    
    private FormLoginView view;

    public FormLoginController(FormLoginView view) {
        this.view = view;
    }

    public void Autenticar() throws SQLException {
        
        String usuario = view.getTxtUser().getText();
         String senha =  view.getTxtSenha().getText();
         
        Usuario usuarioAutentica = new Usuario(usuario,senha);
        
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
     boolean existe =  usuarioDao.select(usuarioAutentica);
        
     if(existe){
      MenuView tela = new MenuView();
        tela.setVisible(true);  
    }else {
         JOptionPane.showMessageDialog(view, "Usuario ou senha incorreto");
     }
    }
}
