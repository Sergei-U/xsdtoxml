import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Data
public class SvScFact {

    @XmlElement(name = "НомерСчФ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String numberScF;

    @XmlElement(name = "ДатаСчФ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private Date dateScF;

    @XmlElement(name = "КодОКВ")
    @ApiModelProperty(value = "Формат\n" +
            "T(=3) Строка (фиксированное число знаков 3)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String codeOKV;

    @XmlElement(name = "ИспрСчФ", required = false)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<IsprScF> isprScFList;

    @XmlElement(name = "СвПрод",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvProd> svProdList;

    @XmlElement(name = "ГрузОт")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<CargoSender> cargoSenderList;

    @XmlElement(name = "ГрузПолуч")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<CargoReceiver> cargoReceiverList;

    @XmlElement(name = "СвПРД")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<SvPRD> svPRDList;

    @XmlElement(name = "СвПокуп")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvBuyer> svBuyerList;
}
