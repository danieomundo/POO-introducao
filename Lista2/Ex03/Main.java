/*

ENUNCIADO:

Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões 
e use o método estaAberta para verificar se ela está aberta.

*/

public class Main {
    
    public static void main(String[] args) {
    
        Porta porta = new Porta();
        
        porta.abrePorta();
        porta.estaAberta();
        
        porta.fechaPorta();
        porta.estaFechada();
        
        porta.abrePorta();
        porta.estaAberta();
        
        porta.pintaPorta("Azul");
        porta.pintaPorta("Amarelo");
        porta.pintaPorta("Verde");
    
        porta.coresPorta();
                
        porta.dimensaoPorta(50, 80);
        
        porta.fechaPorta();
        porta.estadoPorta();
        
    }
          
}
