package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;


public class SvPerVech {

    @XmlElement(name = "ДатаПерВещ")
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private Date datePerVech;

    @XmlElement(name = "СвПерВещ")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String svPerVech;

    public Date getDatePerVech() {
        return datePerVech;
    }

    public void setDatePerVech(Date datePerVech) {
        this.datePerVech = datePerVech;
    }

    public String getSvPerVech() {
        return svPerVech;
    }

    public void setSvPerVech(String svPerVech) {
        this.svPerVech = svPerVech;
    }
}
