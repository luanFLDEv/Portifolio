package Contas;

public class conta implements ContaBancaria {
    protected String titular;
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected int cpf;
    protected boolean situacao;
    protected double saldodevedor;

    @Override
    public String toString() {
        return "Extrato de conta{" +
                "titular='" + titular + '\'' +
                ", numero=" + numero +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                ", cpf=" + cpf +
                ", situacao=" + situacao +
                ", saldodevedor=" + saldodevedor +
                '}';
    }

    public double getSaldodevedor() {
        return saldodevedor;
    }
    public void setSaldodevedor(double saldodevedor) {
        this.saldodevedor = saldodevedor;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isSituacao() {
        return situacao;
    }
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    @Override
    public void sacar(double valorSaque) {
        if(situacao){
        if(getSaldo()<valorSaque){
            System.out.println("Saldo insuficiente para saque,Saldo total:"+getSaldo()+"R$");
        }else{
            setSaldo(getSaldo()-valorSaque);
            System.out.println("Saque efetuado com sucesso,Montante que resta em conta:"+getSaldo());
        }}else{
            System.out.println("A conta não foi encontrada");
        }
    }
    @Override
    public void depositar(double valorDeposito) {
        if (situacao){
            setSaldo(getSaldo()+valorDeposito);
            System.out.println("Deposito efetuado de:"+valorDeposito+" com sucesso");
        }else{
            System.out.println("A conta não foi encontrada");
        }
    }

    @Override
    public void tranferir(double valorTransferencia, conta contadestino) {
        if(situacao){
            if(getSaldo()<valorTransferencia){
                System.out.println("O valor que deseja tranferir supera o seu saldo,Saldo atual:"+getSaldo());
            }else if(contadestino.situacao == false){
                System.out.println("A conta para tranferencia não foi encontrada");
            }else{
                contadestino.setSaldo(contadestino.getSaldo()+valorTransferencia);
                setSaldo(getSaldo()-valorTransferencia);
                System.out.println("Tranferencia de "+valorTransferencia+"R$ para "+contadestino.getTitular()+" concludia com sucesso");
            }
        }
    }
    @Override
    public void abrirconta(String nome,int cpf) {
        if(situacao){
            System.out.println("Esta conta ja foi aberta");
        }else{
            this.setTitular(nome);
            this.setCpf(cpf);
            setSituacao(true);
            System.out.println("Conta aberta com sucesso");
        }
    }

    @Override
    public void pegarEmprestimo(double valorEmprestimo) {
        if(getSaldodevedor()>0){
            System.out.println("Voce ja tem um emprestimo em aberto,pague sua divida para pegar um novo emprestimo:"+getSaldodevedor());
        }else{
            setSaldodevedor(valorEmprestimo);
            setSaldo(getSaldo()+valorEmprestimo);
            System.out.println("Emprestimo de:"+valorEmprestimo+" feito com sucesso!");
        }
    }

    @Override
    public void pagarEmprestimo(double valor) {
        if(valor>getSaldodevedor()){
        int restante= (int) (valor-getSaldodevedor());
            setSaldodevedor(valor-getSaldodevedor());
            setSaldo((getSaldo()-valor) );
            setSaldo(getSaldo()+getSaldodevedor());
            setSaldodevedor(0);
            System.out.println("Emprestimo pago");
        }else{
            setSaldodevedor(getSaldodevedor()-valor);
                setSaldo(getSaldo()-valor);
                int restante=(int) (valor-getSaldodevedor());
                System.out.println("Uma parte do emprestimo foi abatida, resta:"+getSaldodevedor());
            }
        }
    }

