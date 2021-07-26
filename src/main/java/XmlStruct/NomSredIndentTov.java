package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */
@Data
public class NomSredIndentTov {

    @XmlElement(name = "ИдентТрансУпак")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private String identTransPack;

    @XmlElement(name = "КИЗ")
    @ApiModelProperty(value = "Формат\n" +
            "Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный\n" +
            "Узел")
    private String kiz;

    @XmlElement(name = "НомУпак")
    @ApiModelProperty(value = "Формат\n" +
            "Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный\n" +
            "Узел")
    private String nomPack;
}
