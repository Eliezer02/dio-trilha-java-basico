public class Cliente {

private String nomeCliente = "";
private int agencia = 0;
private int numeroDaConta = 0;
private double saldo = 0;


public Cliente( String nomeCliente, int agencia, int numeroDaConta, double saldo) {
    this.nomeCliente = nomeCliente;
    this.agencia = agencia;
    this.numeroDaConta = numeroDaConta;
    this.saldo = saldo;

}


public String getNomeCliente() {
    return nomeCliente;
}

public int getagencia() {
    return agencia;
}

public int getnumeroDaConta() {
    return numeroDaConta;
}

public double getsaldo() {
    return saldo;
}

public void setSaldo (double novoSaldo) {
    this.saldo= novoSaldo;
}

}
