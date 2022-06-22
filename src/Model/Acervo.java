/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aluno
 */
public class Acervo {
    private int idItem;
    private String Tipo;
    private String Assunto;
    private String Titulo;
    private String Autor;
    private String Publicacao;
    private String Editora;

//    public Acervo(int aInt, String string, String string0, String string1, String string2, String string3, String string4) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    public Acervo() 
    {
        this.idItem=0;
        this.Tipo=null;
        this.Assunto=null;
        this.Titulo=null;
        this.Autor=null;
        this.Publicacao=null;
        this.Editora=null;
    }
    public Acervo(int idItem, String Tipo, String Assunto, String Titulo, String Autor, String Publicacao, String Editora)
    {
        this.idItem=idItem;
        this.Tipo=Tipo;     
        this.Assunto=Assunto;
        this.Titulo=Titulo;
        this.Autor=Autor;
        this.Publicacao=Publicacao;
        this.Editora=Editora;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String Assunto) {
        this.Assunto = Assunto;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getPublicacao() {
        return Publicacao;
    }

    public void setPublicacao(String Publicacao) {
        this.Publicacao = Publicacao;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }
    
}
