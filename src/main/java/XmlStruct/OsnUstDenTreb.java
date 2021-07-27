package XmlStruct;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

/**
 *
 */

public class OsnUstDenTreb {

    private String nameOsn;

    private String nomOsn;

    private LocalDate dateOsn;

    private String identityOsn;

    @XmlElement(name = "НаимОсн", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: Без документа-основания")
    public String getNameOsn() {
        return nameOsn;
    }

    public void setNameOsn(String nameOsn) {
        this.nameOsn = nameOsn;
    }

    @XmlElement(name = "НомОсн")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getNomOsn() {
        return nomOsn;
    }

    public void setNomOsn(String nomOsn) {
        this.nomOsn = nomOsn;
    }

    @XmlElement(name = "ДатаОсн")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    public LocalDate getDateOsn() {
        return dateOsn;
    }

    public void setDateOsn(LocalDate dateOsn) {
        this.dateOsn = dateOsn;
    }

    @XmlElement(name = "ИдентОсн")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getIdentityOsn() {
        return identityOsn;
    }

    public void setIdentityOsn(String identityOsn) {
        this.identityOsn = identityOsn;
    }
}
