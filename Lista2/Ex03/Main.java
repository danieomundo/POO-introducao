public class Main {
    
    public static void main(String[] args) {
    
        Porta porta = new Porta();
        
        porta.abrePorta();
        porta.estaAberta();
        
        porta.fechaPorta();
        porta.estaFechada();
        
        porta.pintaPorta("Azul");
        porta.pintaPorta("Amarelo");
        porta.pintaPorta("Verde");
    
        porta.coresPorta();
                
        porta.dimensaoPorta(50, 80);
            
    }
          
}
