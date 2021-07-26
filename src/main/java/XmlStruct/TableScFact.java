package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class TableScFact {

    private List<SvedTov> svedTovList;

    private List<TotalOpl> totalOplList;

    @XmlElement(name = "СведТов",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<SvedTov> getSvedTovList() {
        return svedTovList;
    }

    public void setSvedTovList(List<SvedTov> svedTovList) {
        this.svedTovList = svedTovList;
    }

    @XmlElement(name = "ВсегоОпл",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<TotalOpl> getTotalOplList() {
        return totalOplList;
    }

    public void setTotalOplList(List<TotalOpl> totalOplList) {
        this.totalOplList = totalOplList;
    }
}
