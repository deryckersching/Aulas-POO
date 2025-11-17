
public class BancoFinanceiro implements Banco {
    private String dono;
    private double saldo;
    private boolean aberta;

    public BancoFinanceiro(String dono) {
        this.dono = dono;
        this.saldo = 0;
        this.aberta = false;
    }
    public void abrirConta() {
        if (!aberta) {
            aberta = true;
            System.out.println("Conta aberta com sucesso para " + dono + "!");
        } else {
            System.out.println("A conta já está aberta.");
        }
    }
    public void fecharConta() {
        if (aberta && saldo == 0) {
            aberta = false;
            System.out.println("Conta de " + dono + " encerrada com sucesso.");
        } else if (saldo > 0) {
            System.out.println("Conta ainda tem saldo. Saque antes de encerrar.");
        } else {
            System.out.println("A conta já está fechada.");
        }
    }
    public void depositar(double valor) {
        if (aberta) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado!");
        } else {
            System.out.println("Abra a conta antes de depositar.");
        }
    }

    public void sacar(double valor) {
        if (aberta && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado!");
        } else if (!aberta) {
            System.out.println("A conta está fechada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public void verSaldo() {
        System.out.println("Saldo atual de " + dono + ": R$" + saldo);
    }
}



