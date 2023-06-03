package robo;
import java.util.ArrayList;
import java.util.Scanner;
public class Partida {
		public String jogador;
		public Plano plano;
		int tamanhoX;
		int tamnhoY;
		int quantalunos;
		int quantbugs;
		public GerenciadorDePartidas gerenciador;
		
		Scanner input = new Scanner(System.in);
		
		public Partida(String jogador, int tamanhoX,int tamanhoY,int quantalunos, int quantbugs ) {
			this.tamanhoX= tamanhoX;
			this.tamnhoY= tamanhoY;
			this.quantalunos= quantalunos;
			this.quantbugs= quantbugs;
			this.jogador= jogador;
			Plano p= new Plano(tamanhoX, tamanhoY);
			this.plano=p;
		    GerenciadorDePartidas g= new GerenciadorDePartidas(p,quantalunos,quantbugs);
		    jogar(g);
		    
		    }
		 
        public int moverobo(int id, int acao) {
         int quant=0;
        	switch(id) {
    	
        case 1:
        	quant=1;
    		System.out.println("voce irá mover uma posicao");
    		break;
        case 2:
        		System.out.println("voce quer mover 1 ou 2 posicoes?");		
        		quant=input.nextInt();
        	break;
        case 3:
            System.out.println("voce quer mover 1 ou 4 posicoes?");		
    		quant=input.nextInt();
    		break;
    		}
        
          return quant;
    			    	
    	 }
    			 
        
		 
		    public void jogar(GerenciadorDePartidas g) {
		     g.povoarRobots();
		     g.povoaraeb();
		     String continuar ="s";
		     int id = 0;
		     int acao=0;
		     int p=0;
		     while(continuar.equals("s")) {
		    	 System.out.println("\nxxxxxxxxxxxx ILHA DE JAVA xxxxxxxxxxxxxx"); 
                 Plano.mostrarplano();
		    	 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
		    	 System.out.println("deseja continuar no jogo? s/n");
		    	 continuar= input.nextLine();
		    	 System.out.println("qual robo voce deseja mexer?escolha de um a sete");
		        System.out.println("|1| Robô Andador");
				System.out.println("|2| Robô Peão    ");
				System.out.println("|3| Robô Torre   ");
		    	System.out.println("|4| Robô Bispo ");
				System.out.println("|5| Robô Cavalo  ");
				System.out.println("|6| Robô Rei     ");
				System.out.println("|7| Robô Rainha  ");
                id= input.nextInt();
                System.out.println("digite 1 para avancar ou 2 para retroceer?");
                acao = input.nextInt();
                switch(id) {
				case 1:
					if(acao==1) {
						System.out.println(g.acharcelula(acao));
						Plano.listaCelulas.get(g.acharcelula(acao)).andador.avancar(moverobo(3,acao));
						 
					}
					if(acao==2) {
						Plano.listaCelulas.get(g.acharcelula(acao)).andador.retroceder(moverobo(3,acao));
					}
					break;
				case 2:
					if(acao==1) {
						Plano.listaCelulas.get(g.acharcelula(acao)).peao.avancar(moverobo(1,acao));
					}
					if(acao==2) {
						Plano.listaCelulas.get(g.acharcelula(acao)).peao.retroceder(moverobo(1,acao));
					}
					break;
				case 3:
					if(acao==1) {
						Plano.listaCelulas.get(g.acharcelula(acao)).torre.avancar(moverobo(2,acao));
					}
					if(acao==2) {
						Plano.listaCelulas.get(g.acharcelula(acao)).torre.retroceder(moverobo(2,acao));
					}
					
					break;
				case 4:

					if(acao==1) {
						Plano.listaCelulas.get(g.acharcelula(acao)).bispo.avancar(moverobo(2,acao));
					}
					if(acao==2) {
						Plano.listaCelulas.get(g.acharcelula(acao)).bispo.retroceder(moverobo(2,acao));
					}
					break;
				case 5:
					if(acao==1) {
						Plano.listaCelulas.get(g.acharcelula(acao)).cavalo.avancar(moverobo(2,acao));
					}
					if(acao==2) {
						Plano.listaCelulas.get(g.acharcelula(acao)).cavalo.retroceder(moverobo(2,acao));
					}
					break;
				case 6:
					if(acao==1) {
						Plano.listaCelulas.get(g.acharcelula(acao)).rei.avancar(moverobo(3,acao));
					}
					if(acao==2) {
						Plano.listaCelulas.get(g.acharcelula(acao)).rei.retroceder(moverobo(3,acao));
					}
					break;
				case 7:
					if(acao==1) {
						Plano.listaCelulas.get(g.acharcelula(acao)).rainha.avancar(moverobo(3,acao));
					}
					if(acao==2) {
						Plano.listaCelulas.get(g.acharcelula(acao)).rainha.retroceder(moverobo(3,acao));
					}
					break;
				default:
					System.out.println("O Robô inserido não existe!");
					break;
				}
                
                Plano.mostrarplano();
                }}
                
                
                }
                 
                
		    		 
		    	 
		    	 
		       
		     
		     
		
		
		
		



