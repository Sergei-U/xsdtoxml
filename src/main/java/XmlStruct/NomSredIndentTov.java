package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class NomSredIndentTov {

    @XmlElement(name = "ИдентТрансУпак")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный")
    private String identTransPack;

    @XmlElement(name = "КИЗ")
    @ApiModelProperty(value = "Формат\n" +
            "Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный\n" +
            "Узел")
    private String kiz;

    @XmlElement(name = "НомУпак")
    @ApiModelProperty(value = "Формат\n" +
            "Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Условно-Обязательный\n" +
            "Узел")
    private String nomPack;

    public String getIdentTransPack() {
        return identTransPack;
    }

    public void setIdentTransPack(String identTransPack) {
        this.identTransPack = identTransPack;
    }

    public String getKiz() {
        return kiz;
    }

    public void setKiz(String kiz) {
        this.kiz = kiz;
    }

    public String getNomPack() {
        return nomPack;
    }

    public void setNomPack(String nomPack) {
        this.nomPack = nomPack;
    }
}
