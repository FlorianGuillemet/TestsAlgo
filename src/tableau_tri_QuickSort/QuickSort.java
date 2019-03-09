package tableau_tri_QuickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	public static void quickSort(int[] tab) {
		quickSort(tab, 0, tab.length-1);
	}
	
	private static void quickSort(int[] tab, int first, int last) {
		//Condition pour arrêter la récursivité quand les index sont égaux.
		if (first < last+1) {
			int p = partitionner(tab, first, last);
			quickSort(tab, first, p-1);	//la partition de gauche
			quickSort(tab, p+1, last);	//la partition de droite
		}
	}

	//Methode d'échange des valeurs
	private static void echanger(int[] tab, int index1, int index2) {
		int temp = tab[index1];
		tab[index1] = tab[index2];
		tab[index2] = temp;		
	}
	
	// Methode qui retourne un pivot compris entre la premiere et la derniere borne.
	private static int getPivot(int first, int last) {
		Random rand = new Random();
		return rand.nextInt((last - first) + 1) + first;
	}

	// Methode de partitionnement.
	// Echange les positions de la premiere valeur avec celle du pivot
	private static int partitionner(int[] tab, int first, int last) {
		
		echanger(tab, first, getPivot(first, last));
		
		int limite = first + 1;
		//Boucle de comparaison de valeurs avec le pivot. 
		//Et echange des valeurs
		for (int i = limite; i <= last; i++) {
			if (tab[i] < tab[first]) {
				echanger(tab, i, limite++);
			}
		}
		
		echanger(tab, first, limite-1);
		return limite-1;
	}
	
}
