import Contas.poupanca;
import Contas.corrente;

public static void main(String[] args) {
    poupanca poupanca=new poupanca();
    poupanca poupanca1=new poupanca();
    poupanca1.abrirconta("Manu",22112233);
    poupanca.abrirconta("Luan Felipe",1232312312);
    System.out.println(poupanca.getAgencia());
    System.out.println(poupanca.getNumero());
    System.out.println(poupanca.getTitular());
    System.out.println(poupanca.getCpf());
    poupanca.sacar(50);
    poupanca.depositar(100);
    poupanca.sacar(50);
    poupanca.tranferir(20,poupanca1);
    System.out.println(poupanca.getSaldo());
    System.out.println(poupanca1.getSaldo());
    poupanca1.pegarEmprestimo(100);
    poupanca1.pagarEmprestimo(50);
    System.out.println(poupanca1.getSaldo());
    System.out.println(poupanca1.getSaldodevedor());
    System.out.println(poupanca1);
}

