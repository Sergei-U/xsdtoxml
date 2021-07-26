package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */

public class SummNalAll {

    private BigDecimal summNal;

    private String nonNDS;

    private String defNDS;

    public BigDecimal getSummNal() {
        return summNal;
    }

    @XmlElement(name = "СумНал")
    @ApiModelProperty(value = "Формат\n" +
            "Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел\n" +
            "Принимает значение: 0")
    public void setSummNal(BigDecimal summNal) {
        this.summNal = summNal;
    }

    @XmlElement(name = "БезНДС")
    @ApiModelProperty(value = "Формат\n" +
            "Строка (длина от 1 до 18 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел\n" +
            "Принимает значение: без НДС")
    public String getNonNDS() {
        return nonNDS;
    }

    public void setNonNDS(String nonNDS) {
        this.nonNDS = nonNDS;
    }

    @XmlElement(name = "ДефНДС",defaultValue = "-")
    @ApiModelProperty(value = "Формат\n" +
            "Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел\n" +
            "Принимает значение: -")
    public String getDefNDS() {
        return defNDS;
    }

    public void setDefNDS(String defNDS) {
        this.defNDS = defNDS;
    }
}
