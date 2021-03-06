package entity;

import javax.xml.bind.annotation.XmlAttribute;
import java.math.BigDecimal;

/**
 *
 */

public class Excise {

    private BigDecimal summExcise;

    private String nonExcise;


    @XmlAttribute(name = "СумАкциз")
    /** "Формат\n" +
     "Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел")
     */
    public BigDecimal getSummExcise() {
        return summExcise;
    }

    public void setSummExcise(BigDecimal summExcise) {
        this.summExcise = summExcise;
    }

    @XmlAttribute(name = "БезАкциз")
    /** "Формат\n" +
     "Строка (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел\n" +
     "Принимает значение: без акциза") */
    public String getNonExcise() {
        return nonExcise;
    }

    public void setNonExcise(String nonExcise) {
        this.nonExcise = nonExcise;
    }
}
