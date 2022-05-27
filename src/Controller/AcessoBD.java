package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Controller.Conexao;

import Model.Login;

public class AcessoBD
{

    Connection connection = null;

    public boolean verificaAcesso(Login login)
    {
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM administrador ");
            
            while(res.next())
	    { 
                
                if(login.getEmail().compareTo(res.getString("email"))==0 && login.getSenha().compareTo(res.getString("senha"))==0)
		{
		   status = true;
	      
		   
		}
		else
		{
		   status = false;
		}
	  
	    }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
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
    	
           return status;
    }

    public boolean verificaAcessoUser(Login login)
    {
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM usuarios");
            
            while(res.next())
	    {
	        if(login.getEmail().compareTo(res.getString("Email"))==0 && login.getSenha().compareTo(res.getString("Senha"))==0)
		{
		   status = true;
		   
		}
		else
		{
		   status = false;
		}
	  
	    }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
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
    	
        return status;
    }
}
