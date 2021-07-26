package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class SvedTov {

    @XmlElement(name = "НомСтр",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "N(6) Целое (максимальное число знаков 6)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: 0")
    private int nomStr;

    @XmlElement(name = "НаимТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private String nameProduct;

    @XmlElement(name = "ОКЕИ_Тов")
    @ApiModelProperty(value = "Формат\n" +
            "T(4) Строка (длина от 3 до 4 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private String okei_product;

    @XmlElement(name = "ДефОКЕИ_Тов")
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный\n" +
            "Принимает значение: -")
    private String defOKEI_product;

    @XmlElement(name = "КолТов")
    @ApiModelProperty(value = "Формат\n" +
            "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private BigDecimal quantityProduct;

    @XmlElement(name = "ЦенаТов")
    @ApiModelProperty(value = "Формат\n" +
            "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Принимает значение: 0")
    private BigDecimal priceProduct;

    @XmlElement(name = "СтТовБезНДС")
    @ApiModelProperty(value = "Формат\n" +
            "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Принимает значение: 0")
    private BigDecimal priceProductNoNDS;

//    @XmlElement(name = "НалСт")
//    @ApiModelProperty(value = "Формат\n" +
//            "Перечисление (длина от 1 до 35 знаков)\n" +
//            "Тип элемента\n" +
//            "Обязательный")
//    public Enum<NalST> nalSTEnum;


    @XmlElement(name = "СтТовУчНал",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: 0")
    private BigDecimal stTovUcNal;

    @XmlElement(name = "ДефСтТовУчНал",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: -")
    private String defStTovUcNal;

    @XmlElement(name = "Акциз",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<Excise> exciseList;

    @XmlElement(name = "СумНал",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SummNal> summNalList;

    @XmlElement(name = "СвТД")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<SvTD> svTDList;

    @XmlElement(name = "ДопСведТов")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<DopSvedTov> dopSvedTovList;


    @XmlElement(name = "ИнфПолФХЖ2")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<InfPolFXZ2> infPolFXZ2List;

}
