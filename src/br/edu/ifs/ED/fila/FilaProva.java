package br.edu.ifs.ED.fila;


public class FilaProva<T> implements IFila<T> {
    @Override
    public void incluir(T valor) throws FilaCheiaException {
        throw new FilaCheiaException();
    }

    @Override
    public T remover() throws FilaVaziaException {
        return null;
    }

    @Override
    public boolean estaVazia() {
        return false;
    }

    @Override
    public void limpar() {

    }
}
