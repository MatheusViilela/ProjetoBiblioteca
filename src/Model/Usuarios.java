package Model;
public class Usuarios
{
    private String id;    
    private String nome;
    private String cidade;
    private String rua;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;
    private String cep;
    private String N;
    private String UF;    
    private String bairro;

    
    
    
    
    
    

    public Usuarios() 
    {
        this.id=null;
        this.nome=null;
        this.cpf=null;
        this.email=null;
        this.cidade=null;
        this.rua=null;
        this.telefone=null;
        this.senha=null;
        this.cep=null;
        this.N=null;
        this.UF=null;
        this.bairro=null;
        
        
               
    }

    public Usuarios(String id,String nome,String cpf,String email,String cidade,String rua,String telefone,String senha,String cep,String N,String UF,String bairro)
    {
        this.id=id;
        this.nome=nome;
        this.cpf=cpf;
        this.email=email;
        this.cidade=cidade;
        this.rua=rua;
        this.telefone=telefone;
        this.senha=senha;
        this.cep=cep;
        this.N=N;
        this.UF=UF;
        this.bairro=bairro;
    }
    public Usuarios(String id,String nome,String cpf,String email,String senha)
    {
        this.id=id;
        this.nome=nome;
        this.cpf=cpf;
        this.email=email;
        this.senha=senha;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String nome)
    {
        this.id = nome;
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
        return cep;
    }

    public void setCep(String cep)
    {
        this.cep = cep;
    } 
    public String getN()
    {
        return N;
    }

    public void setN(String N)
    {
        this.N = N;
    }
    public String getUf()
    {
        return UF;
    }

    public void setUf(String uf)
    {
        this.UF = uf ;
    }
    public String getBairro()
    {
        return bairro;
    }

    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    } 
}
