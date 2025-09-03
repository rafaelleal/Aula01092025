import java.util.LinkedList;

public class FilaCircular<T> {
    private LinkedList<T> elementos;
    Integer posicaoAtual;
    public FilaCircular() {
        this.elementos = new LinkedList<>();
        this.posicaoAtual = null;
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
    
    public T proximo() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        if (posicaoAtual == null) {
            posicaoAtual = 0;
        } else {
            posicaoAtual = (posicaoAtual + 1) % elementos.size();
        }
        return elementos.get(posicaoAtual);
    }
}
