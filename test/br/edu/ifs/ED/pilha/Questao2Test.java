package br.edu.ifs.ED.pilha;

import br.edu.ifs.ED.comum.ParametroInvalidoException;
import br.edu.ifs.ED.fila.FilaCheiaException;
import br.edu.ifs.ED.fila.FilaProva;
import br.edu.ifs.ED.fila.FilaVaziaException;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
public class Questao2Test extends PilhaInteiroTest {
    @Test
    void _0_5_retornaFalsoQuandoNaoTemItensNaPilhaTest()
            throws PilhaCheiaException, PilhaVaziaException,
            FilaCheiaException, ParametroInvalidoException, FilaVaziaException {
        assertThat(pilha.temConteudoIgual(new FilaProva<>())).isFalse();
    }
    @Test
    void _0_5_retornaFalsoQuandoNaoTemItensNaFilaTest()
            throws PilhaCheiaException, PilhaVaziaException,
            FilaCheiaException, ParametroInvalidoException, FilaVaziaException {
        pilha.empilhar(1);
        assertThat(pilha.temConteudoIgual(new FilaProva<>())).isFalse();
    }

    /**
     * Ponto extra :D
     * @throws PilhaCheiaException
     * @throws PilhaVaziaException
     * @throws FilaCheiaException
     * @throws ParametroInvalidoException
     * @throws FilaVaziaException
     */
    @Test
    void _0_5_retornaFalsoQuandoParametroNuloTest()
            throws PilhaCheiaException, PilhaVaziaException,
            FilaCheiaException, ParametroInvalidoException, FilaVaziaException {
        assertThat(pilha.temConteudoIgual(null)).isFalse();
    }

    @Test
    void _1_0_ordemInalteradaDaFilaTest() throws PilhaCheiaException, FilaCheiaException, PilhaVaziaException, ParametroInvalidoException, FilaVaziaException {
        pilha = new PilhaProva<>();
        FilaProva<Integer> filaProva = new FilaProva<>();
        for(int i =0; i < 10; i++){
            pilha.empilhar(9-i);
            filaProva.incluir(i);
        }
        assertThat(pilha.temConteudoIgual(filaProva)).isTrue();
        for(int i=0; i<10; i++){
            assertThat(filaProva.remover()).isEqualTo(i);
        }
    }
    @Test
    void _1_0_ordemInalteradaDaPilhaTest() throws PilhaCheiaException, FilaCheiaException, PilhaVaziaException, ParametroInvalidoException, FilaVaziaException {
        pilha = new PilhaProva<>();
        FilaProva<Integer> filaProva = new FilaProva<>();
        for(int i =0; i < 10; i++){
            pilha.empilhar(9-i);
            filaProva.incluir(i);
        }
        assertThat(pilha.temConteudoIgual(filaProva)).isTrue();
        for(int i=0; i<10; i++){
            assertThat(pilha.desempilhar()).isEqualTo(i);
        }
    }
    @Test
    void _0_5_naotemConteudoIgualTest() throws PilhaCheiaException, FilaCheiaException, PilhaVaziaException, ParametroInvalidoException, FilaVaziaException {
        pilha = new PilhaProva<>();
        FilaProva<Integer> filaProva = new FilaProva<>();
        for(int i =0; i < 10; i++){
            pilha.empilhar(i);
            filaProva.incluir(i);
        }
        assertThat(pilha.temConteudoIgual(filaProva)).isFalse();
    }

    @Test
    void _0_5_temConteudoIgualTest() throws PilhaCheiaException, FilaCheiaException, PilhaVaziaException, ParametroInvalidoException, FilaVaziaException {
        pilha = new PilhaProva<>();
        FilaProva<Integer> filaProva = new FilaProva<>();
        for(int i =0; i < 10; i++){
            pilha.empilhar(9-i);
            filaProva.incluir(i);
        }
        assertThat(pilha.temConteudoIgual(filaProva)).isTrue();
    }

    @Test
    void _1_0_temConteudoIgualQtdAleatoriaTest() throws PilhaCheiaException, FilaCheiaException, PilhaVaziaException, ParametroInvalidoException, FilaVaziaException {
        pilha = new PilhaProva<>();
        int qtd = new Random().nextInt(20);
        FilaProva<Integer> filaProva = new FilaProva<>();
        for(int i =0; i < qtd; i++){
            pilha.empilhar(qtd-1-i);
            filaProva.incluir(i);
        }
        assertThat(pilha.temConteudoIgual(filaProva)).isTrue();
        for(int i=0; i<qtd; i++){
            assertThat(pilha.desempilhar()).isEqualTo(i);
        }
    }
}
