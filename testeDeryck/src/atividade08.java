public class SistemaBanco {

    static class Pessoa {
        protected char nome;
        protected char endereco;
        protected char telefone;

        public Pessoa(char nome, char endereco, char telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
        }

        public void gravar() {
            System.out.println("Gravando dados da Pessoa...");
        }
    }

    static class Fisica extends Pessoa {
        private int cpf;

        public Fisica(char nome, char endereco, char telefone, int cpf) {
            super(nome, endereco, telefone);
            this.cpf = cpf;
        }

        @Override
        public void gravar() {
            System.out.println("Gravando Pessoa Física. CPF: " + cpf);
        }
    }

    static class Juridica extends Pessoa {
        private int cnpj;

        public Juridica(char nome, char endereco, char telefone, int cnpj) {
            super(nome, endereco, telefone);
            this.cnpj = cnpj;
        }

        @Override
        public void gravar() {
            System.out.println("Gravando Pessoa Jurídica. CNPJ: " + cnpj);
        }
    }

    static class ContaComum {
        protected int numero;
        protected int saldo;
        protected int tipo;

        public ContaComum(int numero, int saldo, int tipo) {
            this.numero = numero;
            this.saldo = saldo;
            this.tipo = tipo;
        }

        public void sacar() {
            System.out.println("Saque realizado.");
        }

        public void depositar() {
            System.out.println("Depósito realizado.");
        }
    }

    static class Especial extends ContaComum {
        private int limite;

        public Especial(int numero, int saldo, int tipo, int limite) {
            super(numero, saldo, tipo);
            this.limite = limite;
        }

        @Override
        public void sacar() {
            System.out.println("Saque especial realizado (com limite).");
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
            System.out.println("Gravando histórico da conta " + numeroConta);
        }
    }
    public static void main(String[] args) {

        Fisica pf = new Fisica('A', 'B', 'C', 123456789);
        pf.gravar();

        Juridica pj = new Juridica('X', 'Y', 'Z', 987654321);
        pj.gravar();

        ContaComum cc = new ContaComum(1, 500, 1);
        cc.sacar();
        cc.depositar();

        Especial ce = new Especial(2, 1000, 2, 500);
        ce.sacar();

        Poupanca cp = new Poupanca(3, 1500, 3, 15);

        Historico h = new Historico(1, 1);
        h.gravar();
    }
}



