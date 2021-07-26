package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class CargoSender {

    private String onZ;

    private List<CargoSend> cargoSendList;

    @XmlElement(name = "ОнЖе")
    @ApiModelProperty(value = "Формат\n" +
            "Строка (фиксированное число знаков 5)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public String getOnZ() {
        return onZ;
    }

    public void setOnZ(String onZ) {
        this.onZ = onZ;
    }

    @XmlElement(name = "ГрузОтпр",required = true)
    @ApiModelProperty(value = "\n" +
            "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<CargoSend> getCargoSendList() {
        return cargoSendList;
    }

    public void setCargoSendList(List<CargoSend> cargoSendList) {
        this.cargoSendList = cargoSendList;
    }
}
