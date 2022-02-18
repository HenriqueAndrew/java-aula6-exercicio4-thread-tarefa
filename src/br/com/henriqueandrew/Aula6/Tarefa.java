package br.com.henriqueandrew.Aula6;

// @author Henrique Andrew da Silva

public class Tarefa extends Thread{
    
    private final long vlIni;
    private final long vlFin;
    private long total = 0;
    
    //método construtor que receberá os parâmetros da tarefa
    public Tarefa(int vlIni, int vlFin){
            this.vlIni = vlIni;
            this.vlFin = vlFin;
    }
    
    //método que retorna o total calculado
    public long retornaTotal(){
        return total;
    }
    
    //método 'run' encarregado por executar o código da thread
    public void run(){
        for (long i = vlIni; i <= vlFin; i++){
            total += i;
        }
    }

}
