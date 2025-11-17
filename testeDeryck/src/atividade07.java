public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println(nome + " fez aniversário! Agora tem " + idade + " anos.");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo;
    }
}

public class Visitante extends Pessoa {

    public Visitante(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }
    @Override
    public String toString() {
        return "Visitante -> " + super.toString();
    }
}

public class Aluno extends Pessoa {
    protected int matricula;
    protected String curso;

    public Aluno(String nome, int idade, char sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void pagarMensalidade() {
        System.out.println(nome + " pagou a mensalidade do curso " + curso + ".");
    }

    @Override
    public String toString() {
        return "Aluno -> " + super.toString() +
                ", Matrícula: " + matricula + ", Curso: " + curso;
    }
}

public class Bolsista extends Aluno {
    private double bolsa;

    public Bolsista(String nome, int idade, char sexo, int matricula, String curso, double bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println(nome + " teve sua bolsa renovada!");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(nome + " é bolsista! Pagamento facilitado com desconto.");
    }

    @Override
    public String toString() {
        return "Bolsista -> " + super.toString() + ", Bolsa: R$" + bolsa;
    }
}

public class Tecnico extends Aluno {
    private int registroProfissional;

    public Tecnico(String nome, int idade, char sexo, int matricula, String curso, int registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println(nome + " está realizando prática profissional!");
    }

    @Override
    public String toString() {
        return "Técnico -> " + super.toString() + ", Registro: " + registroProfissional;
    }
}

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, char sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(double valor) {
        this.salario += valor;
        System.out.println(nome + " recebeu aumento de R$" + valor + ". Novo salário: R$" + salario);
    }

    @Override
    public String toString() {
        return "Professor -> " + super.toString() +
                ", Especialidade: " + especialidade + ", Salário: R$" + salario;
    }
}

