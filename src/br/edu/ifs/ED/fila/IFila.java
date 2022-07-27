package br.edu.ifs.ED.fila;

public interface IFila<T> {
    public void incluir(T valor) throws FilaCheiaException;
    public T remover() throws FilaVaziaException;
    public boolean estaVazia();
    public void limpar();
}
