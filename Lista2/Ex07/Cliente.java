public class Cliente {
  
    String nome;
    int idade;
    int formaPagamento;
    
    public void printarPerfilCliente(){

        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        
        if (formaPagamento == 1){
            System.out.println("Forma de pagamento escolhida: DINHEIRO.");
        } 
        else if (formaPagamento == 2){
            System.out.println("Forma de pagamento escolhida: CARTAO.");               
        } 
        else if (formaPagamento == 3){
            System.out.println("Forma de pagamento escolhida: CHEQUE.");
        } 
        else {
            System.out.println("Informe uma forma de pagamento válida.");
        }
      
        System.out.println();
        
        }        
    }
