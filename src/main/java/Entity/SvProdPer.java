package Entity;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class SvProdPer {

    private SvPer svPerList;

    private InfPolFXZ3 infPolFXZ3List;

    @XmlElement(name = "СвПер", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public SvPer getSvPerList() {
        return svPerList;
    }

    public void setSvPerList(SvPer svPerList) {
        this.svPerList = svPerList;
    }

    @XmlElement(name = "ИнфПолФХЖ3")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public InfPolFXZ3 getInfPolFXZ3List() {
        return infPolFXZ3List;
    }

    public void setInfPolFXZ3List(InfPolFXZ3 infPolFXZ3List) {
        this.infPolFXZ3List = infPolFXZ3List;
    }
}
