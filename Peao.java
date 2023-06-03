package robo;

public class Peao extends Robo {

	public Peao(int posicaoy, int posicaox, Plano plano,String nome) {
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
					c.peao.posicaox= c.peao.posicaox+quant;
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
					c.peao.posicaox= c.peao.posicaox-quant;
				}
			 }
		}else {
			System.out.println("movimento invalido");
		}}
		



}
