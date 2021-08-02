package Entity;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Document {

    private String knd;

    private String func;

    private String poFactHZ;

    private String nameDocReq;

    private LocalDate dateInfPr;

    private LocalDateTime timeInfPr;

    private String nameEconSubCondition;

    private String osnDoverOrgCondition;

    private String soglStrDopInf;

    private SvScFact svScFact;

    private TableScFact tableScFact;

    private SvProdPer svProdPer;

    private Podpisant podpisant;

    @XmlAttribute(name = "КНД", required = true)
    /** "Формат\n" +
     "T(=7) Строка (фиксированное число знаков 7)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "'Ключевой'\n" +
     "Принимает значение: 1115131")*/
     public String getKnd() {
     return knd;
     }

     public void setKnd(String knd) {
     this.knd = knd;
     }

     @XmlAttribute(name = "Функция", required = true)
     /** "Формат\n" +
     "T(6) Строка (длина от 1 до 6 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "'Ключевой'\n" +
     "Принимает значение: СЧФ")*/
     public String getFunc() {
     return func;
     }

     public void setFunc(String func) {
     this.func = func;
     }

     @XmlAttribute(name = "ПоФактХЖ", required = false)
     /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getPoFactHZ() {
        return poFactHZ;
    }

    public void setPoFactHZ(String poFactHZ) {
        this.poFactHZ = poFactHZ;
    }

    @XmlAttribute(name = "НаимДокОпр", required = false)
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getNameDocReq() {
        return nameDocReq;
    }

    public void setNameDocReq(String nameDocReq) {
        this.nameDocReq = nameDocReq;
    }

    @XmlAttribute(name = "ДатаИнфПр", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    /** "Формат\n" +
     "D(10) Дата (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public LocalDate getDateInfPr() {
        return dateInfPr;
    }

    public void setDateInfPr(LocalDate dateInfPr) {
        this.dateInfPr = dateInfPr;
    }

    @XmlAttribute(name = "ВремИнфПр", required = true)
    @XmlJavaTypeAdapter(TimeAdapter.class)
    @XmlSchemaType(name = "datetime")
    /** "Формат\n" +
     "D(8) Время (фиксированное число знаков 8)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public LocalDateTime getTimeInfPr() {
        return timeInfPr;
    }

    public void setTimeInfPr(LocalDateTime timeInfPr) {
        this.timeInfPr = timeInfPr;
    }

    @XmlAttribute(name = "НаимЭконСубСост", required = true)
    /** "Формат\n" +
     "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getNameEconSubCondition() {
        return nameEconSubCondition;
    }

    public void setNameEconSubCondition(String nameEconSubCondition) {
        this.nameEconSubCondition = nameEconSubCondition;
    }

    @XmlAttribute(name = "ОснДоверОргСост")
    /** "Формат\n" +
     "T(120) Строка (длина от 1 до 120 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getOsnDoverOrgCondition() {
        return osnDoverOrgCondition;
    }

    public void setOsnDoverOrgCondition(String osnDoverOrgCondition) {
        this.osnDoverOrgCondition = osnDoverOrgCondition;
    }

    @XmlAttribute(name = "СоглСтрДопИнф", required = false)
    /** "Формат\n" +
     "T(=14) Строка (фиксированное число знаков 14)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getSoglStrDopInf() {
        return soglStrDopInf;
    }

    public void setSoglStrDopInf(String soglStrDopInf) {
        this.soglStrDopInf = soglStrDopInf;
    }

    @XmlElement(name = "СвСчФакт")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public SvScFact getSvScFact() {
        return svScFact;
    }

    public void setSvScFact(SvScFact svScFact) {
        this.svScFact = svScFact;
    }

    @XmlElement(name = "ТаблСчФакт")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Условно-Обязательный\n" +
     "Узел") */
    public TableScFact getTableScFact() {
        return tableScFact;
    }

    public void setTableScFact(TableScFact tableScFact) {
        this.tableScFact = tableScFact;
    }

    @XmlElement(name = "СвПродПер")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Условно-Обязательный\n" +
     "Узел") */
    public SvProdPer getSvProdPer() {
        return svProdPer;
    }

    public void setSvProdPer(SvProdPer svProdPer) {
        this.svProdPer = svProdPer;
    }

    @XmlElement(name = "Подписант")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public Podpisant getPodpisant() {
        return podpisant;
    }


    public void setPodpisant(Podpisant podpisant) {
        this.podpisant = podpisant;
    }
}
