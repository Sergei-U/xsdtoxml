package Entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


@XmlType(propOrder = {"osnPerList",
        "svLicPerList",
        "tranGruzList",
        "svPerVechList"})
public class SvPer {

    private String sodOper;

    private String vidOper;

    private LocalDate datePer;

    private LocalDate dateStart;

    private LocalDate dateEnd;

    private OsnPer osnPerList;

    private SvLicPer svLicPerList;

    private TranGruz tranGruzList;

    private SvPerVech svPerVechList;


    @XmlAttribute(name = "СодОпер", required = true)
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getSodOper() {
        return sodOper;
    }

    public void setSodOper(String sodOper) {
        this.sodOper = sodOper;
    }

    @XmlAttribute(name = "ВидОпер")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getVidOper() {
        return vidOper;
    }

    public void setVidOper(String vidOper) {
        this.vidOper = vidOper;
    }

    @XmlAttribute(name = "ДатаПер")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    /** "Формат\n" +
     "D(10) Дата (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public LocalDate getDatePer() {
        return datePer;
    }

    public void setDatePer(LocalDate datePer) {
        this.datePer = datePer;
    }

    @XmlAttribute(name = "ДатаНач")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    /** "Формат\n" +
     "D(10) Дата (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    @XmlAttribute(name = "ДатаОкон")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    /** "Формат\n" +
     "D(10) Дата (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    @XmlElement(name = "ОснПер")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public OsnPer getOsnPerList() {
        return osnPerList;
    }

    public void setOsnPerList(OsnPer osnPerList) {
        this.osnPerList = osnPerList;
    }

    @XmlElement(name = "СвЛицПер")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public SvLicPer getSvLicPerList() {
        return svLicPerList;
    }

    public void setSvLicPerList(SvLicPer svLicPerList) {
        this.svLicPerList = svLicPerList;
    }

    @XmlElement(name = "ТранГруз")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public TranGruz getTranGruzList() {
        return tranGruzList;
    }

    public void setTranGruzList(TranGruz tranGruzList) {
        this.tranGruzList = tranGruzList;
    }

    @XmlElement(name = "СвПерВещи")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public SvPerVech getSvPerVechList() {
        return svPerVechList;
    }

    public void setSvPerVechList(SvPerVech svPerVechList) {
        this.svPerVechList = svPerVechList;
    }
}
