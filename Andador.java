package robo;

public class Andador extends Robo{

	public Andador(int posicaoy, int posicaox, Plano plano,String nome) {
		super(posicaoy, posicaox, plano,nome);
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
				c.andador.posicaoy= c.andador.posicaoy+quant;
			}
		}
			
		}else {
			System.out.println("movimento invalido");
		}}

	@Override
	void retroceder(int quant) {
		// TODO Auto-generated method stub
		if(this.posicaoy-quant<1) {
			for(Celula c : Plano.listaCelulas) {
				if(this.posicaox==c.posicaoX && this.posicaoy==c.posicaoY) {
					c.andador.posicaoy= c.andador.posicaoy-quant;
				}
			 }
		}
		else {
			System.out.println("movimento invalido");
		}
	}
		
 
}
