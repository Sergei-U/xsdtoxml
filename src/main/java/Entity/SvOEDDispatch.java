package Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 */

public class SvOEDDispatch {


    private String nameCompany;

    private String idNumberCompany;

    private String idEDO;

    @XmlAttribute(name = "НаимОрг", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @XmlAttribute(name = "ИННЮЛ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=10) Строка (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getIdNumberCompany() {
        return idNumberCompany;
    }

    public void setIdNumberCompany(String idNumberCompany) {
        this.idNumberCompany = idNumberCompany;
    }

    @XmlAttribute(name = "ИдЭДО", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=3) Строка (фиксированное число знаков 3)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getIdEDO() {
        return idEDO;
    }

    public void setIdEDO(String idEDO) {
        this.idEDO = idEDO;
    }
}
