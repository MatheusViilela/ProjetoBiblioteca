package Controller;

import Model.Usuarios;
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Adm;




public class Conexao 
{
    Connection connection = null;  
    Connection con = null;
    private static Conexao instance = null;

    public Conexao() 
    {
    	try 
    	{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Carregado com sucesso!!!");
        } 
    	catch (ClassNotFoundException e) 
    	{
            System.out.println("O driver do Mysql não pode ser carregado!");
        }
    }
    
   
    public static Conexao getInstance() 
    {
        if (instance == null) 
        {
            instance = new Conexao();
        }
        return instance;
    }

    public Connection getConnection() 
    {
        try 
        {
            if ((con == null) || (con.isClosed())) 
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca"
                        + "", "root", "");
                System.out.println("Conexão estabelecida");
            }
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public void destroy() 
    {
        try 
        {
            con.close();
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
        public List<Usuarios>listarUsers()
        {
//        Connection connection = null;
//        ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();      
        con = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM usuarios");
            List<Usuarios> listaUsuarios = new ArrayList<>();

            while (res.next())
            {
//              Usuarios usuarios = new Usuarios(res.getString("Nome"),res.getString("CPF"), res.getString("Email"), res.getString("Senha"));
//                listaUsuarios.add(usuarios);
//                System.out.println(""+res.getString("Nome")+res.getString("CPF")+ res.getString("Email")+ res.getString("Senha"));
                Usuarios obj = new Usuarios();
                obj.setId(res.getInt("idUsuario"));
                obj.setNome(res.getString("Nome"));
                obj.setCpf(res.getString("CPF"));
                obj.setEmail(res.getString("Email"));
                obj.setSenha(res.getString("Senha"));
//                obj.setNome(res.getString("Nome"));
//                obj.setNome(res.getString("Nome"));
//                obj.setNome(res.getString("Nome"));
//                obj.setNome(res.getString("Nome"));
//                obj.setNome(res.getString("Nome"));
               listaUsuarios.add(obj);
            }   
            return listaUsuarios;
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        }
        public List<Adm>listarAdmin()
        {
//        Connection connection = null;
//        ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();      
        con = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM administrador");
            List<Adm> listaAdm = new ArrayList<>();

            while (res.next())
            {
//              Usuarios usuarios = new Usuarios(res.getString("Nome"),res.getString("CPF"), res.getString("Email"), res.getString("Senha"));
//                listaUsuarios.add(usuarios);
//                System.out.println(""+res.getString("Nome")+res.getString("CPF")+ res.getString("Email")+ res.getString("Senha"));
                Adm obj = new Adm();
                obj.setIdAdmin(res.getInt("idAdmin"));
                obj.setNome(res.getString("nome"));
                obj.setEmail(res.getString("email"));
                obj.setSenha(res.getString("senha"));
//                obj.setNome(res.getString("Nome"));
//                obj.setNome(res.getString("Nome"));
//                obj.setNome(res.getString("Nome"));
//                obj.setNome(res.getString("Nome"));
//                obj.setNome(res.getString("Nome"));
               listaAdm.add(obj);
            }   
            return listaAdm;
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
//        finally
//        {
//          
//            try
//            {
////                PreparedStatement stmt.close();
//                connection.close();
//            }
//            catch (SQLException e)
//            {
//                System.out.println("Erro ao desconectar" + e.getMessage());
//            }
//        }
//        return;

        }    
}