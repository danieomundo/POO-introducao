 /*
 
 ENUNCIADO:
 
 Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; 
 abra e feche as mesmas como desejar. 
 Utilize o método quantasPortasEstaoAbertas para imprimir o número 
 e portas abertas.
 
 */

public class Main {
    
     public static void main(String[] args) {
     
         Casa casa = new Casa();
         System.out.println("Casa criada.");
         
         casa.pintaCasa("Rosa");
         casa.pintaCasa("Roxo");
         int count = 1;
         for (String corDaCasa : casa.coresCasa){
             System.out.println("A cor pintada na " + count + "a vez foi: " + corDaCasa);
             count++;
         }
         
         Porta porta1 = new Porta();
         Porta porta2 = new Porta();
         Porta porta3 = new Porta();
         
         casa.addPorta(porta1);
         casa.addPorta(porta2);
         casa.addPorta(porta3);
         
         porta1.abrePorta();
         System.out.println("Porta 1 foi aberta.");
         porta2.abrePorta();
         System.out.println("Porta 2 foi aberta.");
         porta2.fechaPorta();
         System.out.println("A porta 2 foi fechada.");
         porta2.abrePorta();
         System.out.println("A porta 2 foi aberta.");
         porta3.abrePorta();
         System.out.println("A porta 3 foi aberta.");
         
         casa.quantasPortasEstaoAbertas();
     }
       
}
