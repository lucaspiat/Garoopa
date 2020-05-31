package com.garoopa;

public class Motorista {

    private String cpf;
    private String nome;
    private Veiculo veiculo;
    private FormaPagto forma;

    public Motorista(String cpf, String nome, Veiculo veiculo, FormaPagto forma) {
        this.cpf = "00000000000";
        this.nome = "Nome";
        this.veiculo = veiculo;
        this.forma = forma;
    }

    public int soma_aval(){
        return 0;
    }

    public int quant_aval(){
        return 0;
    }
    
}