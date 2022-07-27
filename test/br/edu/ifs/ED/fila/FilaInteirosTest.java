package br.edu.ifs.ED.fila;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.*;
public class FilaInteirosTest {

    protected FilaProva<Integer> fila;
    @BeforeEach
    public void setUp() {
        fila = new FilaProva<>();
    }


    @Test
    public void incluir_UmElemento() throws FilaCheiaException, FilaVaziaException {
        assertThat(fila.estaVazia()).isEqualTo(true);
        fila.incluir(1);
        assertThat(fila.estaVazia()).isEqualTo(false);
        assertThat(fila.remover()).isEqualTo(1);
    }

    @Test
    public void incluir_MaisDeUmElemento() throws FilaCheiaException, FilaVaziaException {
        for(int i = 0; i < 5; i++){
            fila.incluir(i);
        }
        assertThat(fila.remover()).isEqualTo(0);
        int i = 0;
        while (!fila.estaVazia()){
            assertThat(fila.remover()).isEqualTo(++i+1);
        }
        assertThat(fila.estaVazia()).isTrue();
    }


}