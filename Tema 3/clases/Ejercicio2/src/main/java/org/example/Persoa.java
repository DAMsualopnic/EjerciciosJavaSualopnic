package org.example;

public class Persoa {

    private String dni;
    private String nomeCompleto;

    public Persoa(String dni){
        if (!eDNIValido(dni)){
            this.dni=null;
            this.nomeCompleto=null;
        }else {
            this.dni=dni;
            this.nomeCompleto="Pedro";
        }
    }

    public Persoa(String dni, String nomeCompleto) {
        if (!eDNIValido(dni)) {
            this.dni = null;
            this.nomeCompleto = null;
        } else {
            this.dni = dni;
            this.nomeCompleto = nomeCompleto;
        }
    }

    public String getDni(){
        return this.dni;
    }

    public String getNomeCompleto(){
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto=nomeCompleto;
    }

    public static char letraDni(int numero){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = numero % 23;
        return letras.charAt(indice);
    }

    public  static boolean eDNIValido (String dni){
        boolean valido=true;

        if (dni.length()!=9){
            valido=false;
        }
        else{
            String parteNumerica = dni.substring(0,8); // Se cuenta el primer caracter pero no el último, esto sería del 0 al 7.
            char letra = Character.toUpperCase(dni.charAt(8)); // Se pone 8, ya que se empieza a contar desde 0.

            if (!parteNumerica.matches("^\\d{8}$")){
                valido=false;
            }else {
                int numero = Integer.parseInt(parteNumerica);
                char letraCalculada = letraDni(numero);
                if (letra!=letraCalculada){
                    valido=false;
                }
            }
        }
        return valido;
    }
}
