package XmlStruct;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 */

public class SvBank {

    private String bankName;

    private String bic;

    private String corrAcc;

    @XmlAttribute(name = "НаимБанк")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @XmlAttribute(name = "БИК")
    @ApiModelProperty(value = "Формат\n" +
            "T(=9) Строка (фиксированное число знаков 9)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    @XmlAttribute(name = "КорСчет")
    @ApiModelProperty(value = "Формат\n" +
            "T(20) Строка (длина от 1 до 20 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getCorrAcc() {
        return corrAcc;
    }

    public void setCorrAcc(String corrAcc) {
        this.corrAcc = corrAcc;
    }
}
