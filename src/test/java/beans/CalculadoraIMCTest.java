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
        Double peso = 400.0;
        Double altura = 190.0;

        final String resultado = imc.calcular(peso, altura).getDetalhe();
        assertEquals("Abaixo do peso", resultado);
    }

    @Test
    void imcDeveSerPesoNormal(){
        Double peso = 60.0;
        Double altura = 1.80;

        final String resultado = imc.calcular(peso, altura).getDetalhe();
        assertEquals("Peso normal", resultado);
    }

    @Test
    void imcDeveSerAcimaDoPeso(){
        Double peso = 90.0;
        Double altura = 1.80;
        final String resultado = imc.calcular(peso, altura).getDetalhe();
        assertEquals("Acima do peso", resultado);
    }

    @Test
    void imcDeveSerObeso(){
        Double peso = 130.0;
        Double altura = 1.80;
        final String resultado = imc.calcular(peso, altura).getDetalhe();
        assertEquals("Obeso", resultado);
    }

    @Test
    void imcDeveSerIncongruente(){
        Double peso = -1.0;
        Double altura = -1.0;
        final String resultado = imc.calcular(peso, altura).getDetalhe();
        assertEquals("Valores incongruentes", resultado);
    }

}