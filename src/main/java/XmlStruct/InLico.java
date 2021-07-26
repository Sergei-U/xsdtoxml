package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class InLico {

    @XmlElement(name = "ПредОргПер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<PredOrgPer> predOrgPerList;

    @XmlElement(name = "ФЛПер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<FlPer> flPerList;

    public List<PredOrgPer> getPredOrgPerList() {
        return predOrgPerList;
    }

    public void setPredOrgPerList(List<PredOrgPer> predOrgPerList) {
        this.predOrgPerList = predOrgPerList;
    }

    public List<FlPer> getFlPerList() {
        return flPerList;
    }

    public void setFlPerList(List<FlPer> flPerList) {
        this.flPerList = flPerList;
    }
}
