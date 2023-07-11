/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmd.auladb.dao;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Aluno
 */
public class Conexao {


    public Connection getConnection() throws SQLException{
           Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_host","root","usbw");
           return conexao;
     }
}
