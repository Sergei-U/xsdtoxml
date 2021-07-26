package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.Date;


public class TranNakl {

    private String nomTranNakl;

    private Date dateTranNakl;

    @XmlElement(name = "НомТранНакл",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getNomTranNakl() {
        return nomTranNakl;
    }

    public void setNomTranNakl(String nomTranNakl) {
        this.nomTranNakl = nomTranNakl;
    }

    @XmlElement(name = "ДатаТранНакл",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public Date getDateTranNakl() {
        return dateTranNakl;
    }

    public void setDateTranNakl(Date dateTranNakl) {
        this.dateTranNakl = dateTranNakl;
    }
}
