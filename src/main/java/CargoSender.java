import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */
@Data
public class CargoSender {

    @XmlElement(name = "ОнЖе")
    @ApiModelProperty(value = "Формат\n" +
            "Строка (фиксированное число знаков 5)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private String onZ;

    @XmlElement(name = "ГрузОтпр",required = true)
    @ApiModelProperty(value = "\n" +
            "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<CargoSend> cargoSendList;
}
