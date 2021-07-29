package Entity;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */

public class TotalOpl {

    private String defStProdUcNalAll;

    private BigDecimal stProdNoNDSAll;

    private BigDecimal stProdUcNalAll;

    private BigDecimal summNetAll;

    private SummNalAll summNalAllList;

    @XmlElement(name = "СтТовБезНДСВсего")
    /** "Формат\n" +
     "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public BigDecimal getStProdNoNDSAll() {
        return stProdNoNDSAll;
    }

    public void setStProdNoNDSAll(BigDecimal stProdNoNDSAll) {
        this.stProdNoNDSAll = stProdNoNDSAll;
    }

    @XmlElement(name = "СтТовУчНалВсего", required = true)
    /** "Формат\n" +
     "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Принимает значение: 0")*/
    public BigDecimal getStProdUcNalAll() {
        return stProdUcNalAll;
    }

    public void setStProdUcNalAll(BigDecimal stProdUcNalAll) {
        this.stProdUcNalAll = stProdUcNalAll;
    }

    @XmlElement(name = "ДефСтТовУчНалВсего", required = true, defaultValue = "-")
    /** "Формат\n" +
     "T(=1) Строка (фиксированное число знаков 1)\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Принимает значение: -")*/
    public String getDefStProdUcNalAll() {
        return defStProdUcNalAll;
    }

    public void setDefStProdUcNalAll(String defStProdUcNalAll) {
        this.defStProdUcNalAll = defStProdUcNalAll;
    }

    @XmlElement(name = "СумНалВсего")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public SummNalAll getSummNalAllList() {
        return summNalAllList;
    }

    public void setSummNalAllList(SummNalAll summNalAllList) {
        this.summNalAllList = summNalAllList;
    }

    @XmlElement(name = "КолНеттоВс")
    /** "Формат\n" +
     "Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public BigDecimal getSummNetAll() {
        return summNetAll;
    }

    public void setSummNetAll(BigDecimal summNetAll) {
        this.summNetAll = summNetAll;
    }
}
