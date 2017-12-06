/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios2;
import java.util.Scanner;
/**
 *
 * @author André
 */
/*
Crie uma classe java MaiorNumero que contenha um método que receba
dois números inteiros e imprima o maior entre eles.

*/
public class Exercicio9 {
    public static void main(String[] args)
    {
        //Declaração de variaveis
        
        Scanner entrada;
        int n1;
        int n2;

        entrada = new Scanner(System.in);

        //Entrada dos dados
        
        System.out.println("Insira o primeiro numero:");
        n1 = entrada.nextInt();
        System.out.println("Insira o primeiro numero:");
        n2 = entrada.nextInt();
        
        //Verificando qual é o maior dos números informados
        
        if (n1 > n2)
        System.out.printf("O numero " + n1 + " eh maior");
        else 
        {
            if(n2 > n1) 
            System.out.printf("O numero " + n2 + " eh maior");
            
            else
                System.out.printf("Os numeros digitados sao iguais");
        }
    }
}