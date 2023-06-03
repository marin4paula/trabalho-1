package robo;

import java.util.ArrayList;

public class Plano {
	public static int tamanhoY;
	public static int tamanhoX;
	public static int quantce;
	public static ArrayList<Celula> listaCelulas;

	public Plano(int tamanhoX, int tamanhoY) {
		Plano.tamanhoY= tamanhoY;
		Plano.tamanhoX=tamanhoX;
		listaCelulas = new ArrayList<Celula>();

		int contador = 1;
		for (int i = 1; i <= tamanhoX; i++) {
			for (int j = 1; j <= tamanhoY; j++) {
				Celula celula = new Celula(contador, i, j);
				Plano.listaCelulas.add(celula);
				contador++;
			}
		}
	    this.quantce=contador;
		}
	public static void mostrarplano() {
		int contador = 0;
		for (int i = 1; i <= Plano.tamanhoX; i++) {
			for (int j = 1; j <= Plano.tamanhoY; j++) {
				if(Plano.listaCelulas.get(contador).andador!=null && Plano.listaCelulas.get(contador).bispo!=null && Plano.listaCelulas.get(contador).cavalo!=null && Plano.listaCelulas.get(contador).peao!=null && Plano.listaCelulas.get(contador).rainha!=null && Plano.listaCelulas.get(contador).rei!=null && Plano.listaCelulas.get(contador).torre!=null) {
					System.out.print("[R]");
				}
				else {
					System.out.print("[ ]");
				}
				contador++;
			}
			System.out.println();
			}
		
		
	}
}
	

	
