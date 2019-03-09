package tableau_recherche_dichotomique;


public class rechercheDicho {

	public static void main(String[] args) {
		// Objectif : rechercher une valeur dans un tableau ordonné. 
		// Renvoyer true si la valeur est trouvée, false sinon.
		// La recherche dichotomique permet de réduire le nombre d'itération, soit le nombre de passage dans la boucle (qui évalue si la valeur recherchée est égale à la valeur du tableau à l'indice).
		// Gain de temps de calcul
		
		int[] tab = {1, 8, 10, 14, 16, 17, 19, 25, 26, 28, 29, 30, 32, 35, 42, 46, 48, 49, 50, 51, 60, 65, 70, 72, 73, 74, 76, 80, 81, 83, 85, 90, 92, 106};
		
		System.out.println(A.exists(tab, 32));
		
		System.out.println(A.exists(tab, 52));		
		
		System.out.println(A_Dichotomique.exists(tab, 32));
		
		System.out.println(A_Dichotomique.exists(tab, 52));		

	}

}
