package Entity;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class NomSredIndentTov {

    private String identTransPack;

    private String kiz;

    private String nomPack;

    @XmlElement(name = "ИдентТрансУпак")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    public String getIdentTransPack() {
        return identTransPack;
    }

    public void setIdentTransPack(String identTransPack) {
        this.identTransPack = identTransPack;
    }

    @XmlElement(name = "КИЗ")
    @ApiModelProperty(value = "Формат\n" +
            "Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный\n" +
            "Узел")
    public String getKiz() {
        return kiz;
    }

    public void setKiz(String kiz) {
        this.kiz = kiz;
    }

    @XmlElement(name = "НомУпак")
    @ApiModelProperty(value = "Формат\n" +
            "Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный\n" +
            "Узел")
    public String getNomPack() {
        return nomPack;
    }

    public void setNomPack(String nomPack) {
        this.nomPack = nomPack;
    }
}
