package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;


public class OsnPer {

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
    private String nomOns;

    @XmlElement(name = "ДатаОсн")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private Date dateOsn;

    @XmlElement(name = "ДопСвОсн")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String dopSvOsn;

    @XmlElement(name = "ИдентОсн")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String identOsn;


    public String getNameOsn() {
        return nameOsn;
    }

    public void setNameOsn(String nameOsn) {
        this.nameOsn = nameOsn;
    }

    public String getNomOns() {
        return nomOns;
    }

    public void setNomOns(String nomOns) {
        this.nomOns = nomOns;
    }

    public Date getDateOsn() {
        return dateOsn;
    }

    public void setDateOsn(Date dateOsn) {
        this.dateOsn = dateOsn;
    }

    public String getDopSvOsn() {
        return dopSvOsn;
    }

    public void setDopSvOsn(String dopSvOsn) {
        this.dopSvOsn = dopSvOsn;
    }

    public String getIdentOsn() {
        return identOsn;
    }

    public void setIdentOsn(String identOsn) {
        this.identOsn = identOsn;
    }
}
