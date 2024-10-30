package itz;
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;



public class TADConjunto {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				TDAConjunto a,b,c,d;
				a=new TDAConjunto(1,2,3,4,6,8,9);
				b=new TDAConjunto(7,9,8,6,5);
				c=a.union(a, b);
				d=a.interseccion(a, b);
				JOptionPane.showMessageDialog(null, "A="+a+"\nB="+b+"\nAUB="+c+"\nA interseccion B="+d,"TDA Conjuntos",JOptionPane.INFORMATION_MESSAGE);

		
		
		



	}
}
