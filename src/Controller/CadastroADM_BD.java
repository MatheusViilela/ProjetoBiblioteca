package Controller;
import Model.Adm;
import Model.Usuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CadastroADM_BD {
 
    Connection connection = null;

    public boolean inserirAdm(Adm adm) 
    {
        System.out.println("Cadastrar Administrador");
       
        connection = Conexao.getInstance().getConnection();
        
        System.out.println("Conectado e pronto para cadastrar");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();

            String sql = "INSERT INTO administrador(nome,email,senha)"
            		   + "VALUES ('"+ adm.getNome() + "', '" + adm.getEmail() + "', '" + adm.getSenha() + "')";
                           
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
     public ArrayList<Adm> getListaAdm() 
    {
        ArrayList<Adm> listaAdm = new ArrayList<Adm>();
        
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM administrador");
            
            while (res.next())
            {
             Adm adm = new Adm(res.getInt("idAdmin"),res.getString("nome"),res.getString("email"),res.getString("Senha"));
                listaAdm.add(adm);
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
        return listaAdm;
    }
}
