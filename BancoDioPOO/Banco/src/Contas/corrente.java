package Contas ;
import java.util.Random;
public class corrente  extends conta   {
    public corrente(){
        this.agencia=0003;
        this.numero=gerarNumero();
    }
    public  int gerarNumero() {
        Random random = new Random();
        int numero = random.nextInt(9000) + 1000;
        return numero;
    }



}
