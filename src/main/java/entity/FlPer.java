package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class FlPer {

    private String overSved;

    private String osnDoverFl;

    private FIO fioList;

    @XmlAttribute(name = "ИныеСвед")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getOverSved() {
        return overSved;
    }

    public void setOverSved(String overSved) {
        this.overSved = overSved;
    }

    @XmlAttribute(name = "ОснДоверФЛ")
    /** "Формат\n" +
     "T(120) Строка (длина от 1 до 120 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getOsnDoverFl() {
        return osnDoverFl;
    }

    public void setOsnDoverFl(String osnDoverFl) {
        this.osnDoverFl = osnDoverFl;
    }

    @XmlElement(name = "ФИО", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел")
     */
    public FIO getFioList() {
        return fioList;
    }

    public void setFioList(FIO fioList) {
        this.fioList = fioList;
    }
}
