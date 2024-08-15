package aula15082024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class mexerNaLista {

	public static void gerar(List<Integer> lista, int range, int quantidade) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add(gerador.nextInt(range));
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
