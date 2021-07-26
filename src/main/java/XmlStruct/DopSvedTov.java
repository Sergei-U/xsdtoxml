package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 */

public class DopSvedTov {

//    @XmlElement(name = "ПрТовРаб")
//    @ApiModelProperty(value = "Формат\n" +
//            "Перечисление (фиксированное число знаков 1)\n" +
//            "Тип элемента\n" +
//            "Необязательный")
//    private  Enum<PrTovRab> prTovRabEnum;


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

    private List<SvedProslez> svedProslezList;

    private List<NomSredIndentTov> nomSredIndentTovList;

    @XmlElement(name = "ДопПризн")
    @ApiModelProperty(value = "Формат\n" +
            "T(4) Строка (длина от 1 до 4 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getDopPrizn() {
        return dopPrizn;
    }

    public void setDopPrizn(String dopPrizn) {
        this.dopPrizn = dopPrizn;
    }

    @XmlElement(name = "НаимЕдИзм")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    public String getNameEdIzm() {
        return nameEdIzm;
    }

    public void setNameEdIzm(String nameEdIzm) {
        this.nameEdIzm = nameEdIzm;
    }

    @XmlElement(name = "КрНаимСтрПр")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    public String getKrNameStrPr() {
        return krNameStrPr;
    }

    public void setKrNameStrPr(String krNameStrPr) {
        this.krNameStrPr = krNameStrPr;
    }

    @XmlElement(name = "НадлОтп")
    @ApiModelProperty(value = "Формат\n" +
            "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public BigDecimal getNadlOtp() {
        return nadlOtp;
    }

    public void setNadlOtp(BigDecimal nadlOtp) {
        this.nadlOtp = nadlOtp;
    }

    @XmlElement(name = "ХарактерТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    public String getCharacterProduct() {
        return characterProduct;
    }

    public void setCharacterProduct(String characterProduct) {
        this.characterProduct = characterProduct;
    }

    @XmlElement(name = "СортТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(10) Строка (длина от 1 до 10 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getSortProduct() {
        return sortProduct;
    }

    public void setSortProduct(String sortProduct) {
        this.sortProduct = sortProduct;
    }

    @XmlElement(name = "АртикулТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    public String getArticleProduct() {
        return articleProduct;
    }

    public void setArticleProduct(String articleProduct) {
        this.articleProduct = articleProduct;
    }

    @XmlElement(name = "КодТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(100) Строка (длина от 1 до 100 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    @XmlElement(name = "КодКат")
    @ApiModelProperty(value = "Формат\n" +
            "T(=27) Строка (фиксированное число знаков 27)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getCodeCategory() {
        return codeCategory;
    }

    public void setCodeCategory(String codeCategory) {
        this.codeCategory = codeCategory;
    }

    @XmlElement(name = "КодВидТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(=10) Строка (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getCodeViewProduct() {
        return codeViewProduct;
    }

    public void setCodeViewProduct(String codeViewProduct) {
        this.codeViewProduct = codeViewProduct;
    }

    @XmlElement(name = "СведПрослеж")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<SvedProslez> getSvedProslezList() {
        return svedProslezList;
    }

    public void setSvedProslezList(List<SvedProslez> svedProslezList) {
        this.svedProslezList = svedProslezList;
    }

    @XmlElement(name = "НомСредИдентТов")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<NomSredIndentTov> getNomSredIndentTovList() {
        return nomSredIndentTovList;
    }

    public void setNomSredIndentTovList(List<NomSredIndentTov> nomSredIndentTovList) {
        this.nomSredIndentTovList = nomSredIndentTovList;
    }
}
