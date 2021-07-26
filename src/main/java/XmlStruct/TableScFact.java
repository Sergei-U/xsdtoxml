package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class TableScFact {

    @XmlElement(name = "СведТов",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvedTov> svedTovList;

    @XmlElement(name = "ВсегоОпл",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<TotalOpl> totalOplList;

    public List<SvedTov> getSvedTovList() {
        return svedTovList;
    }

    public void setSvedTovList(List<SvedTov> svedTovList) {
        this.svedTovList = svedTovList;
    }

    public List<TotalOpl> getTotalOplList() {
        return totalOplList;
    }

    public void setTotalOplList(List<TotalOpl> totalOplList) {
        this.totalOplList = totalOplList;
    }
}
