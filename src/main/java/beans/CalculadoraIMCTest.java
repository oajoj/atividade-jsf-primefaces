package beans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIMCTest {

    CalculadoraIMC imc;

    @BeforeEach
    public void beforeEach(){
        imc = new CalculadoraIMC();
    }

    @Test
    void imcDeveSerAbaixoDoPeso(){
        Double peso = 40.0;
        Double altura = 1.90;

        final String resultado = imc.calcular(peso, altura).getDetalhe();
        assertEquals("Abaixo do peso", resultado);
    }

}