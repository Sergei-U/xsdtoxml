package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class IdSv {

    private List<SvIP> svIPList;

    private List<SvULUc> svULUcList;

    private List<SvInNeUc> svInNeUcList;

    private List<SvFLUcastFXZ> svFLUcastFXZList;

    @XmlElement(name = "СвИП",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<SvIP> getSvIPList() {
        return svIPList;
    }

    public void setSvIPList(List<SvIP> svIPList) {
        this.svIPList = svIPList;
    }

    @XmlElement(name = "СвЮЛУч", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<SvULUc> getSvULUcList() {
        return svULUcList;
    }

    public void setSvULUcList(List<SvULUc> svULUcList) {
        this.svULUcList = svULUcList;
    }

    @XmlElement(name = "СвИнНеУч",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<SvInNeUc> getSvInNeUcList() {
        return svInNeUcList;
    }

    public void setSvInNeUcList(List<SvInNeUc> svInNeUcList) {
        this.svInNeUcList = svInNeUcList;
    }

    @XmlElement(name = "СвФЛУчастФХЖ",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<SvFLUcastFXZ> getSvFLUcastFXZList() {
        return svFLUcastFXZList;
    }

    public void setSvFLUcastFXZList(List<SvFLUcastFXZ> svFLUcastFXZList) {
        this.svFLUcastFXZList = svFLUcastFXZList;
    }
}
