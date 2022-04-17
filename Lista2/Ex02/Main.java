public class Main {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Daniele";
        pessoa.idade = 28;
        
        System.out.println("Nome: " +pessoa.nome + "\nIdade: " +pessoa.idade);
        
        pessoa.niver(3); //fazendo 3 aniversários
        
        System.out.println("ATUALIZANDO: \n " +"Nome: "+pessoa.nome+"\nIdade: "+pessoa.idade);     
      
    }          
}
