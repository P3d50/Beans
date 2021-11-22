package com.p3d50.beans;

public interface Impressora {

    public default void print(){
        System.out.println(this.toString());
    }
}
