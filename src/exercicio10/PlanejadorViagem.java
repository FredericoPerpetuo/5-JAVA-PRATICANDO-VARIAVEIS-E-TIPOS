package exercicio10;

public class PlanejadorViagem {
    public static void main(String[] args) {
        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMax = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("Autonomia máxima: " + autonomiaMax + "km");
        System.out.println("Autonomia atual: " + autonomiaAtual + "km");
        if(autonomiaAtual >= distanciaViagem){
            System.out.println("Será possível completar a viagem sem abastecer");
        }else{
            System.out.println("Não será possível completar a viagem sem abastecer");
        }
    }
}
