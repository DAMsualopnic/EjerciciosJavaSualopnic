package org.example;

public class Persoa {

    private String dni;
    private String nomeCompleto;

    public Persoa(String dni){
        this.dni=dni;
        this.nomeCompleto="";
    }

    public Persoa(String dni, String nomeCompleto){
        this.dni=dni;
        this.nomeCompleto=nomeCompleto;
    }

    public String getDni(){
        return this.dni;
    }

    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
}
