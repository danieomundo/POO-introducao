/*

ENUNCIADO:

Faça um programa de agenda telefônica, com as classes Agenda e Contato

*/

public class Main {
    
    public static void main (String[] args){
 
        Contato contato = new Contato();
        contato.nome = "Daniele";
        contato.idade = 28;
        contato.end = "Sao Domingos, Niteroi";
        contato.telefone = 123456789;
        
        Agenda agenda = new Agenda();        
        agenda.addContato(contato);
       
        System.out.println("Contato salvo: ");
        agenda.imprimeContatos(contato);
    
    } 
  
}
