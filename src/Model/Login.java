package Model;

public class Login
{
    private String emailu;
    private String senhau;
    private String email;
    private String senha;
   

    public Login() 
    {
        this.emailu=null;
        this.senhau=null;
        this.email=null;
        this.senha=null;
          
    }

    public Login(String email, String senha, String emailu, String senhau)
    {
        this.emailu = emailu;
        this.senhau= senhau;
        this.email = email;
        this.senha = senha;
         
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
    
     public String getEmailu()
    {
       
        return emailu;
    }

    public void setEmailu(String emailu)
    {
        this.emailu = emailu;
    }
    
     public String getSenhau()
    {
        return senhau;
    }
    
    public void setSenhau(String senhau)
    {
        this.senhau = senhau;
    }
}
