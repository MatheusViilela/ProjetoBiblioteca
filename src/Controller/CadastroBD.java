/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Usuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CadastroBD
{

    Connection connection = null;

    public boolean inserirUsuarios(Usuarios usuario) 
    {
        System.out.println("Cadastrar Usuario");
       
        connection = Conexao.getInstance().getConnection();
        
        System.out.println("Conectado e pronto para cadastrar");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();

            String sql = "INSERT INTO usuarios(Nome,CPF,Email,Cidade,Rua,Telefone,Senha,Cep,N,UF) "
            		   + "VALUES ('"+ usuario.getNome() + "','" + usuario.getCpf() + "', '" 
            		   + usuario.getEmail() + "', '" + usuario.getCidade() + "','"
                           + usuario.getRua() + "', '" + usuario.getTelefone() + "','"
                           + usuario.getSenha() + "', '" + usuario.getCep() + "','"
                           + usuario.getN() + "', '" + usuario.getUf() + "')";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
           
            return true;
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        } 
        finally 
        {
            try 
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }
}
    