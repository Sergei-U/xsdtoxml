package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class IdSv {

    @XmlElement(name = "СвИП",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvIP> svIPList;

    @XmlElement(name = "СвЮЛУч", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvULUc> svULUcList;

    @XmlElement(name = "СвИнНеУч",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvInNeUc> svInNeUcList;

    @XmlElement(name = "СвФЛУчастФХЖ",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvFLUcastFXZ> svFLUcastFXZList;

    public List<SvIP> getSvIPList() {
        return svIPList;
    }

    public void setSvIPList(List<SvIP> svIPList) {
        this.svIPList = svIPList;
    }

    public List<SvULUc> getSvULUcList() {
        return svULUcList;
    }

    public void setSvULUcList(List<SvULUc> svULUcList) {
        this.svULUcList = svULUcList;
    }

    public List<SvInNeUc> getSvInNeUcList() {
        return svInNeUcList;
    }

    public void setSvInNeUcList(List<SvInNeUc> svInNeUcList) {
        this.svInNeUcList = svInNeUcList;
    }

    public List<SvFLUcastFXZ> getSvFLUcastFXZList() {
        return svFLUcastFXZList;
    }

    public void setSvFLUcastFXZList(List<SvFLUcastFXZ> svFLUcastFXZList) {
        this.svFLUcastFXZList = svFLUcastFXZList;
    }
}
