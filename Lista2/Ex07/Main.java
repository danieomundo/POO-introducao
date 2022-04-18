/*

ENUNCIADO: 

Identifique e implemente as classes em Java para a seguinte especificação:

O supermercado vende diferentes tipos de produtos. 
Cada produto tem um preço e uma quantidade em estoque.
Um pedido de um cliente é composto de itens, onde cada item especifica o produto 
que o cliente deseja e a respectiva quantidade. 
Esse pedido pode ser pago em dinheiro, cheque ou cartão.

*/

public class Main {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.nome = "Daniele";
        cliente.idade = 28;
        cliente.formaPagamento = 2;
        cliente.printarPerfilCliente();

        System.out.println("CARRINHO DE COMPRAS: ");
        
        Produto arroz = new Produto();
        arroz.nome = "Arroz";
        arroz.preco = 4;
        arroz.quantidade = 2;

        Produto leite = new Produto();
        leite.nome = "Leite";
        leite.preco = 5;
        leite.quantidade = 3; 

        Produto sache = new Produto();
        sache.nome = "Whiskas Sache";
        sache.preco = 3;
        sache.quantidade = 4; 

        Produto melancia = new Produto();
        melancia.nome = "Melancia";
        melancia.preco = 5;
        melancia.quantidade = 5;

        Produto banana = new Produto();
        banana.nome = "Banana";
        banana.preco = 3;
        banana.quantidade = 6;

        Produto chocolate = new Produto();
        chocolate.nome = "Chocolate";
        chocolate.preco = 6;
        chocolate.quantidade = 10;

        Produto produto = new Produto();
        produto.printarProduto(arroz);
        produto.printarProduto(leite);
        produto.printarProduto(sache);
        produto.printarProduto(melancia);
        produto.printarProduto(banana);
        produto.printarProduto(chocolate);

        Pedido pedido = new Pedido();

        pedido.addItem(arroz);
        pedido.addItem(leite);
        pedido.addItem(sache);
        pedido.addItem(melancia);
        pedido.addItem(banana);
        pedido.addItem(chocolate);
        
        pedido.cliente = cliente;
        pedido.printarPedido();       
        
    }
}
