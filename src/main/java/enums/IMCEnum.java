package enums;

public enum IMCEnum {
    ABAIXO(0, "Abaixo do peso"),
    NORMAL(1, "Peso normal"),
    ACIMA(2, "Acima do peso"),
    OBESO(3, "Obeso"),
    INVALIDO(4, "Valores incongruentes");

    private Integer id;

    private String detalhe;

    IMCEnum(Integer id, String detalhe) {
        this.id = id;
        this.detalhe = detalhe;
    }

    public static IMCEnum of(Double valor){

        if(valor <= 18.5) return IMCEnum.ABAIXO;

        if(valor > 18.5 && valor <= 25) return IMCEnum.NORMAL;

        if(valor > 25 && valor <= 30) return IMCEnum.ACIMA;

        if(valor > 30) return IMCEnum.OBESO;

        return IMCEnum.INVALIDO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }
}
