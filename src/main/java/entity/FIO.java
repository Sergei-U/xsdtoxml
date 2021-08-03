package entity;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 */

public class FIO {

    private String firstName;

    private String lastName;

    private String thirdName;

    @XmlAttribute(name = "Имя", required = true)
    /** "Формат\n" +
     "T(60) Строка (длина от 1 до 60 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlAttribute(name = "Фамилия", required = true)
    /** "Формат\n" +
     "T(60) Строка (длина от 1 до 60 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlAttribute(name = "Отчество")
    /** "Формат\n" +
     "T(60) Строка (длина от 1 до 60 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }


}
