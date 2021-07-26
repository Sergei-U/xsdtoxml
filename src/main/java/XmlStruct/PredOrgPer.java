package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Data
public class PredOrgPer {


    @XmlElement(name = "Должность",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(128) Строка (длина от 1 до 128 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String dolznost;

    @XmlElement(name = "ИныеСвед")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String overSved;

    @XmlElement(name = "НаимОргПер",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(128) Строка (длина от 1 до 128 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String nameOrgPer;

    @XmlElement(name = "ОснДоверОргПер")
    @ApiModelProperty(value = "Формат\n" +
            "T(120) Строка (длина от 1 до 120 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String osnDoverOrgPer;

    @XmlElement(name = "ОснПолнПредПер")
    @ApiModelProperty(value = "Формат\n" +
            "T(120) Строка (длина от 1 до 120 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String osnPolnPredPer;

    private List<FIO> fioList;
}


