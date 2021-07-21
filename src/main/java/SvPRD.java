import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 */
@Data
public class SvPRD {

    @XmlElement(name = "НомерПРД",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(30) Строка (длина от 1 до 30 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String numberPRD;

    @XmlElement(name = "ДатаПРД",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private Date datePRD;

    @XmlElement(name = "СуммаПРД")
    @ApiModelProperty(value = "Формат\n" +
            "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private BigDecimal summPRD;
}
