package tableau_tri_QuickSort;

import java.util.Arrays;

public class Test_quickSort {

	public static void main(String[] args) {

		/*========== Arrays.sort() ============*/
		System.out.println("methode Arrays.sort()");
		int[] tab2 = {81, 83, 75, 03, 55, 42, 07, 01, 07, 74, 32, 28, 05};
		System.out.println(Arrays.toString(tab2));
	
		int boucle2 = 1000;
		long dureeTotale2 = 0;
		long dureeMoySort;
		
		for (int i = 0; i< boucle2 ; i++) {			
			long beginTime = System.nanoTime();			
			Arrays.sort(tab2);			
			long endTime = System.nanoTime();
			long duration = endTime - beginTime;			
			dureeTotale2 += duration;
		}
		dureeMoySort = dureeTotale2 / boucle2;		
		
		System.out.println(Arrays.toString(tab2));
		System.out.println("duree d'execution : "+dureeMoySort+"nanos");
		
		/*========== QuickSort.quickSort() ============*/
		System.out.println("methode QuickSort.quickSort()");
		int[] tab = {81, 83, 75, 03, 55, 42, 07, 01, 07, 74, 32, 28, 05};
		System.out.println(Arrays.toString(tab));
		
		int boucle = 1000;
		long dureeTotale = 0;
		long dureeMoyQuickSort;
		
		for (int i = 0; i< boucle ; i++) {			
			long beginTime = System.nanoTime();			
			QuickSort.quickSort(tab);			
			long endTime = System.nanoTime();
			long duration = endTime - beginTime;			
			dureeTotale += duration;
		}
		dureeMoyQuickSort = dureeTotale / boucle;		
		
		System.out.println(Arrays.toString(tab));
		System.out.println("duree d'execution : "+dureeMoyQuickSort+"nanos");
		
		
	}

}
