package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class SvProdPer {

    private List<SvPer> svPerList;

    private List<InfPolFXZ3> infPolFXZ3List;

    @XmlElement(name ="СвПер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<SvPer> getSvPerList() {
        return svPerList;
    }

    public void setSvPerList(List<SvPer> svPerList) {
        this.svPerList = svPerList;
    }

    @XmlElement(name = "ИнфПолФХЖ3")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<InfPolFXZ3> getInfPolFXZ3List() {
        return infPolFXZ3List;
    }

    public void setInfPolFXZ3List(List<InfPolFXZ3> infPolFXZ3List) {
        this.infPolFXZ3List = infPolFXZ3List;
    }
}
