import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */
@Data
public class SvUcDocObor {

    @XmlElement(name = "ИдОтпр")
    @ApiModelProperty(value = "Формат\n" +
            "T(46) Строка (длина от 4 до 46 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String idDispatch;

    @XmlElement(name = "ИдПол")
    @ApiModelProperty(value = "Формат\n" +
            "T(46) Строка (длина от 4 до 46 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String idReception;

    @XmlElement(name = "СвОЭДОтпр")
    private List<SvOEDDispatch> svOEDDispatchList;
}
