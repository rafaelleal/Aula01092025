import java.util.Scanner;

class ThreadRemoverElementos extends Thread {
    FilaCircular<Integer> filaCircular;
    public ThreadRemoverElementos(FilaCircular<Integer> filaCircular) {
        this.filaCircular = filaCircular;
    }
    public void run() {
        while(true) {
            try {
                System.out.println("Removendo: " + filaCircular.desenfileirar());
            } catch (IllegalStateException e) {
                System.out.println("A fila está vazia.");
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }
}
class ThreadInserirElementos extends Thread {
    FilaCircular<Integer> filaCircular;
    public ThreadInserirElementos(FilaCircular<Integer> filaCircular) {
        this.filaCircular = filaCircular;
    }
    public void run() {
        int contador = 0;
        while(true) {
            System.out.println("Inserindo: " + contador);
            filaCircular.enfileirar(contador);
            contador++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }
}

class ThreadPercorrerFila implements Runnable {
    FilaCircular<Integer> filaCircular;
    public ThreadPercorrerFila(FilaCircular<Integer> filaCircular) {
        this.filaCircular = filaCircular;
    }
    public void run() {
        while(true) {
            try {
                System.out.println("Próximo: " + filaCircular.proximo());
            } catch (IllegalStateException e) {
                System.out.println("A fila está vazia.");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        FilaCircular<Integer> filaCircular = new FilaCircular<>();
        
        Thread t1 = new Thread(new ThreadPercorrerFila(filaCircular));
        t1.start();

        ThreadInserirElementos t2 = new ThreadInserirElementos(filaCircular);
        t2.start();

        ThreadRemoverElementos t3 = new ThreadRemoverElementos(filaCircular);
        t3.start();
    }
}
