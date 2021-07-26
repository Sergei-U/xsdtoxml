package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class SvULUc {


    @XmlElement(name = "НаимОрг",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String nameOrg;

    @XmlElement(name = "ИННЮЛ",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=10) Строка (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String innUL;

    @XmlElement(name = "ДефИННЮЛ",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: -")
    private String defInnUL;

    @XmlElement(name = "КПП")
    @ApiModelProperty(value = "Формат" +
            "T(=9) Строка (фиксированное число знаков 9)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String kpp;

    @XmlElement(name = "ДефКПП")
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String defKpp;

    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    public String getInnUL() {
        return innUL;
    }

    public void setInnUL(String innUL) {
        this.innUL = innUL;
    }

    public String getDefInnUL() {
        return defInnUL;
    }

    public void setDefInnUL(String defInnUL) {
        this.defInnUL = defInnUL;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getDefKpp() {
        return defKpp;
    }

    public void setDefKpp(String defKpp) {
        this.defKpp = defKpp;
    }
}
