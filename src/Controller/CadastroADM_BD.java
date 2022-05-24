package Controller;
import Model.Adm;
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
}
