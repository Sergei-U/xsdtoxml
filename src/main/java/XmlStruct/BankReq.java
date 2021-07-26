package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class BankReq {

    private String accNumber;

    private List<SvBank> svBankList;

    @XmlElement(name = "НомерСчета")
    @ApiModelProperty(value = "Формат\n" +
            "T(20) Строка (длина от 1 до 20 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    @XmlElement(name = "СвБанк")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<SvBank> getSvBankList() {
        return svBankList;
    }

    public void setSvBankList(List<SvBank> svBankList) {
        this.svBankList = svBankList;
    }
}
