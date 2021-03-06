package entity;

import javax.xml.bind.annotation.XmlElement;


public class PredOrgPer {

    private String dolznost;

    private String overSved;

    private String nameOrgPer;

    private String osnDoverOrgPer;

    private String osnPolnPredPer;

    private FIO fioList;

    @XmlElement(name = "Должность", required = true)
    /** "Формат\n" +
     "T(128) Строка (длина от 1 до 128 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getDolznost() {
        return dolznost;
    }

    public void setDolznost(String dolznost) {
        this.dolznost = dolznost;
    }

    @XmlElement(name = "ИныеСвед")
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

    @XmlElement(name = "НаимОргПер", required = true)
    /** "Формат\n" +
     "T(128) Строка (длина от 1 до 128 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getNameOrgPer() {
        return nameOrgPer;
    }

    public void setNameOrgPer(String nameOrgPer) {
        this.nameOrgPer = nameOrgPer;
    }

    @XmlElement(name = "ОснДоверОргПер")
    /** "Формат\n" +
     "T(120) Строка (длина от 1 до 120 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getOsnDoverOrgPer() {
        return osnDoverOrgPer;
    }

    public void setOsnDoverOrgPer(String osnDoverOrgPer) {
        this.osnDoverOrgPer = osnDoverOrgPer;
    }

    @XmlElement(name = "ОснПолнПредПер")
    /** "Формат\n" +
     "T(120) Строка (длина от 1 до 120 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getOsnPolnPredPer() {
        return osnPolnPredPer;
    }

    public void setOsnPolnPredPer(String osnPolnPredPer) {
        this.osnPolnPredPer = osnPolnPredPer;
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


