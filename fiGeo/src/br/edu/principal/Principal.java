package br.edu.principal;
import br.edu.figPlanas.*;
public class Principal {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		t1.altura = 5;
		t1.base = 4;
		t1.calcArea();
		
		Quadrado q1 = new Quadrado();
		q1.lado = 5;
		q1.calcArea();
		
		Retangulo r1 = new Retangulo();
		r1.altura = 5;
		r1.base = 4;
		r1.calcArea();
		
		Losango l1 = new Losango();
		l1.diagonalMaior = 5;
		l1.diagonalMenor = 4;
		l1.calcArea();
		
		Circulo c1 = new Circulo();
		c1.raio = 4;
		c1.calcArea();
		
		Pentagono p1 = new Pentagono();
		p1.lado = 5;
		p1.apotema = 4;
		p1.calcArea();
		
		Trapezio tr1 = new Trapezio();
		tr1.altura = 5;
		tr1.baseMaior = 4;
		tr1.baseMenor = 3;
		tr1.calcArea();
		
		Hexagono h1 = new Hexagono();
		h1.lado = 5;
		h1.calcArea();
	}

}
