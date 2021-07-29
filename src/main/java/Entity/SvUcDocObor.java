package Entity;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 */


public class SvUcDocObor {

    private String idDispatch;

    private String idReception;

    private SvOEDDispatch svOEDDispatch;

    @XmlAttribute(name = "ИдОтпр", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(46) Строка (длина от 4 до 46 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getIdDispatch() {
        return idDispatch;
    }

    public void setIdDispatch(String idDispatch) {
        this.idDispatch = idDispatch;
    }

    @XmlAttribute(name = "ИдПол", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(46) Строка (длина от 4 до 46 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getIdReception() {
        return idReception;
    }

    public void setIdReception(String idReception) {
        this.idReception = idReception;
    }

    @XmlElement(name = "СвОЭДОтпр")
    public SvOEDDispatch getsvOEDDispatch() {
        return svOEDDispatch;
    }

    public void setsvOEDDispatch(SvOEDDispatch svOEDDispatch) {
        this.svOEDDispatch = svOEDDispatch;
    }
}
