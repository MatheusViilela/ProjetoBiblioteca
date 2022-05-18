package Model;
public class Usuarios
{
    private String nome;
    private String cidade;
    private String rua;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;
    private String CEP;
    private String N;
    private String UF;
    
    
    
    
    
    

    public Usuarios() 
    {
        this.nome=null;
        this.cpf=null;
        this.email=null;
        this.cidade=null;
        this.rua=null;
        this.telefone=null;
        this.senha=null;
        this.CEP=null;
        this.N=null;
        this.UF=null;
        
        
               
    }

    public Usuarios(String nome,String cpf,String email,String cidade,String rua,String telefone,String senha,String CEP,String N,String UF )
    {
        this.nome=nome;
        this.cpf=cpf;
        this.email=email;
        this.cidade=cidade;
        this.rua=rua;
        this.telefone=telefone;
        this.senha=senha;
        this.CEP=CEP;
        this.N=N;
        this.UF=UF;   
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCpf()
    {
        return cpf;
    }
    
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    
    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    } 
    
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    } 
    public String getCidade()
    {
        return cidade;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    } 
     public String getRua()
    {
        return rua;
    }

    public void setRua(String rua)
    {
        this.rua = rua;
    } 
    
    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    } 
    public String getCep()
    {
        return CEP;
    }

    public void setCep(String cep)
    {
        this.CEP = cep;
    } 
    public String getN()
    {
        return N;
    }

    public void setN(String n)
    {
        this.N = n;
    }
    public String getUf()
    {
        return UF;
    }

    public void setUf(String uf)
    {
        this.UF = uf ;
    } 
}
