package Controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Controller.Conexao;
import Model.Usuarios;





public class ConsultaBD {
        Connection connection = null;
        
         public String relatorioPessoas()
    {
    	String dados = "";
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM usuarios");
            
            while (res.next())
            {
            	dados += "\n"+res.getString("nome");
		dados += "\n"+res.getString("telefone");
		dados += "\n"+res.getString("email");
		dados += "\n-----------------------------------------";				
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
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
    	
    	return dados;
    }
        
        
    
     public ArrayList<Usuarios> getListaPessoas() 
    {
        ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM usuarios");
            
            while (res.next())
            {
              Usuarios usuarios = new Usuarios(res.getString("Nome"),res.getString("CPF"), res.getString("Email"), res.getString("Cidade"), res.getString("Rua"), res.getString("Telefone"), res.getString("Senha"), res.getString("CEP"), res.getString("N"), res.getString("UF"), res.getString("Bairro"));
                listaUsuarios.add(usuarios);
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
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
        return listaUsuarios;
    }
}
     
    