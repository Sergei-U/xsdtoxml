package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class FIO {

    public FIO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public FIO(String firstName, String lastName, String thirdName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.thirdName = thirdName;
    }

    @XmlElement(name = "Имя",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(60) Строка (длина от 1 до 60 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String firstName;

    @XmlElement(name = "Фамилия",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(60) Строка (длина от 1 до 60 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String lastName;

    @XmlElement(name = "Отчество")
    @ApiModelProperty(value = "Формат\n" +
            "T(60) Строка (длина от 1 до 60 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String thirdName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }
}
