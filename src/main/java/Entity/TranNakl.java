package Entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


public class TranNakl {

    private String nomTranNakl;

    private LocalDate dateTranNakl;

    @XmlElement(name = "НомТранНакл", required = true)
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getNomTranNakl() {
        return nomTranNakl;
    }

    public void setNomTranNakl(String nomTranNakl) {
        this.nomTranNakl = nomTranNakl;
    }

    @XmlElement(name = "ДатаТранНакл", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    /** "Формат\n" +
     "D(10) Дата (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public LocalDate getDateTranNakl() {
        return dateTranNakl;
    }

    public void setDateTranNakl(LocalDate dateTranNakl) {
        this.dateTranNakl = dateTranNakl;
    }
}
