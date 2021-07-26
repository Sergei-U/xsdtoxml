package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class RabOrgProd {


    @XmlElement(name = "РабОргПрод",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private String rabOrgProd;

    @XmlElement(name = "ИныеСвед")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String overSved;

    @XmlElement(name = "ОснПолн")
    @ApiModelProperty(value = "Формат\n" +
            "T(120) Строка (длина от 1 до 120 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String osnSved;


    @XmlElement(name = "ФИО",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<FIO> fioList;

    public String getRabOrgProd() {
        return rabOrgProd;
    }

    public void setRabOrgProd(String rabOrgProd) {
        this.rabOrgProd = rabOrgProd;
    }

    public String getOverSved() {
        return overSved;
    }

    public void setOverSved(String overSved) {
        this.overSved = overSved;
    }

    public String getOsnSved() {
        return osnSved;
    }

    public void setOsnSved(String osnSved) {
        this.osnSved = osnSved;
    }

    public List<FIO> getFioList() {
        return fioList;
    }

    public void setFioList(List<FIO> fioList) {
        this.fioList = fioList;
    }
}
