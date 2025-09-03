public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        System.out.println("Frente da fila: " + fila.frente()); // Deve imprimir 10
        System.out.println("Tamanho da fila: " + fila.tamanho()); // Deve imprimir 3

        System.out.println("Desenfileirando: " + fila.desenfileirar()); // Deve imprimir 10
        System.out.println("Frente da fila após desenfileirar: " + fila.frente()); // Deve imprimir 20
        System.out.println("Tamanho da fila após desenfileirar: " + fila.tamanho()); // Deve imprimir 2

        while (!fila.estaVazia()) {
            System.out.println("Desenfileirando: " + fila.desenfileirar());
        }

        System.out.println("A fila está vazia? " + fila.estaVazia()); // Deve imprimir true
    }
}
