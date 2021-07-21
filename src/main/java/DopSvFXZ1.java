import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
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

    //need add ENUM ОбстФормСЧФ
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
}
