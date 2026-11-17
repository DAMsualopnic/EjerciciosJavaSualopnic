package org.example;



public class Conta {


    private String nomeConta;
    private double importe;

    public Conta(String nomeConta) {
        this.nomeConta=nomeConta;
        this.importe=0;

    }

    public Conta(String nomeConta, double importe){
        this.nomeConta=nomeConta;

        if (importe<0){
            this.importe=0;
        }else{
            this.importe=importe;
        }
    }

    // Métodos
    public String getNomeConta(){
        return this.nomeConta;
    }

    public void setNomeConta(String nomeConta){
        this.nomeConta=nomeConta;
    }

    public double getImporte (){
        return this.importe=importe;
    }

    public void setImporte(double importe){
        this.importe=importe;
    }


    /**
     * Ingresar diñeiro na conta, so se é positiva a cantidade
     *
     * @param importe
     */
    public void ingresar(double importe){
        if (importe>0){
            this.importe += importe;
        }
    }

    /**
     * Retirar unha cantidade da conta, se se quedara en negativo quedaría en 0.
     *
     * @param importe
     */
    public void retirar(double importe){
        if (this.importe - importe < 0){
            this.importe = 0;
        } else {
            this.importe -= importe;
        }
    }

    public void mostrarInfo() {
        System.out.println("Titular: "+this.nomeConta);
        System.out.println("Cantidade: "+this.importe+ " €");
    }

    @Override public String toString() {
        return "O titular "+ this.nomeConta+ " ten "+this.importe+" euros na Conta";
    }
}
