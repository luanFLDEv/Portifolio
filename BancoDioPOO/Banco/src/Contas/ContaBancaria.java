package Contas;

public interface ContaBancaria {
    void sacar(double valorSaque);
    void depositar(double valorDeposito);
    void tranferir(double valorTransferencia,conta contadestino);
    void abrirconta(String nome,int cpf );
    void pegarEmprestimo(double valorEmprestimo);
    void pagarEmprestimo(double valor);
}
