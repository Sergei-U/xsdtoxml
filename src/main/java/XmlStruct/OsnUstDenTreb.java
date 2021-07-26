package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 *
 */
@Data
public class OsnUstDenTreb {

    @XmlElement(name = "НаимОсн",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: Без документа-основания")
    private String nameOsn;

    @XmlElement(name = "НомОсн")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String nomOsn;

    @XmlElement(name = "ДатаОсн")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private Date dateOsn;

    @XmlElement(name = "ИдентОсн")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String identityOsn;
}
