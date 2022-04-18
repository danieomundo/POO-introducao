public class Produto {
    
    String nome;
    float preco;
    int quantidade;

    public void printarProduto(Produto produto) {
      
        System.out.println("Produto: " + produto.nome);
        System.out.println("Preco: " + produto.preco);
        System.out.println("Qtd.: " + produto.quantidade);
      
    }
    
}
