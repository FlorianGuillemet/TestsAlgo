package tableau_recherche_dichotomique;

public class A_Dichotomique {
	
	public static boolean exists(int[] tab, int val) {
        
		boolean trouve = false;
		
		int iDeb = 0; //indice de début. Intervalle de recherche compris entre 0 ...
		int iFin = tab.length; //indice de fin.  ...et le nombre de valeurs du tableau 
		int iMil = 0; //indice de "milieu"
		int x = 1;	//témoin du nombre d'itérations
		
		System.out.println("valeur = "+val+" | nombre de valeurs du tableau : "+ iFin);
		/*Boucle de recherche*/
		/*Tant que trouve est faux et que tant qu'il existe un intervalle*/
		while (!trouve && ((iFin - iDeb) >1) ) {
			
			iMil = (iDeb + iFin)/ 2;
			
			System.out.println("Iteration "+ x++ +". tab[iMil: "+iMil+"]"+" = "+ tab[iMil]);
			
			trouve = (tab[iMil] == val);	// Si la valeur recherchée est à l'indice du milieu, alors on sette trouvé à true.
			
			if (tab[iMil] > val ) iFin = iMil;	// Si la valeur à l'indice du milieu est superieure à la valeur recherchée, alors l'indice de fin "devient" l'indice du milieu. 
												// Veut dire que la valeur recherchée se situe dans la première moitié du tableau.									
												// Pour restreindre la recherche à la prochaine boucle.  
			
			else iDeb = iMil;	// Sinon l'indice de Début "devient" l'indice du milieu
			
		}		
		
		return trouve;
	}

}
