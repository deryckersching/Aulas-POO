public class SistemaBanco {

    static class Pessoa {
        protected String nome;
        protected String endereco;
        protected String telefone;

        public Pessoa(String nome, String endereco, String telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
        }

        public void gravar() {
            System.out.println("Gravando dados da pessoa...");
        }
    }

    static class Fisica extends Pessoa {
        private int cpf;

        public Fisica(String nome, String endereco, String telefone, int cpf) {
            super(nome, endereco, telefone);
            this.cpf = cpf;
        }

        @Override
        public void gravar() {
            System.out.println("Gravando pessoa física. CPF: " + cpf);
        }
    }
    static class Juridica extends Pessoa {
        private int cnpj;

        public Juridica(String nome, String endereco, String telefone, int cnpj) {
            super(nome, endereco, telefone);
            this.cnpj = cnpj;
        }

        @Override
        public void gravar() {
            System.out.println("Gravando pessoa jurídica. CNPJ: " + cnpj);
        }
    }
    static class ContaComum {
        protected int numero;
        protected int saldo;
        protected int tipo; // 1-Comum, 2-Especial, 3-Poupança

        public ContaComum(int numero, int saldo, int tipo) {
            this.numero = numero;
            this.saldo = saldo;
            this.tipo = tipo;
        }

        public void sacar(int valor) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado. Novo saldo: " + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }

        public void depositar(int valor) {
            saldo += valor;
            System.out.println("Depósito realizado. Saldo: " + saldo);
        }
    }

    static class Especial extends ContaComum {
        private int limite;

        public Especial(int numero, int saldo, int tipo, int limite) {
            super(numero, saldo, tipo);
            this.limite = limite;
        }

        @Override
        public void sacar(int valor) {
            if (valor <= saldo + limite) {
                saldo -= valor;
                System.out.println("Saque especial realizado. Saldo: " + saldo);
            } else {
                System.out.println("Limite insuficiente.");
            }
        }
    }

    static class Poupanca extends ContaComum {
        private int dataAniversario;

        public Poupanca(int numero, int saldo, int tipo, int dataAniversario) {
            super(numero, saldo, tipo);
            this.dataAniversario = dataAniversario;
        }
    }

    static class Historico {
        private int numeroConta;
        private int tipoConta;

        public Historico(int numeroConta, int tipoConta) {
            this.numeroConta = numeroConta;
            this.tipoConta = tipoConta;
        }

        public void gravar() {
            System.out.println("Histórico gravado para conta: " + numeroConta);
        }
    }

    public static void main(String[] args) {

        Fisica pf = new Fisica("Ana", "Rua A", "9999-0000", 123456);
        pf.gravar();

        Juridica pj = new Juridica("Empresa X", "Av. B", "2222-1111", 987654);
        pj.gravar();

        ContaComum conta1 = new ContaComum(1, 500, 1);
        conta1.sacar(100);
        conta1.depositar(300);

        Especial contaEsp = new Especial(2, 200, 2, 500);
        contaEsp.sacar(600);

        Historico h = new Historico(2, 2);
        h.gravar();
    }
}


