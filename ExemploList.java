package digital.innovation.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("Juliana");
        nomes.add("Bruno");
        nomes.add("Pedro");
        nomes.add("Joao");

        System.out.println(nomes);

        nomes.set(2,"Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2,"Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        int posicao = nomes.indexOf("Carlos");

        System.out.println(posicao);

        String nome = nomes.get(1);

        System.out.println(nome);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);

        boolean tembruno = nomes.contains("Bruno");

        System.out.println(tembruno);

        for (String nomeDoItem: nomes){
            System.out.println("-->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("--->" + iterator.next());
        }

        nomes.clear();

        boolean listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

    }

}
