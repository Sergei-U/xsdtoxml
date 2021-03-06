package entity;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 */

public class SvULUc {

    private String nameOrg;

    private String innUL;

    private String defInnUL;

    private String kpp;

    private String defKpp;


    @XmlAttribute(name = "НаимОрг", required = true)
    /** "Формат\n" +
     "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    @XmlAttribute(name = "ИННЮЛ", required = true)
    /** "Формат\n" +
     "T(=10) Строка (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getInnUL() {
        return innUL;
    }

    public void setInnUL(String innUL) {
        this.innUL = innUL;
    }

    @XmlAttribute(name = "ДефИННЮЛ", required = true)
    /** "Формат\n" +
     "T(=1) Строка (фиксированное число знаков 1)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Принимает значение: -")*/
    public String getDefInnUL() {
        return defInnUL;
    }

    public void setDefInnUL(String defInnUL) {
        this.defInnUL = defInnUL;
    }

    @XmlAttribute(name = "КПП")
    /** "Формат" +
     "T(=9) Строка (фиксированное число знаков 9)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    @XmlAttribute(name = "ДефКПП")
    /** "Формат\n" +
     "T(=1) Строка (фиксированное число знаков 1)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getDefKpp() {
        return defKpp;
    }

    public void setDefKpp(String defKpp) {
        this.defKpp = defKpp;
    }
}
