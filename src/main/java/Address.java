import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */
@Data
public class Address {

    @XmlElement(name = "АдрРФ")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<AddressRF> addressRFList;

    @XmlElement(name = "АдрИнф")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<AddressInf> addressInfList;

    @XmlElement(name = "КодГАР",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка (длина от 1 до 36 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private String codeGAR;
}
