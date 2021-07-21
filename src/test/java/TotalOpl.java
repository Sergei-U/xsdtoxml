import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class TotalOpl {


    @XmlElement(name = "СтТовБезНДСВсего")
    @ApiModelProperty(value = "Формат\n" +
            "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private BigDecimal stProdNoNDSAll;

    @XmlElement(name = "СтТовУчНалВсего",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: 0")
    private BigDecimal stProdUcNalAll;

    @XmlElement(name = "ДефСтТовУчНалВсего",required = true,defaultValue = "-")
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: -")
    private String defStProdUcNalAll;

    @XmlElement(name = "СумНалВсего")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SummNalAll> summNalAllList;

    @XmlElement(name = "КолНеттоВс")
    @ApiModelProperty(value = "Формат\n" +
            "Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private BigDecimal summNetAll;
 }