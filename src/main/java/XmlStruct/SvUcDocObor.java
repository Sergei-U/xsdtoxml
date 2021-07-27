package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

@AllArgsConstructor
public class SvUcDocObor {

    private String idDispatch;

    private String idReception;

    private SvOEDDispatch svOEDDispatchList;

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
    public SvOEDDispatch getSvOEDDispatchList() {
        return svOEDDispatchList;
    }

    public void setSvOEDDispatchList(SvOEDDispatch svOEDDispatchList) {
        this.svOEDDispatchList = svOEDDispatchList;
    }
}
