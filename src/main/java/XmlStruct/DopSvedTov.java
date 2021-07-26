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
public class DopSvedTov {

//    @XmlElement(name = "ПрТовРаб")
//    @ApiModelProperty(value = "Формат\n" +
//            "Перечисление (фиксированное число знаков 1)\n" +
//            "Тип элемента\n" +
//            "Необязательный")
//    private  Enum<PrTovRab> prTovRabEnum;

    @XmlElement(name = "ДопПризн")
    @ApiModelProperty(value = "Формат\n" +
            "T(4) Строка (длина от 1 до 4 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String dopPrizn;

    @XmlElement(name = "НаимЕдИзм")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private String nameEdIzm;

    @XmlElement(name = "КрНаимСтрПр")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private String krNameStrPr;

    @XmlElement(name = "НадлОтп")
    @ApiModelProperty(value = "Формат\n" +
            "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private BigDecimal nadlOtp;

    @XmlElement(name = "ХарактерТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private String characterProduct;

    @XmlElement(name = "СортТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(10) Строка (длина от 1 до 10 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String sortProduct;

    @XmlElement(name = "АртикулТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private String articleProduct;

    @XmlElement(name = "КодТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(100) Строка (длина от 1 до 100 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private String codeProduct;

    @XmlElement(name = "КодКат")
    @ApiModelProperty(value = "Формат\n" +
            "T(=27) Строка (фиксированное число знаков 27)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String codeCategory;

    @XmlElement(name = "КодВидТов")
    @ApiModelProperty(value = "Формат\n" +
            "T(=10) Строка (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String codeViewProduct;

    @XmlElement(name = "СведПрослеж")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<SvedProslez> svedProslezList;


    @XmlElement(name = "НомСредИдентТов")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<NomSredIndentTov> nomSredIndentTovList;
}
