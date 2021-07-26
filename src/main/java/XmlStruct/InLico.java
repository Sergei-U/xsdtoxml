package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class InLico {

    private List<PredOrgPer> predOrgPerList;

    private List<FlPer> flPerList;

    @XmlElement(name = "ПредОргПер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<PredOrgPer> getPredOrgPerList() {
        return predOrgPerList;
    }

    public void setPredOrgPerList(List<PredOrgPer> predOrgPerList) {
        this.predOrgPerList = predOrgPerList;
    }

    @XmlElement(name = "ФЛПер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<FlPer> getFlPerList() {
        return flPerList;
    }

    public void setFlPerList(List<FlPer> flPerList) {
        this.flPerList = flPerList;
    }
}
