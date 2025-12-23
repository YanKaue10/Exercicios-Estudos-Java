package EntendendoPOO;

public class ContaBancaria {
    String titular;
    double saldo;

    ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (saldo > 0) {
            this.saldo += valor;
            System.out.println("Depositado com sucesso");
        } else {
            System.out.println("Valor Inválido para deposito");
        }
    }

    public void sacar(double valor) {
        if (saldo > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor invalido para o saque!");
        }
    }

    void mostrarSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$ " + saldo);
    }

}
