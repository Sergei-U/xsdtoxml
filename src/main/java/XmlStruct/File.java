package XmlStruct;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 */
@XmlRegistry
class ObjectFactory {
    public ObjectFactory() {
    }

    public File createFile() {
        return new File();
    }
}

@XmlRootElement(name = "Файл")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "")
public class File implements Serializable {

    private String idFile;

    private String verForm;

    private String verProgram;

    private List<SvUcDocObor> svUcDocOborList;

    private List<Document> documentList;


    @XmlElement(name = "ИдФайл", required = true)
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

    public String getVerForm() {
        return verForm;
    }

    public void setVerForm(String verForm) {
        this.verForm = verForm;
    }

    @XmlElement(name = "ВерсПрог", required = true)
    @ApiModelProperty(name = "Формат\n" +
            "T(40) Строка (длина от 1 до 40 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: СБиС3")
    public String getVerProgram() {
        return verProgram;
    }

    public void setVerProgram(String verProgram) {
        this.verProgram = verProgram;
    }

    @XmlElement(name = "СвУчДокОбор")
    public List<SvUcDocObor> getSvUcDocOborList() {
        return svUcDocOborList;
    }

    public void setSvUcDocOborList(List<SvUcDocObor> svUcDocOborList) {
        this.svUcDocOborList = svUcDocOborList;
    }

    @XmlElement(name = "Документ")
    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }
}
//@XmlType(name = "", propOrder = {"СвУчДокОбор", "Документ"})