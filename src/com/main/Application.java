package com.main;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
//		int[] dizi = new int[20];
//		Random a = new Random();
//		int change;
//			for (int i = 0; i < dizi.length; i++) {
//				int r = a.nextInt(20);
//				dizi[i] = r;
//				System.out.print(dizi[i]+" ");
//			}
//			for (int j = 0; j < dizi.length; j++) {
//				for (int k = 0; k < dizi.length; k++) {
//					if(dizi[j]<dizi[k]) {
//						change = dizi[k];
//						dizi[k] = dizi[j];
//						dizi[j] = change;
//				    }
//				}
//			}
//			for (int e = 0; e < dizi.length; e++) {
//				System.out.printf("%3d",dizi[e]," ");
//			}
		// Siralama Algoritmaları 1-Buble sort (Kabarcık Sıralama)
		int [] dizi = new int[20];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random()*21);
		}
		int temp;
		for (int e = 0; e < dizi.length; e++) {
			System.out.printf("%3d",dizi[e]);
		}
		System.out.println();
		for (int j = 0; j < dizi.length-1; j++) {
			for (int k = 0; k < dizi.length-1-j; k++) {
				if(dizi[k]>dizi[k+1]) {
					temp = dizi[k+1];
					dizi[k+1] = dizi[k];
					dizi[k] = temp;
				}
			}
		}
		for (int l = 0; l < dizi.length; l++) {
			System.out.printf("%3d",dizi[l]);
		}	
	}

}
