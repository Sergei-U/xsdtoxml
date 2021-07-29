package Entity;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 */

public class AddressRF {

    private String index;

    private String codeRegion;

    private String district;

    private String city;

    private String locality;

    private String street;

    private String house;

    private String housing;

    private String appartment;

    @XmlAttribute(name = "Индекс")
    @ApiModelProperty(value = "Формат\n" +
            "T(=6) Строка (фиксированное число знаков 6)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @XmlAttribute(name = "КодРегион", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=2) Строка (фиксированное число знаков 2)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    @XmlAttribute(name = "Район")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @XmlAttribute(name = "Город")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlAttribute(name = "НаселПункт")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @XmlAttribute(name = "Улица")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @XmlAttribute(name = "Дом")
    @ApiModelProperty(value = "Формат\n" +
            "T(20) Строка (длина от 1 до 20 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @XmlAttribute(name = "Корпус")
    @ApiModelProperty(value = "Формат\n" +
            "T(20) Строка (длина от 1 до 20 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    @XmlAttribute(name = "Кварт")
    @ApiModelProperty(value = "Формат\n" +
            "T(20) Строка (длина от 1 до 20 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }
}