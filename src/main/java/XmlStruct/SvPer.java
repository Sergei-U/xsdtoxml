package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;
import java.util.List;


public class SvPer {

    @XmlElement(name = "СодОпер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String sodOper;

    @XmlElement(name = "ВидОпер")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String vidOper;

    @XmlElement(name = "ДатаПер")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private Date datePer;

    @XmlElement(name = "ДатаНач")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private Date dateStart;

    @XmlElement(name = "ДатаОкон")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private Date dateEnd;


    @XmlElement(name = "ОснПер")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<OsnPer> osnPerList;

    @XmlElement(name = "СвЛицПер")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<SvLicPer> svLicPerList;

    @XmlElement(name = "ТранГруз")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<TranGruz> tranGruzList;

    @XmlElement(name = "СвПерВещи")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<SvPerVech> svPerVechList;


    public String getSodOper() {
        return sodOper;
    }

    public void setSodOper(String sodOper) {
        this.sodOper = sodOper;
    }

    public String getVidOper() {
        return vidOper;
    }

    public void setVidOper(String vidOper) {
        this.vidOper = vidOper;
    }

    public Date getDatePer() {
        return datePer;
    }

    public void setDatePer(Date datePer) {
        this.datePer = datePer;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public List<OsnPer> getOsnPerList() {
        return osnPerList;
    }

    public void setOsnPerList(List<OsnPer> osnPerList) {
        this.osnPerList = osnPerList;
    }

    public List<SvLicPer> getSvLicPerList() {
        return svLicPerList;
    }

    public void setSvLicPerList(List<SvLicPer> svLicPerList) {
        this.svLicPerList = svLicPerList;
    }

    public List<TranGruz> getTranGruzList() {
        return tranGruzList;
    }

    public void setTranGruzList(List<TranGruz> tranGruzList) {
        this.tranGruzList = tranGruzList;
    }

    public List<SvPerVech> getSvPerVechList() {
        return svPerVechList;
    }

    public void setSvPerVechList(List<SvPerVech> svPerVechList) {
        this.svPerVechList = svPerVechList;
    }
}