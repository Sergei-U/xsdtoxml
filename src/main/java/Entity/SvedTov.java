package Entity;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 */

public class SvedTov {

    private int nomStr;

    private String nameProduct;

    private String okei_product;

    private String defOKEI_product;

    private BigDecimal quantityProduct;

    private BigDecimal priceProduct;

    private BigDecimal priceProductNoNDS;


    @ApiModelProperty(value = "Формат\n" +
            "Перечисление (длина от 1 до 35 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public NalST nalSTEnum;
//@XmlElement(name = "НалСт",required = true)

    private BigDecimal stTovUcNal;

    private String defStTovUcNal;

    private List<Excise> exciseList;

    private List<SummNal> summNalList;

    private List<SvTD> svTDList;

    private List<DopSvedTov> dopSvedTovList;

    private List<InfPolFXZ2> infPolFXZ2List;

    @XmlElement(name = "НомСтр", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "N(6) Целое (максимальное число знаков 6)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: 0")
    public int getNomStr() {
        return nomStr;
    }

    public void setNomStr(int nomStr) {
        this.nomStr = nomStr;
    }

    @XmlElement(name = "НаимТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @XmlElement(name = "ОКЕИ_Тов")
    @ApiModelProperty(value = "Формат\n" +
            "T(4) Строка (длина от 3 до 4 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    public String getOkei_product() {
        return okei_product;
    }

    public void setOkei_product(String okei_product) {
        this.okei_product = okei_product;
    }

    @XmlElement(name = "ДефОКЕИ_Тов")
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный\n" +
            "Принимает значение: -")
    public String getDefOKEI_product() {
        return defOKEI_product;
    }

    public void setDefOKEI_product(String defOKEI_product) {
        this.defOKEI_product = defOKEI_product;
    }

    @XmlElement(name = "КолТов")
    @ApiModelProperty(value = "Формат\n" +
            "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    public BigDecimal getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(BigDecimal quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    @XmlElement(name = "ЦенаТов")
    @ApiModelProperty(value = "Формат\n" +
            "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Принимает значение: 0")
    public BigDecimal getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(BigDecimal priceProduct) {
        this.priceProduct = priceProduct;
    }

    @XmlElement(name = "СтТовБезНДС")
    @ApiModelProperty(value = "Формат\n" +
            "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Принимает значение: 0")
    public BigDecimal getPriceProductNoNDS() {
        return priceProductNoNDS;
    }

    public void setPriceProductNoNDS(BigDecimal priceProductNoNDS) {
        this.priceProductNoNDS = priceProductNoNDS;
    }

    @XmlElement(name = "СтТовУчНал", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: 0")
    public BigDecimal getStTovUcNal() {
        return stTovUcNal;
    }

    public void setStTovUcNal(BigDecimal stTovUcNal) {
        this.stTovUcNal = stTovUcNal;
    }

    @XmlElement(name = "ДефСтТовУчНал", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: -")
    public String getDefStTovUcNal() {
        return defStTovUcNal;
    }

    public void setDefStTovUcNal(String defStTovUcNal) {
        this.defStTovUcNal = defStTovUcNal;
    }

    @XmlElement(name = "Акциз", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<Excise> getExciseList() {
        return exciseList;
    }

    public void setExciseList(List<Excise> exciseList) {
        this.exciseList = exciseList;
    }

    @XmlElement(name = "СумНал", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<SummNal> getSummNalList() {
        return summNalList;
    }

    public void setSummNalList(List<SummNal> summNalList) {
        this.summNalList = summNalList;
    }

    @XmlElement(name = "СвТД")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<SvTD> getSvTDList() {
        return svTDList;
    }

    public void setSvTDList(List<SvTD> svTDList) {
        this.svTDList = svTDList;
    }

    @XmlElement(name = "ДопСведТов")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<DopSvedTov> getDopSvedTovList() {
        return dopSvedTovList;
    }

    public void setDopSvedTovList(List<DopSvedTov> dopSvedTovList) {
        this.dopSvedTovList = dopSvedTovList;
    }

    @XmlElement(name = "ИнфПолФХЖ2")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<InfPolFXZ2> getInfPolFXZ2List() {
        return infPolFXZ2List;
    }

    public void setInfPolFXZ2List(List<InfPolFXZ2> infPolFXZ2List) {
        this.infPolFXZ2List = infPolFXZ2List;
    }
}
