package Entity;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */

public class DopSvFXZ1 {

    private String idGosContr;

    private String nameOKV;

    private BigDecimal cursVal;


    /**
     * "Формат\n" +
     * "Перечисление (фиксированное число знаков 1)\n" +
     * "Тип элемента\n" +
     * "Необязательный")
     */
    private String obsFormScfEnum;
//    @XmlElement(name = "ОбстФормСЧФ")

    private InfProdGosZakKazn infProdGosZakKaznList;

    private SvFactor svFactorList;

    @XmlElement(name = "ИдГосКон")
    /** "Формат\n" +
     "T(25) Строка (длина от 20 до 25 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getIdGosContr() {
        return idGosContr;
    }

    public void setIdGosContr(String idGosContr) {
        this.idGosContr = idGosContr;
    }

    @XmlElement(name = "НаимОКВ")
    /** "Формат\n" +
     "T(100) Строка (длина от 1 до 100 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getNameOKV() {
        return nameOKV;
    }

    public void setNameOKV(String nameOKV) {
        this.nameOKV = nameOKV;
    }

    @XmlElement(name = "КурсВал")
    /** "Формат\n" +
     "N(10.4) Вещественное (максимальное число знаков 10, в том числе десятичных 4)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public BigDecimal getCursVal() {
        return cursVal;
    }

    public void setCursVal(BigDecimal cursVal) {
        this.cursVal = cursVal;
    }

    @XmlElement(name = "ИнфПродГосЗакКазн")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public InfProdGosZakKazn getInfProdGosZakKaznList() {
        return infProdGosZakKaznList;
    }

    public void setInfProdGosZakKaznList(InfProdGosZakKazn infProdGosZakKaznList) {
        this.infProdGosZakKaznList = infProdGosZakKaznList;
    }

    @XmlElement(name = "СвФактор")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public SvFactor getSvFactorList() {
        return svFactorList;
    }

    public void setSvFactorList(SvFactor svFactorList) {
        this.svFactorList = svFactorList;
    }
}
