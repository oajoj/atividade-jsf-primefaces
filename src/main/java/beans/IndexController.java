package beans;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class IndexController implements Serializable {

    private Integer idade;
    private Double peso;
    private Double altura;
    private String diagnostico;

    @Inject
    private CalculadoraIMC imc;

    public IndexController() {

    }

    public IndexController(Integer idade, Double peso, Double altura, String diagnostico) {
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.diagnostico = diagnostico;
    }

    public void calcular(){
        this.diagnostico = this.imc.calcular(peso, altura).getDetalhe();
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public CalculadoraIMC getImc() {
        return imc;
    }

    public void setImc(CalculadoraIMC imc) {
        this.imc = imc;
    }
}
