package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class FL {

    private String gosRegIPVidDov;

    private String innFL;

    private String overInf;

    private FIO fioList;

    @XmlAttribute(name = "ГосРегИПВыдДов")
    /** "Формат\n" +
     "T(100) Строка (длина от 1 до 100 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getGosRegIPVidDov() {
        return gosRegIPVidDov;
    }

    public void setGosRegIPVidDov(String gosRegIPVidDov) {
        this.gosRegIPVidDov = gosRegIPVidDov;
    }

    @XmlAttribute(name = "ИННФЛ")
    /** "Формат\n" +
     "T(=12) Строка (фиксированное число знаков 12)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getInnFL() {
        return innFL;
    }

    public void setInnFL(String innFL) {
        this.innFL = innFL;
    }

    @XmlAttribute(name = "ИныеСвед")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getOverInf() {
        return overInf;
    }

    public void setOverInf(String overInf) {
        this.overInf = overInf;
    }

    @XmlElement(name = "ФИО", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public FIO getFioList() {
        return fioList;
    }

    public void setFioList(FIO fioList) {
        this.fioList = fioList;
    }
}
