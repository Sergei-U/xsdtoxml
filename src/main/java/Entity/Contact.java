package Entity;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 */

public class Contact {

    private String tel;

    private String email;

    @XmlAttribute(name = "Тлф")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @XmlAttribute(name = "ЭлПочта")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
