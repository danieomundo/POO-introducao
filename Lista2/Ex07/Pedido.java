import java.util.ArrayList;

public class Pedido {
    
    Cliente cliente;
    ArrayList <Item> itens = new ArrayList<>();

    public void addItem(Produto produto) {
           
        Item item = new Item();
        
        item.nome = produto.nome;
        item.preco = produto.preco;
        item.quantidade = produto.quantidade;
        itens.add(item);
    }

    float getSubTotal(Item item){
        return item.preco * item.quantidade;
    }

    public void printarPedido(){
        System.out.println("\nPedido de "+ cliente.nome + ": ");
        float totalAPagar = 0;
        
        for (Item item : itens) {
            System.out.println("Nome do item: " + item.nome);
            System.out.println("Preco do item: "+ item.preco);
            System.out.println("Quantidade do item: "+ item.quantidade);
            float subTotalAtual = getSubTotal(item);
            System.out.println("Subtotal do item: "+ subTotalAtual);
            totalAPagar += getSubTotal(item);
        }
      
         System.out.println("TOTAL A PAGAR: " + totalAPagar);        
    }
 }

