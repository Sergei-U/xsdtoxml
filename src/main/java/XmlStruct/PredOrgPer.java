package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class PredOrgPer {


    @XmlElement(name = "Должность",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(128) Строка (длина от 1 до 128 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String dolznost;

    @XmlElement(name = "ИныеСвед")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String overSved;

    @XmlElement(name = "НаимОргПер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(128) Строка (длина от 1 до 128 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String nameOrgPer;

    @XmlElement(name = "ОснДоверОргПер")
    @ApiModelProperty(value = "Формат\n" +
            "T(120) Строка (длина от 1 до 120 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String osnDoverOrgPer;

    @XmlElement(name = "ОснПолнПредПер")
    @ApiModelProperty(value = "Формат\n" +
            "T(120) Строка (длина от 1 до 120 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String osnPolnPredPer;

    @XmlElement(name = "ФИО",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<FIO> fioList;

    public String getDolznost() {
        return dolznost;
    }

    public void setDolznost(String dolznost) {
        this.dolznost = dolznost;
    }

    public String getOverSved() {
        return overSved;
    }

    public void setOverSved(String overSved) {
        this.overSved = overSved;
    }

    public String getNameOrgPer() {
        return nameOrgPer;
    }

    public void setNameOrgPer(String nameOrgPer) {
        this.nameOrgPer = nameOrgPer;
    }

    public String getOsnDoverOrgPer() {
        return osnDoverOrgPer;
    }

    public void setOsnDoverOrgPer(String osnDoverOrgPer) {
        this.osnDoverOrgPer = osnDoverOrgPer;
    }

    public String getOsnPolnPredPer() {
        return osnPolnPredPer;
    }

    public void setOsnPolnPredPer(String osnPolnPredPer) {
        this.osnPolnPredPer = osnPolnPredPer;
    }

    public List<FIO> getFioList() {
        return fioList;
    }

    public void setFioList(List<FIO> fioList) {
        this.fioList = fioList;
    }
}


