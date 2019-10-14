package tp.imperative.java;

import java.util.Arrays;

public class TriBulle {

	public static void main(String[] args) {
		int tab[]={5,2,8,3,4,9,7,1};

		for (int i = tab.length-1; i>0; i--) {
			for (int j = 0; j<=i-1; j++) {
					

				if (tab[j]>tab[j+1]){
					int  tmp=tab[j+1];
					tab[j+1]=tab[j];
					tab[j]=tmp;
				}
			}			
			
			
		}
		
		
		System.out.println(Arrays.toString(tab));	
		
	}
}
