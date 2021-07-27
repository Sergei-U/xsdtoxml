package XmlStruct;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class SvTD {


    private String codeOrigin;

    private String defCodeOrigin;

    private String numberTD;

    @XmlElement(name = "КодПроисх")
    @ApiModelProperty(value = "Формат\n" +
            "T(=3) Строка (фиксированное число знаков 3)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getCodeOrigin() {
        return codeOrigin;
    }

    public void setCodeOrigin(String codeOrigin) {
        this.codeOrigin = codeOrigin;
    }

    @XmlElement(name = "ДефКодПроисх", defaultValue = "-")
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Принимает значение: -")
    public String getDefCodeOrigin() {
        return defCodeOrigin;
    }

    public void setDefCodeOrigin(String defCodeOrigin) {
        this.defCodeOrigin = defCodeOrigin;
    }

    @XmlElement(name = "НомерТД")
    @ApiModelProperty(value = "Формат\n" +
            "T(29) Строка (длина от 1 до 29 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getNumberTD() {
        return numberTD;
    }

    public void setNumberTD(String numberTD) {
        this.numberTD = numberTD;
    }
}
