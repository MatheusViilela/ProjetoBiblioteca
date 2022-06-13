
package Controller;
import Model.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


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

            String sql = "INSERT INTO usuarios(Nome,CPF,Email,Cidade,Rua,Telefone,Senha,Cep,N,UF,Bairro) "
            		   + "VALUES ('"+ usuario.getNome() + "','" + usuario.getCpf() + "', '" 
            		   + usuario.getEmail() + "', '" + usuario.getCidade() + "','"
                           + usuario.getRua() + "', '" + usuario.getTelefone() + "','"
                           + usuario.getSenha() + "', '" + usuario.getCep() + "','"
                           + usuario.getN() + "', '" + usuario.getUf() + "','" + usuario.getBairro() + "')";
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
              Usuarios usuarios = new Usuarios(res.getInt("idUsuario"),res.getString("Nome"),res.getString("CPF"), res.getString("Email"), res.getString("Cidade"), res.getString("Rua"), res.getString("Telefone"), res.getString("Senha"), res.getString("CEP"), res.getString("N"), res.getString("UF"), res.getString("Bairro"));
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
      public void AlterarUser(Usuarios usuario)
    {
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado");
       PreparedStatement stmt = null;

        try
        {
            stmt = connection.prepareStatement("UPDATE usuarios SET Nome = ?,CPF = ?,Email = ?,Senha = ? WHERE idUsuario = ? ");
            stmt.setString(1,usuario.getNome());
            stmt.setString(2,usuario.getCpf());
            stmt.setString(3,usuario.getEmail());
            stmt.setString(4,usuario.getSenha());
            stmt.setInt(5,usuario.getId());
            
            stmt.executeUpdate();
            
	     JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }
            
       
              
	    
   
  
        
    	
 
    }
}
    