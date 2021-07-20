import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */
@Data
public class FIO {

    @XmlElement(name = "Имя",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(60) Строка (длина от 1 до 60 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String firstName;

    @XmlElement(name = "Фамилия",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(60) Строка (длина от 1 до 60 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String lastName;

    @XmlElement(name = "Отчество")
    @ApiModelProperty(value = "Формат\n" +
            "T(60) Строка (длина от 1 до 60 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String thirdName;
}
