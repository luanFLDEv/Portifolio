package Contas;

import java.util.Random;

public class poupanca extends conta{
    public poupanca(){
        this.agencia=0005;
        this.numero=gerarNumero();
    }
    public int gerarNumero() {
        Random random = new Random();
        int numero = random.nextInt(9000) + 1000;
        return numero;
    }
}
