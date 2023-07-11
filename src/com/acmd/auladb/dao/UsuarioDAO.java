package com.acmd.auladb.dao;


import com.acmd.auladb.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class UsuarioDAO {

    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Usuario usuario) throws SQLException {

        String sql = "insert into usuario (usuario, senha) values (? ,?);";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        statement.execute();

    }

    public void update(Usuario usuario) throws SQLException {

        String sql = "update usuario set usuario =?, senha =? where id =? ";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        statement.setInt(3, usuario.getId());
        statement.execute();

    }

    public void insertORupdate(Usuario usuario) throws SQLException {
        if (usuario.getId() > 0) {
            update(usuario);
        } else {
            insert(usuario);
        }
    }

    public void delete(Usuario usuario) throws SQLException {

        String sql = "delete from usuario where id =? ";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, usuario.getId());
        statement.execute();
    }

    public ArrayList<Usuario> selectALL() throws SQLException {

        String sql = "select * from usuario";

        PreparedStatement statement = connection.prepareStatement(sql);

        return pesquisa(statement);
    }

    private ArrayList<Usuario> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        statement.execute();
        ResultSet resultSet = statement.getResultSet();

        while (resultSet.next()) {

            int id = resultSet.getInt("id");
            String usuario = resultSet.getString("usuario");
            String senha = resultSet.getString("senha");

            Usuario usuarioComDadosDoBanco = new Usuario(id, usuario, senha);

            usuarios.add(usuarioComDadosDoBanco);
        }
        return usuarios;
    }

    public Usuario selectPorId(Usuario usuario) throws SQLException {

        String sql = "select * from usuario where id = ? ";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, usuario.getId());

        return pesquisa(statement).get(0);

    }

    public boolean select(Usuario usuario) throws SQLException {

        String sql = "select * from usuario where usuario= ? and senha =? ";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        statement.execute();

        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
    }
}

        
