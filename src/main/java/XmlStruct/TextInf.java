package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class TextInf {

    @XmlElement(name = "Идентиф",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String idText;

    @XmlElement(name = "Значен",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(2000) Строка (длина от 1 до 2000 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String valueText;

    public String getIdText() {
        return idText;
    }

    public void setIdText(String idText) {
        this.idText = idText;
    }

    public String getValueText() {
        return valueText;
    }

    public void setValueText(String valueText) {
        this.valueText = valueText;
    }
}
