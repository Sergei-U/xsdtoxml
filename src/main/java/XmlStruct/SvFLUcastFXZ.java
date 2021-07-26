package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class SvFLUcastFXZ {

    @XmlElement(name = "ГосРегИПВыдДов")
    @ApiModelProperty(value = "Формат\n" +
            "T(100) Строка (длина от 1 до 100 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String gosRegIPVidDov;

    @XmlElement(name = "ИННФЛ")
    @ApiModelProperty(value = "Формат\n" +
            "T(=12) Строка (фиксированное число знаков 12)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String innFL;

    @XmlElement(name = "ИныеСвед")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String overInf;

    @XmlElement(name = "ФИО",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<FIO> fioList;

    public String getGosRegIPVidDov() {
        return gosRegIPVidDov;
    }

    public void setGosRegIPVidDov(String gosRegIPVidDov) {
        this.gosRegIPVidDov = gosRegIPVidDov;
    }

    public String getInnFL() {
        return innFL;
    }

    public void setInnFL(String innFL) {
        this.innFL = innFL;
    }

    public String getOverInf() {
        return overInf;
    }

    public void setOverInf(String overInf) {
        this.overInf = overInf;
    }

    public List<FIO> getFioList() {
        return fioList;
    }

    public void setFioList(List<FIO> fioList) {
        this.fioList = fioList;
    }
}
