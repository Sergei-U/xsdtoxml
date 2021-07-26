package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class SvOEDDispatch {

    @XmlElement(name = "НаимОрг", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String nameCompany;

    @XmlElement(name = "ИННЮЛ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=10) Строка (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String idNumberCompany;

    @XmlElement(name = "ИдЭДО", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=3) Строка (фиксированное число знаков 3)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String idEDO;


    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getIdNumberCompany() {
        return idNumberCompany;
    }

    public void setIdNumberCompany(String idNumberCompany) {
        this.idNumberCompany = idNumberCompany;
    }

    public String getIdEDO() {
        return idEDO;
    }

    public void setIdEDO(String idEDO) {
        this.idEDO = idEDO;
    }
}
