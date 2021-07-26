package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 */

public class DopSvFXZ1 {

    @XmlElement(name = "ИдГосКон")
    @ApiModelProperty(value = "Формат\n" +
            "T(25) Строка (длина от 20 до 25 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String idGosContr;

    @XmlElement(name = "НаимОКВ")
    @ApiModelProperty(value = "Формат\n" +
            "T(100) Строка (длина от 1 до 100 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String nameOKV;

    @XmlElement(name = "КурсВал")
    @ApiModelProperty(value = "Формат\n" +
            "N(10.4) Вещественное (максимальное число знаков 10, в том числе десятичных 4)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private BigDecimal cursVal;

//    @XmlElement(name = "ОбстФормСЧФ")
//    @ApiModelProperty(value = "Формат\n" +
//            "Перечисление (фиксированное число знаков 1)\n" +
//            "Тип элемента\n" +
//            "Необязательный")
//    private Enum<ObsFormScf> obsFormScfEnum;


    @XmlElement(name = "ИнфПродГосЗакКазн")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<InfProdGosZakKazn> infProdGosZakKaznList;

    @XmlElement(name = "СвФактор")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<SvFactor> svFactorList;

    public String getIdGosContr() {
        return idGosContr;
    }

    public void setIdGosContr(String idGosContr) {
        this.idGosContr = idGosContr;
    }

    public String getNameOKV() {
        return nameOKV;
    }

    public void setNameOKV(String nameOKV) {
        this.nameOKV = nameOKV;
    }

    public BigDecimal getCursVal() {
        return cursVal;
    }

    public void setCursVal(BigDecimal cursVal) {
        this.cursVal = cursVal;
    }

    public List<InfProdGosZakKazn> getInfProdGosZakKaznList() {
        return infProdGosZakKaznList;
    }

    public void setInfProdGosZakKaznList(List<InfProdGosZakKazn> infProdGosZakKaznList) {
        this.infProdGosZakKaznList = infProdGosZakKaznList;
    }

    public List<SvFactor> getSvFactorList() {
        return svFactorList;
    }

    public void setSvFactorList(List<SvFactor> svFactorList) {
        this.svFactorList = svFactorList;
    }
}