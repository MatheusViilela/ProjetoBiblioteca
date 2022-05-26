package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
            ResultSet res = stmt.executeQuery("SELECT * FROM administrador WHERE email='"+ login.getEmail()+"' AND senha='"+login.getSenha()+"'");
            
               if(login.getEmail().compareTo("")==0 && login.getSenha().compareTo("")==0)
		{
		   status = false;
		   
		}
               else{
            
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
              ResultSet res = stmt.executeQuery("SELECT * FROM usuarios WHERE Email='"+ login.getEmail()+"' AND Senha='"+login.getSenha()+"'");
            
               if(login.getEmail().compareTo("")==0 && login.getSenha().compareTo("")==0)
		{
		   status = false;
		   
		}
               else{
                   
               
              
            while(res.next())
	    {
	        if(login.getEmail().compareTo(res.getString("Email"))==0 && login.getSenha().compareTo(res.getString("Senha"))==0)
		{
		   status = true;
		   
		}
//                else if(login.getEmail().compareTo(res.getString("Email"))==0) 
//                    status = false;
//                }
		else
		{
		   status = false;
		}
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
