package com.p3d50.beans;

public class Autor implements Impressora{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return this.nome;
    }

}
