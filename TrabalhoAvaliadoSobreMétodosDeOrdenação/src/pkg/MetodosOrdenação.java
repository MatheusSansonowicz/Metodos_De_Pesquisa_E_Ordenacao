package pkg;

import java.util.ArrayList;

public class MetodosOrdenação {

	static void bolha(ArrayList<Aluno> listaInicial, ArrayList<Aluno> listaFinal) {
		listaFinal.addAll(listaInicial);
		boolean houveTroca;
	    do {
	        houveTroca = false;
	        for (int i = 0; i < (listaFinal.size()-1); i++) {
	        	Aluno a1 = listaFinal.get(i);
	        	Aluno a2 = listaFinal.get(i+1);
	            if (comparadorDeAluno(a1, a2)>0) {
	                houveTroca = true;
	                listaFinal.set(i, a2);
                    listaFinal.set(i + 1, a1);
	            }
	        }
	    } while (houveTroca);
	}
	
	void selecao(ArrayList<Aluno> listaInicial, ArrayList<Aluno> listaFinal) {
		listaFinal.addAll(listaInicial);
		Aluno aux;
		int n = listaFinal.size(), i, posMenor;
	    for (i = 0; i < n-1; i++) {
	        posMenor = i;
	        for (int j = i+1; j < n; j++) {
	            if (comparadorDeAluno(listaFinal.get(j),
	            		listaFinal.get(posMenor)) < 0) {
	                posMenor = j;
	            }
	        }
	        
	    }
	    if (posMenor != i) {
	        aux = listaFinal.get(i);
	        listaFinal.set(i, listaFinal.get(posMenor));
	        listaFinal = aux;
	    }
	    
	}
	
	void insercao(ArrayList<Aluno> listaInicial, ArrayList<Aluno> listaFinal) {
	    int i, j, aux;

	    for (i = 1; i < n; i++) {
	        aux = vetor[i];
	        for (j = i-1; j > 0 && aux < vetor[j]; j--) {
	            vetor[j+1] = vetor[j];
	        }
	        vetor[j+1] = aux;
	    }
	}
	
	static int comparadorDeAluno(Aluno a1, Aluno a2){
		int ComparaNome = a1.getNome().compareTo(a2.getNome());
		if(ComparaNome!=0) {
			return ComparaNome;
		}
		else {
			return Integer.compare(a1.getIdade(), a2.idade);
		}
	}
}
