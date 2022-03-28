package Ex02;

import java.util.Scanner;

public class Principal {
	
	  static Scanner entrada = new Scanner(System.in);
	   
	  public static void main(String[] args) {
	    
	    Estrutura estrutura = new Estrutura(10);
	    String nome; 
	    int idade; 
	    double altura; 
	     
	    //Estrutura de Repeti��o
	    while(true){
	      System.out.println("\n1. Adicionar nova Pessoa");
	      System.out.println("2. Excluir Pessoa");
	      System.out.println("3. Buscar Pessoa");
	      System.out.println("4. Imprimir Agenda");
	      System.out.println("5. Imprimir Pessoa (�ndice)");
	      System.out.println("6. Sair");
	      System.out.print("digite a op��o desejada (apenas numero): ");
	      
	      //M�todo para obter a entrada de dados do usu�rio
	      int opcao = Integer.parseInt(entrada.nextLine());
	      
	      //Estrutura Condicional
	      switch(opcao){
	        case 1:
	          System.out.print("Digite o nome: ");
	          nome = entrada.nextLine();
	          System.out.print("Digite a idade, apenas n�meros: ");
	          idade = Integer.parseInt(entrada.nextLine());
	          System.out.print("Digite a altura (use ponto em vez de v�rgula): ");
	          altura = Double.parseDouble(entrada.nextLine());
	          estrutura.armazenaPessoa(nome, idade, altura);
	          break;
	           
	        case 2:
	          System.out.print("Digite o nome que deseja remover: ");
	          nome = entrada.nextLine();
	          estrutura.removePessoa(nome);
	          break;  
	         
	        case 3:
	          System.out.print("Digite o nome a ser pesquisado: ");
	          nome = entrada.nextLine();
	          int indice = estrutura.buscaPessoa(nome);
	          if(indice < 0){
	            System.out.println("pessoa informada, n�o foi encontrada");
	          }
	          else{
	            System.out.println("pessoa informada foi encontrada: "
	              + indice);
	          }
	           
	          break;  
	         
	        case 4:
	          estrutura.imprimeEstrutura();
	          break;
	         
	        case 5:
	          System.out.print("Digite o �ndice desejado: ");
	          int index = Integer.parseInt(entrada.nextLine());
	          estrutura.imprimePessoa(index);
	          break;  
	           
	        case 6:
	          System.exit(0);
	           
	        default:
	          System.out.println("essa op��o n�o � v�lida");
	          break;
	      }
	    }
	  }
}
