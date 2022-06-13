
package Model;

public class Adm {
    private int idAdm;
    private String nome;
    private String email;
    private String senha;
    
    public Adm() 
    {
        this.idAdm=0;
        this.nome=null;
        this.email=null;
        this.senha= null;
    
    }
    
     public Adm(String email, String senha, String nome,int idAdm)
    {
        this.idAdm=idAdm;
        this.nome=nome;
        this.email=email;
        this.senha=senha;
    }
     public int getIdAdmin()
    {       
        return idAdm;
    }

    public void setIdAdmin(int IdAdm)
    {
        this.idAdm = idAdm;
    }
     
     public String getNome()
    {
       
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
     
    public String getEmail()
    {
       
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getSenha()
    {
        return senha;
    }
    
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
    
}
