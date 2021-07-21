import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */
@Data
public class Excise {

    @XmlElement(name = "СумАкциз",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private BigDecimal summExcise;

    @XmlElement(name = "БезАкциз",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел\n" +
            "Принимает значение: без акциза")
    private String nonExcise;
}
