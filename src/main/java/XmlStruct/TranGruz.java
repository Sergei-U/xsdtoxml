package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class TranGruz {

    private String svTranGruz;

    private List<TranNakl> tranNaklList;

    private List<Perevozchik> perevozchikList;

    @XmlElement(name = "СвТранГруз")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getSvTranGruz() {
        return svTranGruz;
    }

    public void setSvTranGruz(String svTranGruz) {
        this.svTranGruz = svTranGruz;
    }

    @XmlElement(name = "ТранНакл")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<TranNakl> getTranNaklList() {
        return tranNaklList;
    }

    public void setTranNaklList(List<TranNakl> tranNaklList) {
        this.tranNaklList = tranNaklList;
    }

    @XmlElement(name = "Перевозчик")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<Perevozchik> getPerevozchikList() {
        return perevozchikList;
    }

    public void setPerevozchikList(List<Perevozchik> perevozchikList) {
        this.perevozchikList = perevozchikList;
    }
}
