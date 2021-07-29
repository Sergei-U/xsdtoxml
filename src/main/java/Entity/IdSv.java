package Entity;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class IdSv {

    private SvIP svIPList;

    private SvULUc svULUcList;

    private SvInNeUc svInNeUcList;

    private SvFLUcastFXZ svFLUcastFXZList;

    @XmlElement(name = "СвИП", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел")
     */
    public SvIP getSvIPList() {
        return svIPList;
    }

    public void setSvIPList(SvIP svIPList) {
        this.svIPList = svIPList;
    }

    @XmlElement(name = "СвЮЛУч", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел")
     */
    public SvULUc getSvULUcList() {
        return svULUcList;
    }

    public void setSvULUcList(SvULUc svULUcList) {
        this.svULUcList = svULUcList;
    }

    @XmlElement(name = "СвИнНеУч", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public SvInNeUc getSvInNeUcList() {
        return svInNeUcList;
    }

    public void setSvInNeUcList(SvInNeUc svInNeUcList) {
        this.svInNeUcList = svInNeUcList;
    }

    @XmlElement(name = "СвФЛУчастФХЖ", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public SvFLUcastFXZ getSvFLUcastFXZList() {
        return svFLUcastFXZList;
    }

    public void setSvFLUcastFXZList(SvFLUcastFXZ svFLUcastFXZList) {
        this.svFLUcastFXZList = svFLUcastFXZList;
    }
}
