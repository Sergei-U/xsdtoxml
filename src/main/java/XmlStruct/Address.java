package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class Address {

    @XmlElement(name = "АдрРФ")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<AddressRF> addressRFList;

    @XmlElement(name = "АдрИнф")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<AddressInf> addressInfList;

    @XmlElement(name = "КодГАР",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка (длина от 1 до 36 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private String codeGAR;

    public List<AddressRF> getAddressRFList() {
        return addressRFList;
    }

    public void setAddressRFList(List<AddressRF> addressRFList) {
        this.addressRFList = addressRFList;
    }

    public List<AddressInf> getAddressInfList() {
        return addressInfList;
    }

    public void setAddressInfList(List<AddressInf> addressInfList) {
        this.addressInfList = addressInfList;
    }

    public String getCodeGAR() {
        return codeGAR;
    }

    public void setCodeGAR(String codeGAR) {
        this.codeGAR = codeGAR;
    }
}
