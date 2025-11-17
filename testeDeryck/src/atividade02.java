package ClassesEObjetos;

public class GloboTerrestre {

    private String modelo;
    private String cor;
    private float diametro;
    private int estoque;
    private boolean girando;

    public GloboTerrestre(String modelo, String cor, float diametro, int estoque) {
        this.modelo = modelo;
        this.cor = cor;
        this.diametro = diametro;
        this.estoque = estoque;
        this.girando = false;
    }
    public void parado() {
        if (!this.girando) {
            System.out.println("O globo não irá girar se ele estiver parado.");
        } else {
            System.out.println("O estoque atual do globo terrestre é de: " + this.estoque);
            System.out.println("Procurando... Verificando...");
            this.estoque = this.estoque - 1;
            System.out.println("A quantidade de globos no estoque é de: " + this.estoque);
        }
    }

    public void girar() {
        this.girando = true;
    }

    public void parar() {
        this.girando = false;
    }

    public void status() {
        System.out.print("Um globo terrestre " + this.cor + " — ");
        if (this.girando) {
            System.out.println("o globo está girando.");
        } else {
            System.out.println("o globo está parado.");
        }
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Diâmetro: " + this.diametro + " cm");
        System.out.println("Estoque atual: " + this.estoque);
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean isGirando() {
        return girando;
    }
}



