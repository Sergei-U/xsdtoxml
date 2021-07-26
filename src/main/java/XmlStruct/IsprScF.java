package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 *
 */

public class IsprScF {

    private int nomIsprScf;

    private String defNomIsprScf;

    private Date dateIsprScf;

    private String defDateIsprScf;

    @XmlElement(name = "НомИспрСчФ",required = true)
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

    @XmlElement(name = "ДефНомИспрСчФ",required = true)
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

    @XmlElement(name = "ДатаИспрСчФ",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public Date getDateIsprScf() {
        return dateIsprScf;
    }

    public void setDateIsprScf(Date dateIsprScf) {
        this.dateIsprScf = dateIsprScf;
    }

    @XmlElement(name = "ДефДатаИспрСчФ", required = true)
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
