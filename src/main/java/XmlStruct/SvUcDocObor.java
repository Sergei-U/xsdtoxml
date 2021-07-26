package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

@AllArgsConstructor
public class SvUcDocObor {

    @XmlElement(name = "ИдОтпр")
    @ApiModelProperty(value = "Формат\n" +
            "T(46) Строка (длина от 4 до 46 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String idDispatch;

    @XmlElement(name = "ИдПол")
    @ApiModelProperty(value = "Формат\n" +
            "T(46) Строка (длина от 4 до 46 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String idReception;

    @XmlElement(name = "СвОЭДОтпр")
    private List<SvOEDDispatch> svOEDDispatchList;

    public String getIdDispatch() {
        return idDispatch;
    }

    public void setIdDispatch(String idDispatch) {
        this.idDispatch = idDispatch;
    }

    public String getIdReception() {
        return idReception;
    }

    public void setIdReception(String idReception) {
        this.idReception = idReception;
    }

    public List<SvOEDDispatch> getSvOEDDispatchList() {
        return svOEDDispatchList;
    }

    public void setSvOEDDispatchList(List<SvOEDDispatch> svOEDDispatchList) {
        this.svOEDDispatchList = svOEDDispatchList;
    }
}
