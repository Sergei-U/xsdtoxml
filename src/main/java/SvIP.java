import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */
@Data
public class SvIP {

    @XmlElement(name = "ИННФЛ",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=12) Строка (фиксированное число знаков 12)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String innFL;

    @XmlElement(name = "ДефИННФЛ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: -")
    private String defInnFL;

    @XmlElement(name = "СвГосРегИП")
    @ApiModelProperty(value = "Формат\n" +
            "T(100) Строка (длина от 1 до 100 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String svGosRegIP;

    @XmlElement(name = "ИныеСвед")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String overData;

    @XmlElement(name = "ФИО")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<FIO> fioList;

}
