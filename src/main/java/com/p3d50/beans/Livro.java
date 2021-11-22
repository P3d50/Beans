package com.p3d50.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro implements Impressora {
    private String nome;
    private String codigo;

    @Autowired
    Autor autor;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return "Código: "+this.codigo+", Nome: "+this.nome+" ,"+this.autor.toString();
    }


}
