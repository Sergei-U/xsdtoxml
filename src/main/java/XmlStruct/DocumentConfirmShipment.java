package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 *
 */

public class DocumentConfirmShipment {

    private String nameDocumentShipment;

    private String numberDocumentShipment;

    private Date dateDocumentShipment;

    @XmlElement(name = "НаимДокОтгр",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getNameDocumentShipment() {
        return nameDocumentShipment;
    }

    public void setNameDocumentShipment(String nameDocumentShipment) {
        this.nameDocumentShipment = nameDocumentShipment;
    }

    @XmlElement(name = "НомДокОтгр",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getNumberDocumentShipment() {
        return numberDocumentShipment;
    }

    public void setNumberDocumentShipment(String numberDocumentShipment) {
        this.numberDocumentShipment = numberDocumentShipment;
    }

    @XmlElement(name = "ДатаДокОтгр")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public Date getDateDocumentShipment() {
        return dateDocumentShipment;
    }

    public void setDateDocumentShipment(Date dateDocumentShipment) {
        this.dateDocumentShipment = dateDocumentShipment;
    }
}
