package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 */

public class Document  {

    @XmlElement(name = "КНД", required = true,defaultValue = "1115131")
    @ApiModelProperty(value = "Формат\n" +
            "T(=7) Строка (фиксированное число знаков 7)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "'Ключевой'\n" +
            "Принимает значение: 1115131")
    private String knd;

    @XmlElement(name = "Функция", required = true,defaultValue = "СЧФ")
    @ApiModelProperty(value = "Формат\n" +
            "T(6) Строка (длина от 1 до 6 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "'Ключевой'\n" +
            "Принимает значение: СЧФ")
    private String func;

    @XmlElement(name = "ПоФактХЖ", required = false)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String poFactHZ;

    @XmlElement(name = "НаимДокОпр", required = false)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String nameDocReq;

    @XmlElement(name = "ДатаИнфПр", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private LocalDate dateInfPr;

    @XmlElement(name = "ВремИнфПр", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(8) Время (фиксированное число знаков 8)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private LocalDate timeInfPr;

    @XmlElement(name = "НаимЭконСубСост", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String nameEconSubCondition;

    @XmlElement(name = "ОснДоверОргСост", required = false)
    @ApiModelProperty(value = "Формат\n" +
            "T(120) Строка (длина от 1 до 120 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String osnDoverOrgCondition;

    @XmlElement(name = "СоглСтрДопИнф", required = false)
    @ApiModelProperty(value = "Формат\n" +
            "T(=14) Строка (фиксированное число знаков 14)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String soglStrDopInf;

    @XmlElement(name = "СвСчФакт")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvScFact> svScFactList;

    @XmlElement(name = "ТаблСчФакт")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Условно-Обязательный\n" +
            "Узел")
    private List<TableScFact> tableScFactList;
    
    @XmlElement(name = "СвПродПер")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Условно-Обязательный\n" +
            "Узел")
    private List<SvProdPer> svProdPerList;

    @XmlElement(name = "Подписант",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<Podpisant> podpisantList;


    public String getKnd() {
        return knd;
    }

    public void setKnd(String knd) {
        this.knd = knd;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getPoFactHZ() {
        return poFactHZ;
    }

    public void setPoFactHZ(String poFactHZ) {
        this.poFactHZ = poFactHZ;
    }

    public String getNameDocReq() {
        return nameDocReq;
    }

    public void setNameDocReq(String nameDocReq) {
        this.nameDocReq = nameDocReq;
    }

    public LocalDate getDateInfPr() {
        return dateInfPr;
    }

    public void setDateInfPr(LocalDate dateInfPr) {
        this.dateInfPr = dateInfPr;
    }

    public LocalDate getTimeInfPr() {
        return timeInfPr;
    }

    public void setTimeInfPr(LocalDate timeInfPr) {
        this.timeInfPr = timeInfPr;
    }

    public String getNameEconSubCondition() {
        return nameEconSubCondition;
    }

    public void setNameEconSubCondition(String nameEconSubCondition) {
        this.nameEconSubCondition = nameEconSubCondition;
    }

    public String getOsnDoverOrgCondition() {
        return osnDoverOrgCondition;
    }

    public void setOsnDoverOrgCondition(String osnDoverOrgCondition) {
        this.osnDoverOrgCondition = osnDoverOrgCondition;
    }

    public String getSoglStrDopInf() {
        return soglStrDopInf;
    }

    public void setSoglStrDopInf(String soglStrDopInf) {
        this.soglStrDopInf = soglStrDopInf;
    }

    public List<SvScFact> getSvScFactList() {
        return svScFactList;
    }

    public void setSvScFactList(List<SvScFact> svScFactList) {
        this.svScFactList = svScFactList;
    }

    public List<TableScFact> getTableScFactList() {
        return tableScFactList;
    }

    public void setTableScFactList(List<TableScFact> tableScFactList) {
        this.tableScFactList = tableScFactList;
    }

    public List<SvProdPer> getSvProdPerList() {
        return svProdPerList;
    }

    public void setSvProdPerList(List<SvProdPer> svProdPerList) {
        this.svProdPerList = svProdPerList;
    }

    public List<Podpisant> getPodpisantList() {
        return podpisantList;
    }

    public void setPodpisantList(List<Podpisant> podpisantList) {
        this.podpisantList = podpisantList;
    }
}
