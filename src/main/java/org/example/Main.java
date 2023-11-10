package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        vaiVimoErro();
        vai_VimoErro();
    }

    public static void vai_VimoErro(){
        Pessoa vai_quebrar = new Pessoa("Lucas", "123");
    }
    public static void vaiVimoErro(){
        Pessoa vai_quebrar = new Pessoa("Lucas", "123");
    }
}
