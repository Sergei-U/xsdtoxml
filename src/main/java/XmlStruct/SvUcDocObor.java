package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

@AllArgsConstructor
public class SvUcDocObor {


    private String idDispatch;


    private String idReception;


    private List<SvOEDDispatch> svOEDDispatchList;

    @XmlElement(name = "ИдОтпр")
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
    @XmlElement(name = "ИдПол")
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
    public List<SvOEDDispatch> getSvOEDDispatchList() {
        return svOEDDispatchList;
    }

    public void setSvOEDDispatchList(List<SvOEDDispatch> svOEDDispatchList) {
        this.svOEDDispatchList = svOEDDispatchList;
    }
}
