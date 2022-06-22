package Controller;
import Model.Adm;
import Model.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


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
     public ArrayList<Adm> PesquisaNomeAdm(String nome) 
    {
        ArrayList<Adm> listaAdm = new ArrayList<Adm>();
        
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try
        {
            stmt = connection.prepareStatement("SELECT * FROM administrador WHERE nome LIKE ?");
            stmt.setString(1,"%"+nome+"%");
            res = stmt.executeQuery();
            
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
     
     public ArrayList<Adm> PesquisaEmailAdm(String email) 
    {
        ArrayList<Adm> listaAdm = new ArrayList<Adm>();
        
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try
        {
            stmt = connection.prepareStatement("SELECT * FROM administrador WHERE email LIKE ?");
            stmt.setString(1,"%"+email+"%");
            res = stmt.executeQuery();
            
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
     
     public ArrayList<Adm> PesquisaSenhaAdm(String senha) 
    {
        ArrayList<Adm> listaAdm = new ArrayList<Adm>();
        
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try
        {
            stmt = connection.prepareStatement("SELECT * FROM administrador WHERE senha LIKE ?");
            stmt.setString(1,"%"+senha+"%");
            res = stmt.executeQuery();
            
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
     
       public void AlterarAdm(Adm admin)
    {
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado");
       PreparedStatement stmt = null;

        try
        {
            stmt = connection.prepareStatement("UPDATE administrador SET nome = ?,email = ?,senha = ? WHERE idAdmin = ? ");
            stmt.setString(1,admin.getNome());
            stmt.setString(2,admin.getEmail());
            stmt.setString(3,admin.getSenha());
            stmt.setInt(4,admin.getIdAdm());
            
            stmt.executeUpdate();
            
	     JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }                   
    }
         public void DeleteAdm(Adm admin)
    {
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado");
       PreparedStatement stmt = null;

        try
        {
            stmt = connection.prepareStatement("DELETE FROM administrador WHERE idAdmin = ? ");
            stmt.setInt(1,admin.getIdAdm());
            
            stmt.executeUpdate();
            
	     JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        }                   
    }
}
