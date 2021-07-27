package XmlStruct;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class Address {

    private AddressRF addressRFList;

    private AddressInf addressInfList;

    private String codeGAR;

    @XmlElement(name = "АдрРФ")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public AddressRF getAddressRFList() {
        return addressRFList;
    }

    public void setAddressRFList(AddressRF addressRFList) {
        this.addressRFList = addressRFList;
    }

    @XmlElement(name = "АдрИнф")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public AddressInf getAddressInfList() {
        return addressInfList;
    }

    public void setAddressInfList(AddressInf addressInfList) {
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
