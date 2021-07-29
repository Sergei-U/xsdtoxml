package Entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */

public class DopSvedTov {


    /**
     * "Формат\n" +
     * "Перечисление (фиксированное число знаков 1)\n" +
     * "Тип элемента\n" +
     * "Необязательный")
     */
    private PrTovRab prTovRabEnum;
//@XmlElement(name = "ПрТовРаб")

    private String dopPrizn;

    private String nameEdIzm;

    private String krNameStrPr;

    private BigDecimal nadlOtp;

    private String characterProduct;

    private String sortProduct;

    private String articleProduct;

    private String codeProduct;

    private String codeCategory;

    private String codeViewProduct;

    private SvedProslez svedProslezList;

    private NomSredIndentTov nomSredIndentTovList;

    @XmlAttribute(name = "ДопПризн")
    /** "Формат\n" +
     "T(4) Строка (длина от 1 до 4 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getDopPrizn() {
        return dopPrizn;
    }

    public void setDopPrizn(String dopPrizn) {
        this.dopPrizn = dopPrizn;
    }

    @XmlAttribute(name = "НаимЕдИзм")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Условно-Обязательный") */
    public String getNameEdIzm() {
        return nameEdIzm;
    }

    public void setNameEdIzm(String nameEdIzm) {
        this.nameEdIzm = nameEdIzm;
    }

    @XmlAttribute(name = "КрНаимСтрПр")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Условно-Обязательный") */
    public String getKrNameStrPr() {
        return krNameStrPr;
    }

    public void setKrNameStrPr(String krNameStrPr) {
        this.krNameStrPr = krNameStrPr;
    }

    @XmlAttribute(name = "НадлОтп")
    /** "Формат\n" +
     "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public BigDecimal getNadlOtp() {
        return nadlOtp;
    }

    public void setNadlOtp(BigDecimal nadlOtp) {
        this.nadlOtp = nadlOtp;
    }

    @XmlAttribute(name = "ХарактерТов")
    /** "Формат\n" +
     "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
     "Тип элемента\n" +
     "Условно-Обязательный") */
    public String getCharacterProduct() {
        return characterProduct;
    }

    public void setCharacterProduct(String characterProduct) {
        this.characterProduct = characterProduct;
    }

    @XmlElement(name = "СортТов")
    /** "Формат\n" +
     "T(10) Строка (длина от 1 до 10 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getSortProduct() {
        return sortProduct;
    }

    public void setSortProduct(String sortProduct) {
        this.sortProduct = sortProduct;
    }

    @XmlElement(name = "АртикулТов")
    /** "Формат\n" +
     "T(50) Строка (длина от 1 до 50 знаков)\n" +
     "Тип элемента\n" +
     "Условно-Обязательный") */
    public String getArticleProduct() {
        return articleProduct;
    }

    public void setArticleProduct(String articleProduct) {
        this.articleProduct = articleProduct;
    }

    @XmlElement(name = "КодТов")
    /** "Формат\n" +
     "T(100) Строка (длина от 1 до 100 знаков)\n" +
     "Тип элемента\n" +
     "Условно-Обязательный") */
    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    @XmlElement(name = "КодКат")
    /** "Формат\n" +
     "T(=27) Строка (фиксированное число знаков 27)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getCodeCategory() {
        return codeCategory;
    }

    public void setCodeCategory(String codeCategory) {
        this.codeCategory = codeCategory;
    }

    @XmlElement(name = "КодВидТов")
    /** "Формат\n" +
     "T(=10) Строка (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getCodeViewProduct() {
        return codeViewProduct;
    }

    public void setCodeViewProduct(String codeViewProduct) {
        this.codeViewProduct = codeViewProduct;
    }

    @XmlElement(name = "СведПрослеж")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public SvedProslez getSvedProslezList() {
        return svedProslezList;
    }

    public void setSvedProslezList(SvedProslez svedProslezList) {
        this.svedProslezList = svedProslezList;
    }

    @XmlElement(name = "НомСредИдентТов")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел")
     */
    public NomSredIndentTov getNomSredIndentTovList() {
        return nomSredIndentTovList;
    }

    public void setNomSredIndentTovList(NomSredIndentTov nomSredIndentTovList) {
        this.nomSredIndentTovList = nomSredIndentTovList;
    }
}
