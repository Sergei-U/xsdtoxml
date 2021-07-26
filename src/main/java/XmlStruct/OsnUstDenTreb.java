package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 *
 */

public class OsnUstDenTreb {

    @XmlElement(name = "НаимОсн",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: Без документа-основания")
    private String nameOsn;

    @XmlElement(name = "НомОсн")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String nomOsn;

    @XmlElement(name = "ДатаОсн")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private Date dateOsn;

    @XmlElement(name = "ИдентОсн")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String identityOsn;

    public String getNameOsn() {
        return nameOsn;
    }

    public void setNameOsn(String nameOsn) {
        this.nameOsn = nameOsn;
    }

    public String getNomOsn() {
        return nomOsn;
    }

    public void setNomOsn(String nomOsn) {
        this.nomOsn = nomOsn;
    }

    public Date getDateOsn() {
        return dateOsn;
    }

    public void setDateOsn(Date dateOsn) {
        this.dateOsn = dateOsn;
    }

    public String getIdentityOsn() {
        return identityOsn;
    }

    public void setIdentityOsn(String identityOsn) {
        this.identityOsn = identityOsn;
    }
}
