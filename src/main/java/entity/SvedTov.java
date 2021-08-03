package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

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

    private BigDecimal stTovUcNal;

    private String defStTovUcNal;

    private Excise exciseList;

    private SummNal summNalList;

    private SvTD svTDList;

    private DopSvedTov dopSvedTovList;

    private InfPolFXZ2 infPolFXZ2List;

    private String nalst;


    @XmlAttribute(name = "НалСт")
    public String getNalst() {
        return nalst;
    }

    public void setNalst(String nalst) {
        this.nalst = nalst;
    }

    @XmlAttribute(name = "НомСтр", required = true)
    /** "Формат\n" +
     "N(6) Целое (максимальное число знаков 6)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Принимает значение: 0")*/
    public int getNomStr() {
        return nomStr;
    }

    public void setNomStr(int nomStr) {
        this.nomStr = nomStr;
    }

    @XmlAttribute(name = "НаимТов")
    /** "Формат\n" +
     "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
     "Тип элемента\n" +
     "Условно-Обязательный") */
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @XmlAttribute(name = "ОКЕИ_Тов")
    /** "Формат\n" +
     "T(4) Строка (длина от 3 до 4 знаков)\n" +
     "Тип элемента\n" +
     "Условно-Обязательный") */
    public String getOkei_product() {
        return okei_product;
    }

    public void setOkei_product(String okei_product) {
        this.okei_product = okei_product;
    }

    @XmlAttribute(name = "ДефОКЕИ_Тов")
    /** "Формат\n" +
     "T(=1) Строка (фиксированное число знаков 1)\n" +
     "Тип элемента\n" +
     "Условно-Обязательный\n" +
     "Принимает значение: -")*/
    public String getDefOKEI_product() {
        return defOKEI_product;
    }

    public void setDefOKEI_product(String defOKEI_product) {
        this.defOKEI_product = defOKEI_product;
    }

    @XmlAttribute(name = "КолТов")
    /** "Формат\n" +
     "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
     "Тип элемента\n" +
     "Условно-Обязательный") */
    public BigDecimal getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(BigDecimal quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    @XmlAttribute(name = "ЦенаТов")
    /** "Формат\n" +
     "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Принимает значение: 0")*/
    public BigDecimal getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(BigDecimal priceProduct) {
        this.priceProduct = priceProduct;
    }

    @XmlAttribute(name = "СтТовБезНДС")
    /** "Формат\n" +
     "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Принимает значение: 0")*/
    public BigDecimal getPriceProductNoNDS() {
        return priceProductNoNDS;
    }

    public void setPriceProductNoNDS(BigDecimal priceProductNoNDS) {
        this.priceProductNoNDS = priceProductNoNDS;
    }


    @XmlAttribute(name = "СтТовУчНал", required = true)
    /** "Формат\n" +
     "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Принимает значение: 0")*/
    public BigDecimal getStTovUcNal() {
        return stTovUcNal;
    }

    public void setStTovUcNal(BigDecimal stTovUcNal) {
        this.stTovUcNal = stTovUcNal;
    }

    @XmlAttribute(name = "ДефСтТовУчНал", required = true)
    /** "Формат\n" +
     "T(=1) Строка (фиксированное число знаков 1)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Принимает значение: -")*/
    public String getDefStTovUcNal() {
        return defStTovUcNal;
    }

    public void setDefStTovUcNal(String defStTovUcNal) {
        this.defStTovUcNal = defStTovUcNal;
    }

    @XmlElement(name = "Акциз", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public Excise getExciseList() {
        return exciseList;
    }

    public void setExciseList(Excise exciseList) {
        this.exciseList = exciseList;
    }

    @XmlElement(name = "СумНал", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public SummNal getSummNalList() {
        return summNalList;
    }

    public void setSummNalList(SummNal summNalList) {
        this.summNalList = summNalList;
    }

    @XmlElement(name = "СвТД")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public SvTD getSvTDList() {
        return svTDList;
    }

    public void setSvTDList(SvTD svTDList) {
        this.svTDList = svTDList;
    }

    @XmlElement(name = "ДопСведТов")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public DopSvedTov getDopSvedTovList() {
        return dopSvedTovList;
    }

    public void setDopSvedTovList(DopSvedTov dopSvedTovList) {
        this.dopSvedTovList = dopSvedTovList;
    }

    @XmlElement(name = "ИнфПолФХЖ2")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public InfPolFXZ2 getInfPolFXZ2List() {
        return infPolFXZ2List;
    }

    public void setInfPolFXZ2List(InfPolFXZ2 infPolFXZ2List) {
        this.infPolFXZ2List = infPolFXZ2List;
    }
}
