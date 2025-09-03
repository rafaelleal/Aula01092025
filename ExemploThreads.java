class Worker extends Thread {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Worker " + id + " trabalhando.");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExemploThreads {

    public static void main(String[] args) {
        Worker worker1 = new Worker(1);
        Worker worker2 = new Worker(2);
        worker1.start();
        worker2.start();
    }
}
