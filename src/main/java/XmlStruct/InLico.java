package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class InLico {

    private PredOrgPer predOrgPerList;

    private FlPer flPerList;

    @XmlElement(name = "ПредОргПер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public PredOrgPer getPredOrgPerList() {
        return predOrgPerList;
    }

    public void setPredOrgPerList(PredOrgPer predOrgPerList) {
        this.predOrgPerList = predOrgPerList;
    }

    @XmlElement(name = "ФЛПер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public FlPer getFlPerList() {
        return flPerList;
    }

    public void setFlPerList(FlPer flPerList) {
        this.flPerList = flPerList;
    }
}
