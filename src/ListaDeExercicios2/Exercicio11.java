/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios2;

import javax.swing.JOptionPane;

/**
 * 
 Escreva um programa que imprima na tela a soma dos números ímpares entre
 0 e 30 e a multiplicação dos números pares entre 0 e 30.
 
 */
public class Exercicio11 {

    public static void main(String[] args) {
        int x = 0, impar=0;
		int i, mp, si, totalPar;
		Long par = new Long(0);
		for(i=0; i<30; i++){  
		if(i%2==0){  
		    if(i>2){  
		    par = par*i;  
		    }  
		    else{  
		    par = new Long(i);  
		    }  
		}  
		else{  
		impar = impar+i;
		}  
		} 
        JOptionPane.showMessageDialog(null, "Soma dos ímpares é: " + impar);
        JOptionPane.showMessageDialog(null, "Multiplicação dos pares é: " + par);
    }
}
