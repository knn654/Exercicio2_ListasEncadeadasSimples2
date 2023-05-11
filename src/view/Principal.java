package view;

import model.*;

public class Principal {

	public static void main (String[] args) throws Exception {
		Lista A = new Lista();
		Lista B = new Lista();
		Lista I = new Lista();
		Lista U = new Lista();
		int i,j;
		A.addFirst(3);
		A.addLast(5);
		A.addLast(8);
		A.addLast(12);
		A.addLast(9);
		A.addLast(7);
		A.addLast(16);
		
		B.addFirst(9);
		B.addLast(6);
		B.addLast(2);
		B.addLast(3);
		B.addLast(7);
		
		for(i = 0; i< A.size(); i++) {
			for (j = 0; j < B.size(); j++) {
				if (A.get(i) == B.get(j)) {
					I.addLast(A.get(i));
				}
			}
		}
		for(i = 0; i< A.size(); i++) {
			U.addLast(A.get(i));
		}
		for(i = 0; i< B.size(); i++) {
			U.addLast(B.get(i));
		}
		
		System.out.println("Lista A:");
		for(i = 0; i< A.size(); i++) {
			System.out.print(A.get(i) + " - ");
		}
		System.out.println();
		System.out.println("Lista B:");
		for(i = 0; i< B.size(); i++) {
			System.out.print(B.get(i) + " - ");
		}
		System.out.println();
		System.out.println("União:");
		for(i = 0; i< U.size(); i++) {
			System.out.print(U.get(i) + " - ");
		}
		System.out.println();
		System.out.println("Interseção");
		for(i = 0; i< I.size(); i++) {
			System.out.print(I.get(i) + " - ");
		}
		System.out.println();
	}
}
