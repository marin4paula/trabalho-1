package robo;

abstract class Robo {

	public int id;
	public String nome;
	public Plano plano;
    public int posicaox;
    public int posicaoy;
	public int pontos;
    public Robo( int posicaox, int posicaoy, Plano plano, String nome) {
	
		this.posicaox=posicaox;
		this.posicaoy=posicaoy;
		this.plano = plano;
		this.nome= nome;
		
		}
	

	abstract void avancar(int quant);

	

	abstract void retroceder(int quant);
	
	
}
