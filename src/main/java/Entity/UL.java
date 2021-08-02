package Entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class UL {

    private String gosRegIPVidDov;

    private String innUL;

    private String nameOrg;

    private String dolzhnost;

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
    public String getInnUL() {
        return innUL;
    }

    public void setInnUL(String innUL) {
        this.innUL = innUL;
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

    @XmlElement(name = "НаимОрг")
    /**
     * Формат
     * T(1000) Строка (длина от 1 до 1000 знаков)
     * Тип элемента
     * Необязательный
     */
    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    @XmlAttribute(name = "Должн")
    /**
     * Формат
     * T(128) Строка (длина до 128 знаков)
     * Тип элемента
     * Обязательный
     */
    public String getDolzhnost() {
        return dolzhnost;
    }

    public void setDolzhnost(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }
}
