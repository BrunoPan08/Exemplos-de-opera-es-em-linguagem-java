package digital.innovation.List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        //adiciona 4 esportes no vector
        esportes.add("futebol");
        esportes.add("Volei");
        esportes.add("Ciclismo");
        esportes.add("Basquete");

        //altera o valor da posicao 2 no vetor
        esportes.set(2, "Ping Pong");

        //Remove o esporte da posicao 2
        esportes.remove(2);

        //Remove o esporte Handebol do vetor
        esportes.remove("Volei");

        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navega nos esportes
        for (String esporte:esportes){
            System.out.println(esporte);
        }

    }
}
