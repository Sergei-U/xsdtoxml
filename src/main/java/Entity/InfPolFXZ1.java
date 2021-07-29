package Entity;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class InfPolFXZ1 {

    private String idFileInfPol;

    private TextInf textInfList;

    @XmlElement(name = "ИдФайлИнфПол")
    @ApiModelProperty(value = "Формат\n" +
            "T(=36) Строка (фиксированное число знаков 36)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getIdFileInfPol() {
        return idFileInfPol;
    }

    public void setIdFileInfPol(String idFileInfPol) {
        this.idFileInfPol = idFileInfPol;
    }

    @XmlElement(name = "ТекстИнф")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public TextInf getTextInfList() {
        return textInfList;
    }

    public void setTextInfList(TextInf textInfList) {
        this.textInfList = textInfList;
    }
}
