package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Podpisant {

    private int oblPolnEnum;

    private int statusEnum;

    private String osnPoln;

    private String osnPolnOrg;

    private FL fl;

    private IP ip;

    private UL ul;

    @XmlAttribute(name = "ОблПолн", required = true)
    /** "Формат\n" +
     "Перечисление (длина от 1 до 2 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public int getOblPolnEnum() {
        return oblPolnEnum;
    }

    public void setOblPolnEnum(int oblPolnEnum) {
        this.oblPolnEnum = oblPolnEnum;
    }

    @XmlAttribute(name = "Статус", required = true)
    /**
     * Формат
     * Перечисление (длина от 1 до 2 знаков)
     * Тип элемента
     * Обязательный
     */
    public int getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(int statusEnum) {
        this.statusEnum = statusEnum;
    }


    @XmlAttribute(name = "ОснПолн", required = true)
    /**
     * Формат
     * T(255) Строка (длина от 1 до 255 знаков)
     * Тип элемента
     * Обязательный
     */
    public String getOsnPoln() {
        return osnPoln;
    }

    public void setOsnPoln(String osnPoln) {
        this.osnPoln = osnPoln;
    }

    @XmlAttribute(name = "ОснПолнОрг")
    /**
     * Формат
     * T(255) Строка (длина от 1 до 255 знаков)
     * Тип элемента
     * Условно-Обязательный
     */
    public String getOsnPolnOrg() {
        return osnPolnOrg;
    }

    public void setOsnPolnOrg(String osnPolnOrg) {
        this.osnPolnOrg = osnPolnOrg;
    }

    @XmlElement(name = "ФЛ")
    /**
     * Формат
     * Строка
     * Тип элемента
     * Обязательный
     * Узел
     */
    public FL getFl() {
        return fl;
    }

    public void setFl(FL fl) {
        this.fl = fl;
    }


    @XmlElement(name = "ИП")
    /**
     * Формат
     * Строка
     * Тип элемента
     * Обязательный
     * Узел
     */
    public IP getIp() {
        return ip;
    }

    public void setIp(IP ip) {
        this.ip = ip;
    }


    @XmlElement(name = "ЮЛ")
    /**
     * Формат
     * Строка
     * Тип элемента
     * Обязательный
     * Узел
     */
    public UL getUl() {
        return ul;
    }


    public void setUl(UL ul) {
        this.ul = ul;
    }
}