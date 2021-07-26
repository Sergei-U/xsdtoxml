package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class InfPolFXZ3 {

    @XmlElement(name = "ИдФайлИнфПол")
    @ApiModelProperty(value = "Формат\n" +
            "T(=36) Строка (фиксированное число знаков 36)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String idFileInfPol;

    @XmlElement(name = "ТекстИнф")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<TextInf> textInfList;

    public String getIdFileInfPol() {
        return idFileInfPol;
    }

    public void setIdFileInfPol(String idFileInfPol) {
        this.idFileInfPol = idFileInfPol;
    }

    public List<TextInf> getTextInfList() {
        return textInfList;
    }

    public void setTextInfList(List<TextInf> textInfList) {
        this.textInfList = textInfList;
    }
}
