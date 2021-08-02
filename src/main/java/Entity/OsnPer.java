package Entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


public class OsnPer {

    private String nameOsn;

    private String nomOns;

    private LocalDate dateOsn;

    private String dopSvOsn;

    private String identOsn;

    @XmlAttribute(name = "НаимОсн", required = true)
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Принимает значение: Без документа-основания")*/
    public String getNameOsn() {
        return nameOsn;
    }

    public void setNameOsn(String nameOsn) {
        this.nameOsn = nameOsn;
    }

    @XmlAttribute(name = "НомОсн")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getNomOns() {
        return nomOns;
    }

    public void setNomOns(String nomOns) {
        this.nomOns = nomOns;
    }

    @XmlAttribute(name = "ДатаОсн")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    /** "Формат\n" +
     "D(10) Дата (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Условно-Обязательный") */
    public LocalDate getDateOsn() {
        return dateOsn;
    }

    public void setDateOsn(LocalDate dateOsn) {
        this.dateOsn = dateOsn;
    }

    @XmlAttribute(name = "ДопСвОсн")
    /** "Формат\n" +
     "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getDopSvOsn() {
        return dopSvOsn;
    }

    public void setDopSvOsn(String dopSvOsn) {
        this.dopSvOsn = dopSvOsn;
    }

    @XmlAttribute(name = "ИдентОсн")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getIdentOsn() {
        return identOsn;
    }

    public void setIdentOsn(String identOsn) {
        this.identOsn = identOsn;
    }
}
