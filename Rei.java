package robo;

public class Rei extends Robo{


	public Rei(int posicaoy, int posicaox, Plano plano, String nome) {
		super(posicaoy, posicaox, plano, nome);
		// TODO Auto-generated constructor stub
		this.posicaox=posicaox;
		this.posicaoy=posicaoy;
		this.plano=plano;
		this.nome=nome;
	}

	@Override
	void avancar(int quant) {
		// TODO Auto-generated method stub
		if(this.posicaoy+quant<Plano.tamanhoY) {
			for(Celula c : Plano.listaCelulas) {
				if(this.posicaox==c.posicaoX && this.posicaoy==c.posicaoY) {
					c.rei.posicaoy= c.rei.posicaoy+quant;
					c.rei.posicaox= c.rei.posicaox+quant;
				}
			}				
		}
	
	
		else {
			System.out.println("movimento invalido");
		}}

	@Override
	void retroceder(int quant) {
		// TODO Auto-generated method stub
		if(this.posicaox-quant<Plano.tamanhoX) {
			for(Celula c : Plano.listaCelulas) {
				if(this.posicaox==c.posicaoX && this.posicaoy==c.posicaoY) {
					c.rei.posicaoy= c.rei.posicaoy+quant;
					c.rei.posicaox= c.rei.posicaox-quant;
				}
			}				
		}
		else {
			System.out.println("movimento invalido");
		}}	
	

}
