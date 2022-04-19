public class Item {
    
    Produto produto;
    int quantidade;
    
    float getSubTotal() {
        return produto.preco * quantidade;
    }   
  
}
