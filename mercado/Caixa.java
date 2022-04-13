public class Caixa {
    
    public static void main (String[] args){
        
        Cliente cliente = new Cliente();
        cliente.nome = "Joao da Silva";
        cliente.endereco = "Rua dos Bobos, numero zero";
        
        Produto acucar = new Produto();
        acucar.descricao = "Acucar";
        acucar.preco = 2;
        
        Produto macarrao = new Produto();
        macarrao.descricao = "Macarrao";
        macarrao.preco = (float) 2.5;
    
        Produto feijao = new Produto();
        feijao.descricao = "Feijao";
        feijao.preco = 3;
        
        Pedido pedido = new Pedido();
        
        pedido.addItem(acucar, 5);
        pedido.addItem(macarrao, 2);
        pedido.addItem(feijao, 3);
        
        System.out.println("O total do pedido eh: " +pedido.getTotal());
    }
       
}
