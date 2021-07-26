package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Data
public class InfPolFXZ3 {

    @XmlElement(name = "ИдФайлИнфПол")
    @ApiModelProperty(value = "Формат\n" +
            "T(=36) Строка (фиксированное число знаков 36)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String idFileInfPol;

    @XmlElement(name = "ТекстИнф")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<TextInf> textInfList;
}
