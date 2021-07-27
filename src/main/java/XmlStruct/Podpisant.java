package XmlStruct;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;


public class Podpisant {


    @XmlElement(name = "ОблПолн", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Перечисление (длина от 1 до 2 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private OblPoln oblPolnEnum;
}