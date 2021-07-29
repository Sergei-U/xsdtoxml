package Entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class BankReq {

    private String accNumber;

    private SvBank svBankList;

    @XmlAttribute(name = "НомерСчета")
    /** "Формат\n" +
     "T(20) Строка (длина от 1 до 20 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    @XmlElement(name = "СвБанк")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public SvBank getSvBankList() {
        return svBankList;
    }

    public void setSvBankList(SvBank svBankList) {
        this.svBankList = svBankList;
    }
}
