package ClassesEObjetos;

public class atividade01 {

    String modelo;
    String cor;
    float diametro;
    int estoque;
    boolean girando;

    void parado() {
        if (this.girando == false) {
            System.out.print("O Globo não irá girar se ele estiver parado");
        } else {
            System.out.println("O estoque atual do globo terrestre é de: " + this.estoque);
            System.out.println("procurando... Verificando...");
            this.estoque = this.estoque - 1;
            System.out.println("A quantidade de globos no estoque é de: " + this.estoque);
        }
    }

    void girar() {
        this.girando = true;
    }

    void parar() {
        this.girando = false;
    }

    void status(){
        System.out.print("Um globo terrestre " + this.cor);
        if(this.girando == true){
            System.out.println("O globo está girando");
        }
        else{
            System.out.println("O globo está parado");
        }
        System.out.println("Modelo: " + this.modelo);

    }
}