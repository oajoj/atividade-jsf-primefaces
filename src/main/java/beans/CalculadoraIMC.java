package beans;

import enums.IMCEnum;

import javax.ejb.Stateless;
import java.io.Serializable;

@Stateless
public class CalculadoraIMC implements Serializable {
    public IMCEnum calcular(Double peso, Double altura) {
        Double resultado = peso / Math.pow(altura, 2);
        return IMCEnum.of(resultado);
    }
}
