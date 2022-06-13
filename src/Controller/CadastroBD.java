
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
}
    