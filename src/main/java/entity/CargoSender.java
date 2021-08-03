package entity;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class CargoSender {

    private String onZ;

    private CargoSend cargoSendList;

    @XmlElement(name = "ОнЖе")
    /** "Формат\n" +
     "Строка (фиксированное число знаков 5)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public String getOnZ() {
        return onZ;
    }

    public void setOnZ(String onZ) {
        this.onZ = onZ;
    }

    @XmlElement(name = "ГрузОтпр", required = true)
    /** "\n" +
     "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public CargoSend getCargoSendList() {
        return cargoSendList;
    }

    public void setCargoSendList(CargoSend cargoSendList) {
        this.cargoSendList = cargoSendList;
    }
}
