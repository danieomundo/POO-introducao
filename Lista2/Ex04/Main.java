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
         
         casa.pintaCasa("Rosa");
         casa.pintaCasa("Roxo");
         
         Porta porta1 = new Porta();
         Porta porta2 = new Porta();
         Porta porta3 = new Porta();
         
         casa.addPorta(porta1);
         casa.addPorta(porta2);
         casa.addPorta(porta3);
         
         porta1.abrePorta();
         porta2.abrePorta();
         porta2.fechaPorta();
         porta2.abrePorta();
         porta3.abrePorta();
         
         casa.imprimeCoresCasa();
         //casa.quantasPortasEstaoAbertas();
         //consertar o metodo
     }
       
}
