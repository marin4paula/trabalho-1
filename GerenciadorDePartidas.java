package robo;
import java.util.Random;
import java.util.ArrayList;

public class GerenciadorDePartidas {
public Plano plano;
public int quantalunos;
public int quantbugs;
public ArrayList<Aluno> controlaluno;
public ArrayList<Bug> controlbug;


public GerenciadorDePartidas(Plano plano,int quantalunos,int quantbugs) {
	this.plano= plano;
	this.quantalunos=quantalunos;
	this.quantbugs=quantbugs;
	this.controlaluno= new ArrayList<Aluno>();
	this.controlbug= new ArrayList<Bug>();
	
	
	
}

public void povoarRobots() {
	Plano.listaCelulas.get(0).andador= new Andador(1,1,plano,"andador") ;
	Plano.listaCelulas.get(0).bispo= new Bispo(1,1,plano,"bispo") ;
	Plano.listaCelulas.get(0).peao= new Peao(1,1,plano,"peao") ;
	Plano.listaCelulas.get(0).rainha= new Rainha(1,1,plano,"rainha") ;
	Plano.listaCelulas.get(0).rei= new Rei(1,1,plano,"rei") ;
	Plano.listaCelulas.get(0).cavalo= new Cavalo(1,1,plano,"cavalo") ;
	Plano.listaCelulas.get(0).torre= new Torre(1,1,plano,"torre") ;
    

}
public void CreateBugseAlunos() {
    
	
	for(int i=0; i<this.quantbugs; i++) {
		Bug bug= new Bug(plano, aleatoriox(2, Plano.tamanhoX),aleatorioy(2, Plano.tamanhoY));
		this.controlbug.add(bug);
	}
	 
		
	for(int i=0; i< this.quantalunos; i++) {
		this.controlaluno.add(new Aluno(plano, aleatoriox(2, Plano.tamanhoX),aleatorioy(2, Plano.tamanhoY)));
	}
	
	
	
}

public void povoaraeb() {
	CreateBugseAlunos();
	for(Celula c: Plano.listaCelulas) {
		for(Bug b: this.controlbug) {
			if(c.posicaoX==b.posicaox && c.posicaoY==b.posicaoy ) {
				if(c.aluno==null && c.bug==null)
				 c.bug=b;
				
				else
				b.posicaox=aleatoriox(c.posicaoX, Plano.tamanhoX);
				b.posicaoy=aleatorioy(c.posicaoX, Plano.tamanhoY);
				
				}	
			}
		
		for(Aluno a: this.controlaluno) {
			if(c.posicaoX ==a.posicaox && c.posicaoY==a.posicaoy) {
				if(c.aluno==null && c.bug==null)
				c.aluno=a;
				
				else
				a.posicaox=aleatoriox(c.posicaoX, Plano.tamanhoX);
				a.posicaoy=aleatorioy(c.posicaoX, Plano.tamanhoY);	
			}}}}
	


public int aleatoriox(int min, int max) {
	Random random = new Random();
	return random.nextInt((max-min)+1)+min;
	
	
}
public int aleatorioy(int min,int max) {
	Random random = new Random();
	return random.nextInt((max-min)+1)+min;
		
	}

public int acharcelula(int p) {
	for(Celula c : Plano.listaCelulas) {
		if(p==1) {
		 if(c.andador!=null)
			 return c.id-1;
		}
		if(p==2) {
			 if(c.peao!=null)
				 return c.id-1;
		}
        if(p==3) {
        	 if(c.torre!=null)
    			 return c.id-1;
		}
		if(p==4) {
			 if(c.bispo!=null)
				 return c.id-1;
		}
        if(p==5) {
        	 if(c.cavalo!=null)
    			 return c.id-1;
		}
		if(p==6) {
			 if(c.rei!=null)
				 return c.id-1;
		}
		if(p==7) {
			 if(c.rainha!=null)
				 return c.id-1;
		
		}
	}
	return 0;
}

}
