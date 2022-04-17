public class Celular {
    
    int capacidade_bateria;
    int nivel_bateria;
    
    public void capacidade_carga (int u) {
        capacidade_bateria = u;
        nivel_bateria = u;
    }
        
    public void enviaMensagem(){
        nivel_bateria--;
    }
    
    public void fazLigaçao(int seg){
        nivel_bateria = nivel_bateria-seg/5;
    }
    
    public void nivel_carga(){
        System.out.println("Carga atual: " + (float) nivel_bateria / capacidade_bateria * 100);
    }
       
}
