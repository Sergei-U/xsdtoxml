package XmlStruct;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAttribute;
import java.time.LocalDate;

/**
 *
 */

public class IsprScF {

    private int nomIsprScf;

    private String defNomIsprScf;

    private LocalDate dateIsprScf;

    private String defDateIsprScf;

    @XmlAttribute(name = "НомИспрСчФ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "N(3) Целое (максимальное число знаков 3)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: 0")
    public int getNomIsprScf() {
        return nomIsprScf;
    }

    public void setNomIsprScf(int nomIsprScf) {
        this.nomIsprScf = nomIsprScf;
    }

    @XmlAttribute(name = "ДефНомИспрСчФ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: -")
    public String getDefNomIsprScf() {
        return defNomIsprScf;
    }

    public void setDefNomIsprScf(String defNomIsprScf) {
        this.defNomIsprScf = defNomIsprScf;
    }

    @XmlAttribute(name = "ДатаИспрСчФ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public LocalDate getDateIsprScf() {
        return dateIsprScf;
    }

    public void setDateIsprScf(LocalDate dateIsprScf) {
        this.dateIsprScf = dateIsprScf;
    }

    @XmlAttribute(name = "ДефДатаИспрСчФ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(=1) Строка (фиксированное число знаков 1)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: -")
    public String getDefDateIsprScf() {
        return defDateIsprScf;
    }

    public void setDefDateIsprScf(String defDateIsprScf) {
        this.defDateIsprScf = defDateIsprScf;
    }
}
