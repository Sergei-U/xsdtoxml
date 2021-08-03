package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

/**
 *
 */

public class DocumentConfirmShipment {

    private String nameDocumentShipment;

    private String numberDocumentShipment;

    private LocalDate dateDocumentShipment;

    @XmlAttribute(name = "НаимДокОтгр", required = true)
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getNameDocumentShipment() {
        return nameDocumentShipment;
    }

    public void setNameDocumentShipment(String nameDocumentShipment) {
        this.nameDocumentShipment = nameDocumentShipment;
    }

    @XmlAttribute(name = "НомДокОтгр", required = true)
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getNumberDocumentShipment() {
        return numberDocumentShipment;
    }

    public void setNumberDocumentShipment(String numberDocumentShipment) {
        this.numberDocumentShipment = numberDocumentShipment;
    }

    @XmlAttribute(name = "ДатаДокОтгр")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    /** "Формат\n" +
     "D(10) Дата (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public LocalDate getDateDocumentShipment() {
        return dateDocumentShipment;
    }

    public void setDateDocumentShipment(LocalDate dateDocumentShipment) {
        this.dateDocumentShipment = dateDocumentShipment;
    }
}
