package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;


public class SvPerVech {

    private Date datePerVech;

    private String svPerVech;

    @XmlElement(name = "ДатаПерВещ")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public Date getDatePerVech() {
        return datePerVech;
    }

    public void setDatePerVech(Date datePerVech) {
        this.datePerVech = datePerVech;
    }

    @XmlElement(name = "СвПерВещ")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getSvPerVech() {
        return svPerVech;
    }

    public void setSvPerVech(String svPerVech) {
        this.svPerVech = svPerVech;
    }
}
