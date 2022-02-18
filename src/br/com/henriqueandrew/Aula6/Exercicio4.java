package br.com.henriqueandrew.Aula6;

// @author Henrique Andrew da Silva

public class Exercicio4 {
    
    public static void main (String[] args) throws InterruptedException {
        
        //instanciando objeto (Thread) da classe Tarefa 
        Tarefa tarefa = new Tarefa(0, 1000);
        tarefa.setName("MyThrd");
        
        //inicia a execução da tarefa (.start) e aguarda a finalização da tarefa (.join) para exibir o somatório dos valores recebidos 
        tarefa.start();
        tarefa.join();
        
        //Exibe o somatório dos valores da Thread
        System.out.println("Total: " + tarefa.retornaTotal());        
        
    }
    
    

}
