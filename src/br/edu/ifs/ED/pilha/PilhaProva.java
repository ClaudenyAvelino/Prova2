package br.edu.ifs.ED.pilha;

import br.edu.ifs.ED.comum.ParametroInvalidoException;
import br.edu.ifs.ED.fila.FilaCheiaException;
import br.edu.ifs.ED.fila.FilaVaziaException;
import br.edu.ifs.ED.fila.IFila;
import br.edu.ifs.ED.fila.FilaProva;
import br.edu.ifs.ED.lista.Lista;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PilhaProva<T> implements IPilha<T> {
	public Lista<PilhaProva<T>> obterListaPilhas(FilaProva<T> fila, int qtdDePilhas)
			throws FilaCheiaException, FilaVaziaException,
			PilhaCheiaException, PilhaVaziaException,
			ParametroInvalidoException {
		throw new ParametroInvalidoException("obterListaPilhas");
	}

	public boolean temConteudoIgual(FilaProva<T> fila)
			throws FilaCheiaException, FilaVaziaException,
			PilhaCheiaException, PilhaVaziaException,
			ParametroInvalidoException {
		throw new ParametroInvalidoException("temConteudoIgual");
	}

	@Override
	public void empilhar(T valor) throws PilhaCheiaException {

	}

	@Override
	public T desempilhar() throws PilhaVaziaException {
		return null;
	}

	@Override
	public T getTopo() throws PilhaVaziaException {
		return null;
	}

	@Override
	public boolean estahVazia() {
		return false;
	}
}
