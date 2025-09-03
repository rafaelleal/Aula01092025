import java.util.LinkedList;

public class Fila<T> {
    private LinkedList<T> elementos;

    public Fila() {
        this.elementos = new LinkedList<>();
    }

    public void enfileirar(T elemento) {
        elementos.addLast(elemento);
    }

    public T desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return elementos.removeFirst();
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public int tamanho() {
        return elementos.size();
    }

    public T frente() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return elementos.getFirst();
    }    
}
