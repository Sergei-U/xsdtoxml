package entity;

import javax.xml.bind.annotation.XmlElement;


public class RabOrgProd {

    private String rabOrgProd;

    private String overSved;

    private String osnSved;

    private FIO fioList;

    @XmlElement(name = "РабОргПрод", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public String getRabOrgProd() {
        return rabOrgProd;
    }

    public void setRabOrgProd(String rabOrgProd) {
        this.rabOrgProd = rabOrgProd;
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

    @XmlElement(name = "ОснПолн")
    /** "Формат\n" +
     "T(120) Строка (длина от 1 до 120 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getOsnSved() {
        return osnSved;
    }

    public void setOsnSved(String osnSved) {
        this.osnSved = osnSved;
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
