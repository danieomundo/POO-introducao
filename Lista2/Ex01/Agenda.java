package Ex1;
import java.util.ArrayList;

public class Agenda {
    
    ArrayList<String> agenda = new ArrayList();
          
    public void addContato(Contato contato){
        String contat = contato.nome+"\n"+contato.idade+"\n"+contato.end+"\n"+contato.telefone;
        agenda.add(contat);
    }
    
    public void removerContato(Contato contato){
        //ainda vou mexer
    }
    
     public void imprimeContatos(Contato contato){
        System.out.println(agenda);   
    }
           
}
