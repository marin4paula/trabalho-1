package robo;

import java.util.ArrayList;

public class Celula {

	public int posicaoX;
	public int posicaoY;
	public int id;
	public Torre torre;
	public Andador andador;
	public Cavalo cavalo;
	public Rei rei;
	public Rainha rainha;
	public Bispo bispo;
	public Peao peao;
	public Aluno aluno;
	public Bug bug;

	public Celula(int id, int x, int y) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
	}

	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
}
