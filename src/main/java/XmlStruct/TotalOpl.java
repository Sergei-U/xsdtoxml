package XmlStruct;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 */

public class TotalOpl {

    private BigDecimal stProdNoNDSAll;

    private BigDecimal stProdUcNalAll;

    private String defStProdUcNalAll;

    private List<SummNalAll> summNalAllList;

    private BigDecimal summNetAll;

    @XmlElement(name = "СтТовБезНДСВсего")
    @ApiModelProperty(value = "Формат\n" +
            "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public BigDecimal getStProdNoNDSAll() {
        return stProdNoNDSAll;
    }

    public void setStProdNoNDSAll(BigDecimal stProdNoNDSAll) {
        this.stProdNoNDSAll = stProdNoNDSAll;
    }

    @XmlElement(name = "СтТовУчНалВсего", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "N(19.2) Вещественное (максимальное число знаков 19, в том числе десятичных 2)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: 0")
    public BigDecimal getStProdUcNalAll() {
        return stProdUcNalAll;
    }

    public void setStProdUcNalAll(BigDecimal stProdUcNalAll) {
        this.stProdUcNalAll = stProdUcNalAll;
    }

    @XmlElement(name = "ДефСтТовУчНалВсего", required = true, defaultValue = "-")
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: -")
    public String getDefStProdUcNalAll() {
        return defStProdUcNalAll;
    }

    public void setDefStProdUcNalAll(String defStProdUcNalAll) {
        this.defStProdUcNalAll = defStProdUcNalAll;
    }

    @XmlElement(name = "СумНалВсего")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<SummNalAll> getSummNalAllList() {
        return summNalAllList;
    }

    public void setSummNalAllList(List<SummNalAll> summNalAllList) {
        this.summNalAllList = summNalAllList;
    }

    @XmlElement(name = "КолНеттоВс")
    @ApiModelProperty(value = "Формат\n" +
            "Вещественное (максимальное число знаков 26, в том числе десятичных 11)\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public BigDecimal getSummNetAll() {
        return summNetAll;
    }

    public void setSummNetAll(BigDecimal summNetAll) {
        this.summNetAll = summNetAll;
    }
}
