package XmlStruct;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.List;


public class SvPer {

    private String sodOper;

    private String vidOper;

    private LocalDate datePer;

    private LocalDate dateStart;

    private LocalDate dateEnd;

    private List<OsnPer> osnPerList;

    private List<SvLicPer> svLicPerList;

    private List<TranGruz> tranGruzList;

    private List<SvPerVech> svPerVechList;


    @XmlElement(name = "СодОпер", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getSodOper() {
        return sodOper;
    }

    public void setSodOper(String sodOper) {
        this.sodOper = sodOper;
    }

    @XmlElement(name = "ВидОпер")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getVidOper() {
        return vidOper;
    }

    public void setVidOper(String vidOper) {
        this.vidOper = vidOper;
    }

    @XmlElement(name = "ДатаПер")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public LocalDate getDatePer() {
        return datePer;
    }

    public void setDatePer(LocalDate datePer) {
        this.datePer = datePer;
    }

    @XmlElement(name = "ДатаНач")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    @XmlElement(name = "ДатаОкон")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    @XmlElement(name = "ОснПер")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<OsnPer> getOsnPerList() {
        return osnPerList;
    }

    public void setOsnPerList(List<OsnPer> osnPerList) {
        this.osnPerList = osnPerList;
    }

    @XmlElement(name = "СвЛицПер")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<SvLicPer> getSvLicPerList() {
        return svLicPerList;
    }

    public void setSvLicPerList(List<SvLicPer> svLicPerList) {
        this.svLicPerList = svLicPerList;
    }

    @XmlElement(name = "ТранГруз")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<TranGruz> getTranGruzList() {
        return tranGruzList;
    }

    public void setTranGruzList(List<TranGruz> tranGruzList) {
        this.tranGruzList = tranGruzList;
    }

    @XmlElement(name = "СвПерВещи")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<SvPerVech> getSvPerVechList() {
        return svPerVechList;
    }

    public void setSvPerVechList(List<SvPerVech> svPerVechList) {
        this.svPerVechList = svPerVechList;
    }
}
