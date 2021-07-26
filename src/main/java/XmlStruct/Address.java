package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class Address {

    private List<AddressRF> addressRFList;

    private List<AddressInf> addressInfList;

    private String codeGAR;

    @XmlElement(name = "АдрРФ")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<AddressRF> getAddressRFList() {
        return addressRFList;
    }

    public void setAddressRFList(List<AddressRF> addressRFList) {
        this.addressRFList = addressRFList;
    }

    @XmlElement(name = "АдрИнф")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<AddressInf> getAddressInfList() {
        return addressInfList;
    }

    public void setAddressInfList(List<AddressInf> addressInfList) {
        this.addressInfList = addressInfList;
    }

    @XmlElement(name = "КодГАР", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка (длина от 1 до 36 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public String getCodeGAR() {
        return codeGAR;
    }

    public void setCodeGAR(String codeGAR) {
        this.codeGAR = codeGAR;
    }
}
