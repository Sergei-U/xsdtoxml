package Entity;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class RabOrgProd {

    private String rabOrgProd;

    private String overSved;

    private String osnSved;

    private List<FIO> fioList;

    @XmlElement(name = "РабОргПрод", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public String getRabOrgProd() {
        return rabOrgProd;
    }

    public void setRabOrgProd(String rabOrgProd) {
        this.rabOrgProd = rabOrgProd;
    }

    @XmlElement(name = "ИныеСвед")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getOverSved() {
        return overSved;
    }

    public void setOverSved(String overSved) {
        this.overSved = overSved;
    }

    @XmlElement(name = "ОснПолн")
    @ApiModelProperty(value = "Формат\n" +
            "T(120) Строка (длина от 1 до 120 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getOsnSved() {
        return osnSved;
    }

    public void setOsnSved(String osnSved) {
        this.osnSved = osnSved;
    }

    @XmlElement(name = "ФИО", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<FIO> getFioList() {
        return fioList;
    }

    public void setFioList(List<FIO> fioList) {
        this.fioList = fioList;
    }
}
