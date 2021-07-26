package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class AddressRF {

    @XmlElement(name = "Индекс")
    @ApiModelProperty(value = "Формат\n" +
            "T(=6) Строка (фиксированное число знаков 6)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String index;

    @XmlElement(name = "КодРегион",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=2) Строка (фиксированное число знаков 2)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String codeRegion;

    @XmlElement(name = "Район")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String district;

    @XmlElement(name = "Город")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String city;

    @XmlElement(name = "НаселПункт")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String locality;

    @XmlElement(name = "Улица")
    @ApiModelProperty(value = "Формат\n" +
            "T(50) Строка (длина от 1 до 50 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String street;

    @XmlElement(name = "Дом")
    @ApiModelProperty(value = "Формат\n" +
            "T(20) Строка (длина от 1 до 20 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String house;

    @XmlElement(name = "Корпус")
    @ApiModelProperty(value = "Формат\n" +
            "T(20) Строка (длина от 1 до 20 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String housing;

    @XmlElement(name = "Кварт")
    @ApiModelProperty(value = "Формат\n" +
            "T(20) Строка (длина от 1 до 20 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String appartment;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }
}
