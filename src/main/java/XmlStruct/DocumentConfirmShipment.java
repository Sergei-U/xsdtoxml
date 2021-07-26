package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 *
 */

public class DocumentConfirmShipment {

    @XmlElement(name = "НаимДокОтгр",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String nameDocumentShipment;

    @XmlElement(name = "НомДокОтгр",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String numberDocumentShipment;

    @XmlElement(name = "ДатаДокОтгр")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private Date dateDocumentShipment;


    public String getNameDocumentShipment() {
        return nameDocumentShipment;
    }

    public void setNameDocumentShipment(String nameDocumentShipment) {
        this.nameDocumentShipment = nameDocumentShipment;
    }

    public String getNumberDocumentShipment() {
        return numberDocumentShipment;
    }

    public void setNumberDocumentShipment(String numberDocumentShipment) {
        this.numberDocumentShipment = numberDocumentShipment;
    }

    public Date getDateDocumentShipment() {
        return dateDocumentShipment;
    }

    public void setDateDocumentShipment(Date dateDocumentShipment) {
        this.dateDocumentShipment = dateDocumentShipment;
    }
}
