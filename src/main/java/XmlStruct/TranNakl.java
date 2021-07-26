package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;


public class TranNakl {

    @XmlElement(name = "НомТранНакл",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String nomTranNakl;

    @XmlElement(name = "ДатаТранНакл",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private Date dateTranNakl;

    public String getNomTranNakl() {
        return nomTranNakl;
    }

    public void setNomTranNakl(String nomTranNakl) {
        this.nomTranNakl = nomTranNakl;
    }

    public Date getDateTranNakl() {
        return dateTranNakl;
    }

    public void setDateTranNakl(Date dateTranNakl) {
        this.dateTranNakl = dateTranNakl;
    }
}
