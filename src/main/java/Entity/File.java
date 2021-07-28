package Entity;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 */


@XmlRootElement(name = "Файл")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "File")
public class File implements Serializable {

    UUID uuid = UUID.randomUUID();

    private String idFile;

    private String verForm;

    private String verProgram;

    private SvUcDocObor svUcDocObor;

    private Document document;

    @XmlAttribute(name = "ВерсПрог", required = true)
    @ApiModelProperty(name = "Формат\n" +
            "T(40) Строка (длина от 1 до 40 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: СБиС3")
    public String getVerProgram() {
        return verProgram;
    }

    @XmlAttribute(name = "ВерсФорм", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(5) Строка (длина от 1 до 5 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: 5.01")
    public String getVerForm() {
        return verForm;
    }

    @XmlAttribute(name = "ИдФайл", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getIdFile() {
        return idFile;
    }

    public void setIdFile(String idFile) {
        this.idFile = idFile;
    }

    public void setVerForm(String verForm) {
        this.verForm = verForm;
    }


    public void setVerProgram(String verProgram) {
        this.verProgram = verProgram;
    }

    @XmlElement(name = "СвУчДокОбор")
    public SvUcDocObor getSvUcDocObor() {
        return svUcDocObor;
    }

    public void setSvUcDocObor(SvUcDocObor svUcDocObor) {
        this.svUcDocObor = svUcDocObor;
    }

    @XmlElement(name = "Документ")
    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
//@XmlType(name = "", propOrder = {"СвУчДокОбор", "Документ"})

//@XmlRegistry
//class ObjectFactory {
//    public ObjectFactory() {
//    }
//
//    public File createFile() {
//        return new File();
//    }
//}