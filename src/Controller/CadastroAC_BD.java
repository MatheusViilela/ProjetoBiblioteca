/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Usuarios;
import Model.Acervo;
import Model.Adm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author eduar
 */

//      --------------------------------------------      //
//                  ACERVO - Cadastro
//      --------------------------------------------      //
public class CadastroAC_BD {
        Connection connection = null;

    public boolean inserirItem(Acervo acervo) 
    {
        System.out.println("Cadastrar item no acervo");
       
        connection = Conexao.getInstance().getConnection();
        
        System.out.println("Conectado e pronto para cadastrar");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();

            String sql = "INSERT INTO acervo(Tipo,Assunto,Titulo,Autor,Publicacao,Editora) "
            		   + "VALUES ('"+ acervo.getTipo() + "','" + acervo.getAssunto() + "', '" 
            		   + acervo.getTitulo()+ "', '" + acervo.getAutor() + "','"
                           + acervo.getPublicacao() + "', '" + acervo.getEditora() + "')";
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
    //      --------------------------------------------      //
//                  ACERVO - Listar
//      --------------------------------------------      //
    public ArrayList<Acervo> getListaAcervo() 
    {
        ArrayList<Acervo> listaAcervo= new ArrayList<Acervo>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM acervo");
            
            while (res.next())
            {
              Acervo acervo = new Acervo(res.getInt("idItem"),res.getString("Tipo"),res.getString("Assunto"), res.getString("Titulo"), res.getString("Autor"), res.getString("Publicacao"), res.getString("Editora"));
                listaAcervo.add(acervo);
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

        return listaAcervo;
    }
    //      --------------------------------------------      //
//                  ACERVO - Alterar
//      --------------------------------------------      //
    public void AlterarAcervo(Acervo acervo)
    {
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado");
       PreparedStatement stmt = null;

        try
        {
            stmt = connection.prepareStatement("UPDATE acervo SET Tipo = ?, Assunto = ?, Titulo = ?, Autor = ?, Publicacao = ?, Editora = ? WHERE idAdmin = ? ");
            stmt.setString(1,acervo.getTipo());
            stmt.setString(2,acervo.getAssunto());
            stmt.setString(3,acervo.getTitulo());
            stmt.setString(4,acervo.getAutor());
            stmt.setString(5,acervo.getPublicacao());
            stmt.setString(6,acervo.getEditora());
            
            stmt.executeUpdate();
            
	     JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }                   
    }
    //      --------------------------------------------      //
//                  ACERVO - Deletar
//      --------------------------------------------      //
    public void DeleteItem(Acervo acervo)
    {
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado");
       PreparedStatement stmt = null;

        try
        {
            stmt = connection.prepareStatement("DELETE FROM acervo WHERE idItem = ? ");
            stmt.setInt(1,acervo.getIdItem());
            
            stmt.executeUpdate();
            
	     JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        }                   
    }
        //      --------------------------------------------      //
//                  ACERVO - Pesquisa
//      --------------------------------------------      //
       
   public ArrayList<Acervo> PesquisaTipo(String tipo) 
    {
        ArrayList<Acervo> listaAcervo = new ArrayList<Acervo>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try
        {
            stmt = connection.prepareStatement("SELECT * FROM acervo WHERE Tipo LIKE ?");
            stmt.setString(1,"%"+tipo+"%");
            res = stmt.executeQuery();
            
            while (res.next())
            {
              Acervo acervo = new Acervo(res.getInt("idItem"),res.getString("Tipo"),res.getString("Assunto"), res.getString("Titulo"), res.getString("Autor"), res.getString("Publicacao"), res.getString("Editora"));
                listaAcervo.add(acervo);
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

        return listaAcervo;
    } 
   
    public ArrayList<Acervo> PesquisaAssunto(String assunto) 
    {
        ArrayList<Acervo> listaAcervo = new ArrayList<Acervo>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try
        {
            stmt = connection.prepareStatement("SELECT * FROM acervo WHERE Assunto LIKE ?");
            stmt.setString(1,"%"+assunto+"%");
            res = stmt.executeQuery();
            
            while (res.next())
            {
              Acervo acervo = new Acervo(res.getInt("idItem"),res.getString("Tipo"),res.getString("Assunto"), res.getString("Titulo"), res.getString("Autor"), res.getString("Publicacao"), res.getString("Editora"));
                listaAcervo.add(acervo);
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

        return listaAcervo;
    }
    
        public ArrayList<Acervo> PesquisaTitulo(String titulo) 
    {
        ArrayList<Acervo> listaAcervo = new ArrayList<Acervo>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try
        {
            stmt = connection.prepareStatement("SELECT * FROM acervo WHERE Titulo LIKE ?");
            stmt.setString(1,"%"+titulo+"%");
            res = stmt.executeQuery();
            
            while (res.next())
            {
              Acervo acervo = new Acervo(res.getInt("idItem"),res.getString("Tipo"),res.getString("Assunto"), res.getString("Titulo"), res.getString("Autor"), res.getString("Publicacao"), res.getString("Editora"));
                listaAcervo.add(acervo);
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

        return listaAcervo;
    }
        
        public ArrayList<Acervo> PesquisaAutor(String autor) 
    {
        ArrayList<Acervo> listaAcervo = new ArrayList<Acervo>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try
        {
            stmt = connection.prepareStatement("SELECT * FROM acervo WHERE Autor LIKE ?");
            stmt.setString(1,"%"+autor+"%");
            res = stmt.executeQuery();
            
            while (res.next())
            {
              Acervo acervo = new Acervo(res.getInt("idItem"),res.getString("Tipo"),res.getString("Assunto"), res.getString("Titulo"), res.getString("Autor"), res.getString("Publicacao"), res.getString("Editora"));
                listaAcervo.add(acervo);
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

        return listaAcervo;
    }
        
        public ArrayList<Acervo> PesquisaDataPubli(String publicacao) 
    {
        ArrayList<Acervo> listaAcervo = new ArrayList<Acervo>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try
        {
            stmt = connection.prepareStatement("SELECT * FROM acervo WHERE Publicacao LIKE ?");
            stmt.setString(1,"%"+publicacao+"%");
            res = stmt.executeQuery();
            
            while (res.next())
            {
              Acervo acervo = new Acervo(res.getInt("idItem"),res.getString("Tipo"),res.getString("Assunto"), res.getString("Titulo"), res.getString("Autor"), res.getString("Publicacao"), res.getString("Editora"));
                listaAcervo.add(acervo);
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

        return listaAcervo;
    }
        
        public ArrayList<Acervo> PesquisaEditora(String editora) 
    {
        ArrayList<Acervo> listaAcervo = new ArrayList<Acervo>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try
        {
            stmt = connection.prepareStatement("SELECT * FROM acervo WHERE Editora LIKE ?");
            stmt.setString(1,"%"+editora+"%");
            res = stmt.executeQuery();
            
            while (res.next())
            {
              Acervo acervo = new Acervo(res.getInt("idItem"),res.getString("Tipo"),res.getString("Assunto"), res.getString("Titulo"), res.getString("Autor"), res.getString("Publicacao"), res.getString("Editora"));
                listaAcervo.add(acervo);
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

        return listaAcervo;
    }
}
