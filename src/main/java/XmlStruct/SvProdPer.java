package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class SvProdPer {


    @XmlElement(name ="СвПер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvPer> svPerList;

    @XmlElement(name = "ИнфПолФХЖ3")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<InfPolFXZ3> infPolFXZ3List;

    public List<SvPer> getSvPerList() {
        return svPerList;
    }

    public void setSvPerList(List<SvPer> svPerList) {
        this.svPerList = svPerList;
    }

    public List<InfPolFXZ3> getInfPolFXZ3List() {
        return infPolFXZ3List;
    }

    public void setInfPolFXZ3List(List<InfPolFXZ3> infPolFXZ3List) {
        this.infPolFXZ3List = infPolFXZ3List;
    }
}
