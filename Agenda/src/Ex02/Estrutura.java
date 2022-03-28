package Ex02;

public class Estrutura {
	  private Pessoa pessoas[];
		 
		 
	  public Estrutura(int quantidade){
	    pessoas = new Pessoa[quantidade];
	  }
	 
	  public void armazenaPessoa(String nome, int idade, double altura){
	    
	    boolean cadastrado = false;
	    for(int i = 1; i < pessoas.length; i++){
	      if(pessoas[i] == null){
	        
	        Pessoa p = new Pessoa(nome, idade, altura); 
	        
	        pessoas[i] = p;
	        
	        cadastrado = true;
	        break; 
	      }
	    }
	     
	    if(cadastrado){
	      System.out.println("Cadastro efetuado com sucesso");
	    }
	    else{
	      System.out.println("Agenda lotada, não foi possível cadastrar.");
	    }
	  }
	 
	  
	  public void removePessoa(String nome){
	   
	    boolean excluido = false;
	    for(int i = 0; i < pessoas.length; i++){
	      if(pessoas[i] != null){
	       
	        if(pessoas[i].getNome().equals(nome)){
	          pessoas[i] = null; 
	          excluido = true;
	          break; 
	        }
	      }
	    }
	     
	    if(excluido){
	      System.out.println("pessoa removida com sucesso");
	    }
	    else{
	      System.out.println("pessoa não encontrada, impossivel remover.");
	    }
	  }
	 
	   
	  public int buscaPessoa(String nome){
	    int resultado = -1;
	     
	    
	    for(int i = 0; i < pessoas.length; i++){
	      if(pessoas[i] != null){
	        
	        if(pessoas[i].getNome().equals(nome)){
	          resultado = i;
	          break; 
	        }
	      }
	    }
	     
	    return resultado;
	  }
	 
	  
	  public void imprimeEstrutura(){
	    
	    for(int i = 0; i < pessoas.length; i++){
	      if(pessoas[i] != null){
	        Pessoa p = pessoas[i];
	        System.out.println("\nNome: " + p.getNome());
	        System.out.println("Idade: " + p.getIdade());
	        System.out.println("Altura: " + p.getAltura());
	      }
	    }
	  }
	 
	  
	  public void imprimePessoa(int index){
	    
	    if((index < 0) || (index > (pessoas.length - 1))){
	      System.out.println("\nÍndice inválido");
	    }
	    else{
	      Pessoa p = pessoas[index];
	      if(p == null){
	        System.out.println("\nNão existe pessoa nesse índice ainda.");
	      }
	      else{
	        System.out.println("\nNome: " + p.getNome());
	        System.out.println("Idade: " + p.getIdade());
	        System.out.println("Altura: " + p.getAltura());
	      }
	    }
	  }  
}
