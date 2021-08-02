package Entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlType(propOrder = {"svedTovList",
        "totalOplList"})
public class TableScFact {

    private SvedTov svedTovList;

    private TotalOpl totalOplList;

    @XmlElement(name = "СведТов", required = true)
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public SvedTov getSvedTovList() {
        return svedTovList;
    }

    public void setSvedTovList(SvedTov svedTovList) {
        this.svedTovList = svedTovList;
    }

    @XmlElement(name = "ВсегоОпл", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public TotalOpl getTotalOplList() {
        return totalOplList;
    }

    public void setTotalOplList(TotalOpl totalOplList) {
        this.totalOplList = totalOplList;
    }
}
