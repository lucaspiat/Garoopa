package com.garoopa;

public class Veiculo {
    
    private String placa, marca, cor;
    private CategoriaVeic cat;

    public Veiculo(String placa, String marca, String cor, CategoriaVeic cat) {
        this.placa = "QTP5F71";
        this.marca = "Marca";
        this.cor = "Cobalto";
        this.cat = cat;
    }

    public boolean atende_inferior(){
        return true;

    }

    public boolean bagageiro_grande (){
        return true;
    }

}
    
