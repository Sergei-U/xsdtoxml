package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class FIO {

    private String firstName;

    private String lastName;

    private String thirdName;

    @XmlElement(name = "Имя",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(60) Строка (длина от 1 до 60 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement(name = "Фамилия",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(60) Строка (длина от 1 до 60 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement(name = "Отчество")
    @ApiModelProperty(value = "Формат\n" +
            "T(60) Строка (длина от 1 до 60 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public FIO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public FIO(String firstName, String lastName, String thirdName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.thirdName = thirdName;
    }
}
