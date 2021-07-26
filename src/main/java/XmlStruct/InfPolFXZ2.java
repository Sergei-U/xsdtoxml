package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class InfPolFXZ2 {

    private String identifier;

    private String value;

    @XmlElement(name = "Идентиф")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @XmlElement(name = "Значен")
    @ApiModelProperty(value = "Формат\n" +
            "T(2000) Строка (длина от 1 до 2000 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
