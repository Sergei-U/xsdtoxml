package entity;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 */

public class AddressInf {

    private String countryCode;

    private String addressText;

    @XmlAttribute(name = "КодСтр", required = true)
    /** "Формат\n" +
     "T(=3) Строка (фиксированное число знаков 3)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @XmlAttribute(name = "АдрТекст")
    /** "Формат\n" +
     "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText;
    }
}
