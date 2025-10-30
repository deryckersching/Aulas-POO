[atividade02.java](https://github.com/user-attachments/files/23247099/atividade02.java)
[Uploading atividade02.java…]()
package ClassesEObjetos;

public class Monstro{

    private int derrotas;
    private int empates;

    public Monstro(String nome, String tipo, int nivel, float tamanho, float peso,
                   int forca, int vida, int vitorias, int derrotas, int empates) {

        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void apresentar() {
        System.out.println("Monstro: " + this.getNome());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nível: " + this.getNivel());
        System.out.println("Tamanho: " + this.getTamanho() + " metros");
        System.out.println("Peso: " + this.getPeso() + " kg");
        System.out.println("Força: " + this.getForca());
        System.out.println("Vida: " + this.getVida());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("----------------------------------");
    }

    public void status() {
        System.out.println(this.getNome() + " é um monstro do tipo " + this.getTipo());
        System.out.println("Batalhas: " + this.getVitorias() + "/" + this.getDerrotas() + "/" + this.getEmpates());
    }

    public void ganharBatalha() {
        this.setVitorias(this.getVitorias() + 1);
        this.setNivel(this.getNivel() + 1);
        System.out.println(this.getNome() + " venceu uma batalha! Subiu para o nível " + this.getNivel());
    }

    public void perderBatalha() {
        this.setDerrotas(this.getDerrotas() + 1);
        this.setVida(this.getVida() - 10);
        System.out.println(this.getNome() + " foi derrotado... Vida restante: " + this.getVida());
    }

    public void empatarBatalha() {
        this.setEmpates(this.getEmpates() + 1);
        System.out.println(this.getNome() + " empatou uma batalha!");
    }
}
