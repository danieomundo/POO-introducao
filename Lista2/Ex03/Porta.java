import java.util.ArrayList;

public class Porta {
    
    boolean statusPorta = false;
    ArrayList<String> coresPorta = new ArrayList();
    
    public void abrePorta() {
        System.out.println("Abrindo a porta...");
    }
    
    public void estaAberta(){
        System.out.println("Porta aberta");
        statusPorta = true;
    }
    
    public void fechaPorta(){
        System.out.println("Fechando a porta....");             
    }
    
    public void estaFechada(){
        System.out.println("Porta fechada");
        statusPorta = false;
    }
    
    public void pintaPorta(String cor){
        System.out.println("Pintando a porta....");
        coresPorta.add(cor);
    }
    
    public void coresPorta(){
        System.out.println(coresPorta);
    }
    
    public void dimensaoPorta(float h, float l){
        System.out.println("Altura: "+h);
        System.out.println("Largura:"+l);
    }
    
    public void estadoPorta(){
        if (statusPorta == true) {
            System.out.println("Porta esta ABERTA!");
        } else {
            System.out.println("Porta esta FECHADA");  
        }
    }        
}
