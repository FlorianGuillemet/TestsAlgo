package tableau_recherche_dichotomique;

public class A_Dichotomique {
	
	public static boolean exists(int[] tab, int val) {
        
		boolean trouve = false;
		
		int iDeb = 0; //indice de d�but. Intervalle de recherche compris entre 0 ...
		int iFin = tab.length; //indice de fin.  ...et le nombre de valeurs du tableau 
		int iMil = 0; //indice de "milieu"
		int x = 1;	//t�moin du nombre d'it�rations
		
		System.out.println("valeur = "+val+" | nombre de valeurs du tableau : "+ iFin);
		/*Boucle de recherche*/
		/*Tant que trouve est faux et que tant qu'il existe un intervalle*/
		while (!trouve && ((iFin - iDeb) >1) ) {
			
			iMil = (iDeb + iFin)/ 2;
			
			System.out.println("Iteration "+ x++ +". tab[iMil: "+iMil+"]"+" = "+ tab[iMil]);
			
			trouve = (tab[iMil] == val);	// Si la valeur recherch�e est � l'indice du milieu, alors on sette trouv� � true.
			
			if (tab[iMil] > val ) iFin = iMil;	// Si la valeur � l'indice du milieu est superieure � la valeur recherch�e, alors l'indice de fin "devient" l'indice du milieu. 
												// Veut dire que la valeur recherch�e se situe dans la premi�re moiti� du tableau.									
												// Pour restreindre la recherche � la prochaine boucle.  
			
			else iDeb = iMil;	// Sinon l'indice de D�but "devient" l'indice du milieu
			
		}		
		
		return trouve;
	}

}
