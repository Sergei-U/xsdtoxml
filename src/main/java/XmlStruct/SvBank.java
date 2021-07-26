package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class SvBank {

    @XmlElement(name = "НаимБанк")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String bankName;

    @XmlElement(name = "БИК")
    @ApiModelProperty(value = "Формат\n" +
            "T(=9) Строка (фиксированное число знаков 9)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String bic;

    @XmlElement(name = "КорСчет")
    @ApiModelProperty(value = "Формат\n" +
            "T(20) Строка (длина от 1 до 20 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String corrAcc;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getCorrAcc() {
        return corrAcc;
    }

    public void setCorrAcc(String corrAcc) {
        this.corrAcc = corrAcc;
    }
}
