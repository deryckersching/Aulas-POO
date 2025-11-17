package ClassesEObjetos;

public class Notebook {

    private String marca;
    private String modelo;
    private double preco;
    private int memoriaRAM;
    private boolean ligado;

    public Notebook(String marca, String modelo, double preco, int memoriaRAM) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.memoriaRAM = memoriaRAM;
        this.ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public boolean isLigado() {
        return ligado;
    }
    public void ligar() {
        this.ligado = true;
        System.out.println("O notebook " + this.marca + " foi ligado!");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O notebook " + this.marca + " foi desligado!");
    }

    public void exibirStatus() {
        System.out.println("----- STATUS DO NOTEBOOK -----");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Memória RAM: " + this.memoriaRAM + " GB");
        if (this.ligado) {
            System.out.println("O notebook está ligado!");
        } else {
            System.out.println("O notebook está desligado!");
        }
        System.out.println("------------------------------");
    }
}



