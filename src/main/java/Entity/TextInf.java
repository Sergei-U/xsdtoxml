package Entity;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class TextInf {

    private String idText;

    private String valueText;

    @XmlElement(name = "Идентиф", required = true)
    /** "Формат\n" +
     "T(50) Строка (длина от 1 до 50 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getIdText() {
        return idText;
    }

    public void setIdText(String idText) {
        this.idText = idText;
    }

    @XmlElement(name = "Значен", required = true)
    /** "Формат\n" +
     "T(2000) Строка (длина от 1 до 2000 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getValueText() {
        return valueText;
    }

    public void setValueText(String valueText) {
        this.valueText = valueText;
    }
}
