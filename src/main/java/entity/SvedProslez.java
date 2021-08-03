package entity;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class SvedProslez {

    private String nominalProductProsl;

    private String edIzmProsl;

    private String nameEdIzmProsl;

    private String quantityVedProsl;

    private String dopProsl;


    @XmlElement(name = "НомТовПрослеж", required = true)
    /** "Формат\n" +
     "T(29) Строка (длина от 1 до 29 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getNominalProductProsl() {
        return nominalProductProsl;
    }

    public void setNominalProductProsl(String nominalProductProsl) {
        this.nominalProductProsl = nominalProductProsl;
    }

    @XmlElement(name = "ЕдИзмПрослеж", required = true)
    /** "Формат\n" +
     "T(4) Строка (длина от 3 до 4 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getEdIzmProsl() {
        return edIzmProsl;
    }

    public void setEdIzmProsl(String edIzmProsl) {
        this.edIzmProsl = edIzmProsl;
    }

    @XmlElement(name = "НаимЕдИзмПрослеж", required = true)
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getNameEdIzmProsl() {
        return nameEdIzmProsl;
    }

    public void setNameEdIzmProsl(String nameEdIzmProsl) {
        this.nameEdIzmProsl = nameEdIzmProsl;
    }

    @XmlElement(name = "КолВЕдПрослеж", required = true)
    /** "Формат\n" +
     "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Принимает значение: 0")*/
    public String getQuantityVedProsl() {
        return quantityVedProsl;
    }

    public void setQuantityVedProsl(String quantityVedProsl) {
        this.quantityVedProsl = quantityVedProsl;
    }

    @XmlElement(name = "ДопПрослеж")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getDopProsl() {
        return dopProsl;
    }

    public void setDopProsl(String dopProsl) {
        this.dopProsl = dopProsl;
    }
}
