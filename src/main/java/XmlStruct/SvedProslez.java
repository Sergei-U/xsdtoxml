package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class SvedProslez {


    @XmlElement(name = "НомТовПрослеж",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(29) Строка (длина от 1 до 29 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String nominalProductProsl;

    @XmlElement(name = "ЕдИзмПрослеж",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(4) Строка (длина от 3 до 4 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String edIzmProsl;

    @XmlElement(name = "НаимЕдИзмПрослеж",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String nameEdIzmProsl;

    @XmlElement(name = "КолВЕдПрослеж",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "N(26.11) Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: 0")
    private String quantityVedProsl;

    @XmlElement(name = "ДопПрослеж")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String dopProsl;


    public String getNominalProductProsl() {
        return nominalProductProsl;
    }

    public void setNominalProductProsl(String nominalProductProsl) {
        this.nominalProductProsl = nominalProductProsl;
    }

    public String getEdIzmProsl() {
        return edIzmProsl;
    }

    public void setEdIzmProsl(String edIzmProsl) {
        this.edIzmProsl = edIzmProsl;
    }

    public String getNameEdIzmProsl() {
        return nameEdIzmProsl;
    }

    public void setNameEdIzmProsl(String nameEdIzmProsl) {
        this.nameEdIzmProsl = nameEdIzmProsl;
    }

    public String getQuantityVedProsl() {
        return quantityVedProsl;
    }

    public void setQuantityVedProsl(String quantityVedProsl) {
        this.quantityVedProsl = quantityVedProsl;
    }

    public String getDopProsl() {
        return dopProsl;
    }

    public void setDopProsl(String dopProsl) {
        this.dopProsl = dopProsl;
    }
}
