/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios2;

/**
 *
 * @author André
 */
public class Exercicio1 {
 /*   
 Escreva uma classe que represente um país. Um país tem como atributos o seu nome,
o nome da capital, sua dimensão em Km2 e uma lista de países com os quais ele faz
fronteira. Represente a classe e forneça os seguintes construtores e método:  
a) Construtor que inicialize o nome, capital e a dimensão do país; 
b) Métodos de acesso (obter/get) para as propriedades indicadas no item (a);
c) Um método que permita verificar se dois países são iguais. Dois países são 
iguais se tiverem o mesmo nome e a mesma capital. A assinatura deste método deve ser:
d) public boolean equals(final Pais outro);
e) Um método que define quais outros países fazem fronteira (note que um país não pode
fazer fronteira com ele mesmo);
f) Um método que retorne a lista de países que fazem fronteira;
g) Um método que receba um outro país como parâmetro e retorne uma lista de vizinhos
comuns aos dois países.
 */
public class Pais {
	private String nome, capital;
	private double dimensao;
	private Pais[] fronteiras;
// RESPOSTA a)
	public Pais(String nome, String capital, double dimensao) {
	    this.nome = nome;
	    this.dimensao = dimensao;
            this.capital = capital;
	}
// RESPOSTA c)
	public boolean equals(Pais outro) {
		return this.nome.equals(outro.getNome())
				&& this.capital.equals(outro.getCapital());
	}
// RESPOSTA d)
	public void setFronteiras(Pais... paises) {
		
		int quantidadePaisesIguais = 0;
		for(int i = 0; i < paises.length; i++) {
			if(this.equals(paises[i])) {
				quantidadePaisesIguais++;
			}
		}
		
		this.fronteiras = new Pais[paises.length - quantidadePaisesIguais];
		int idxFronteira = 0;
		for(int i = 0; i < paises.length; i++) {
			if(!this.equals(paises[i])) {
				this.fronteiras[idxFronteira] = paises[i];
				idxFronteira++;
			}
		}
		
	}
// RESPOSTA e)
	public Pais[] getFronteiras() {
		return this.fronteiras;
	}
// RESPOSTA f)
	public Pais[] vizinhosEmComum(Pais outro) {
		int totaisIguais = 0;
		for(Pais fronteiraPais: this.fronteiras) {
			for(Pais fronteiraOutro: outro.fronteiras) {
				if(fronteiraPais.equals(fronteiraOutro)) {
					totaisIguais++;
				}
			}
		}
		
		if(totaisIguais > 0) {
			int idxVizinhos = 0;
			Pais[] mesmosVizinhos = new Pais[totaisIguais];
			for(Pais fronteiraPais: this.fronteiras) {
				for(Pais fronteiraOutro: outro.fronteiras) {
					if(fronteiraPais.equals(fronteiraOutro)) {
						mesmosVizinhos[idxVizinhos] = fronteiraOutro;
						idxVizinhos++;
					}
				}
			}
			
			return mesmosVizinhos;
		}
		
		return null;
	}
// RESPOSTA b) 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

    }
}