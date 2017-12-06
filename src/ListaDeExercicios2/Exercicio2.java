/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author André
 */
/*Implementação da classe Arrays
Criar uma classe Arrays que contém um array de inteiros
Criar um método “soma” que percorra e retorne a soma de todos os elementos do vetor Criar um método main que:
Crie uma instância da classe Arrays
Leia inteiros do console e armazene os valores no vetor da classe Arrays.
Imprima a soma dos números através do método soma
*/
public class Exercicio2 {
    public static void main(String[] args) {
        
         int[] vetor = {1,2,3,4,5,6,7,8,9}; // Vetor já com valores preenchidos.
            int soma = 0; // inicia variavel soma com 0.
        
//Entrada de dados
        for(int i = 0; i < vetor.length; i++){
                   soma = soma +  vetor[i]; // soma a variavel soma com cada valor dos indices do vetor. 
            }
            System.out.println("Total: "+soma); // Total: 15     
        }

}