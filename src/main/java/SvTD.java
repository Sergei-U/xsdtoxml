import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */
@Data
public class SvTD {


    @XmlElement(name = "КодПроисх")
    @ApiModelProperty(value = "Формат\n" +
            "T(=3) Строка (фиксированное число знаков 3)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String codeOrigin;

    @XmlElement(name = "ДефКодПроисх",defaultValue = "-")
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Принимает значение: -")
    private String defCodeOrigin;

    @XmlElement(name = "НомерТД")
    @ApiModelProperty(value = "Формат\n" +
            "T(29) Строка (длина от 1 до 29 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String numberTD;
}
