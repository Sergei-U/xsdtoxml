package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */

public class Excise {

    private BigDecimal summExcise;

    private String nonExcise;


    @XmlElement(name = "СумАкциз",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public BigDecimal getSummExcise() {
        return summExcise;
    }

    public void setSummExcise(BigDecimal summExcise) {
        this.summExcise = summExcise;
    }

    @XmlElement(name = "БезАкциз",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел\n" +
            "Принимает значение: без акциза")
    public String getNonExcise() {
        return nonExcise;
    }

    public void setNonExcise(String nonExcise) {
        this.nonExcise = nonExcise;
    }
}
