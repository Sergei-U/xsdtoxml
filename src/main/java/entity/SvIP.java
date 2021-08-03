package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class SvIP {

    private String innFL;

    private String defInnFL;

    private String svGosRegIP;

    private String overData;

    private FIO fioList;

    @XmlAttribute(name = "ИННФЛ", required = true)
    /** "Формат\n" +
     "T(=12) Строка (фиксированное число знаков 12)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getInnFL() {
        return innFL;
    }

    public void setInnFL(String innFL) {
        this.innFL = innFL;
    }

    @XmlAttribute(name = "ДефИННФЛ", required = true)
    /** "Формат\n" +
     "T(=1) Строка (фиксированное число знаков 1)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Принимает значение: -")*/
    public String getDefInnFL() {
        return defInnFL;
    }

    public void setDefInnFL(String defInnFL) {
        this.defInnFL = defInnFL;
    }

    @XmlAttribute(name = "СвГосРегИП")
    /** "Формат\n" +
     "T(100) Строка (длина от 1 до 100 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getSvGosRegIP() {
        return svGosRegIP;
    }

    public void setSvGosRegIP(String svGosRegIP) {
        this.svGosRegIP = svGosRegIP;
    }

    @XmlAttribute(name = "ИныеСвед")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getOverData() {
        return overData;
    }

    public void setOverData(String overData) {
        this.overData = overData;
    }

    @XmlElement(name = "ФИО")
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
