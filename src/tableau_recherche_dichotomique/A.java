package tableau_recherche_dichotomique;

public class A {
	
	public static boolean exists(int[] tab, int val) {
        
		boolean isPresent = false;
		
		int i = 0;
		int x = 1;	//t�moin du nombre d'it�rations

		while (isPresent == false & i < tab.length) {
						                
		    if (tab[i] == val) {
		    	isPresent = true;

		    }
		    
		    System.out.println("Iteration "+ x++ +".");
			
		    i++;
		    
		}	    
	    	    
	    return isPresent;					
	}

}
