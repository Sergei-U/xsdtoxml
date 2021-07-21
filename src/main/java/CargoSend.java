import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */
@Data
public class CargoSend {


    @XmlElement(name = "ОКПО")
    @ApiModelProperty(value = "Формат\n" +
            "T(10) Строка (длина от 1 до 10 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String okpo;

    @XmlElement(name = "СтруктПодр")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String structSubdivision;

    @XmlElement(name = "ИнфДляУчаст")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String infForParticipation;

    @XmlElement(name = "КраткНазв")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String shortName;

    @XmlElement(name = "ИдСв",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<IdSv> idSvList;

    @XmlElement(name = "Адрес")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<Address> addressList;

    @XmlElement(name = "Контакт")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<Contact> contactList;

    @XmlElement(name = "БанкРекв")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<BankReq> bankReqList;
}
