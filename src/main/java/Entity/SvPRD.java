package Entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 */

public class SvPRD {

    private String numberPRD;

    private LocalDate datePRD;

    private BigDecimal summPRD;

    @XmlElement(name = "НомерПРД", required = true)
    /** "Формат\n" +
     "T(30) Строка (длина от 1 до 30 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getNumberPRD() {
        return numberPRD;
    }

    public void setNumberPRD(String numberPRD) {
        this.numberPRD = numberPRD;
    }

    @XmlElement(name = "ДатаПРД", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    /** "Формат\n" +
     "D(10) Дата (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public LocalDate getDatePRD() {
        return datePRD;
    }

    public void setDatePRD(LocalDate datePRD) {
        this.datePRD = datePRD;
    }

    @XmlElement(name = "СуммаПРД")
    /** "Формат\n" +
     "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public BigDecimal getSummPRD() {
        return summPRD;
    }

    public void setSummPRD(BigDecimal summPRD) {
        this.summPRD = summPRD;
    }
}
