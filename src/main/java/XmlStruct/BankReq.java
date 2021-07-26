package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class BankReq {

    @XmlElement(name = "НомерСчета")
    @ApiModelProperty(value = "Формат\n" +
            "T(20) Строка (длина от 1 до 20 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String accNumber;

    @XmlElement(name = "СвБанк")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<SvBank> svBankList;


    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public List<SvBank> getSvBankList() {
        return svBankList;
    }

    public void setSvBankList(List<SvBank> svBankList) {
        this.svBankList = svBankList;
    }
}
