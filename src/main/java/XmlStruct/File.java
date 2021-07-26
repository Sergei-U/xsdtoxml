package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 */
@XmlRegistry
class ObjectFactory{
    public ObjectFactory(){}
    public File createFile(){
        return new File();
    }
}

@XmlRootElement(name = "Файл")
@XmlAccessorType(XmlAccessType.FIELD)
public class File implements Serializable {

    @XmlElement(name = "ИдФайл",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String idFile;

    @XmlElement(name = "ВерсФорм",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(5) Строка (длина от 1 до 5 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: 5.01")
    private String verForm;

    @XmlElement(name = "ВерсПрог",required = true)
    @ApiModelProperty(name = "Формат\n" +
            "T(40) Строка (длина от 1 до 40 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Принимает значение: СБиС3")
    private String verProgram;

    @XmlElement(name = "СвУчДокОбор")
    private List<SvUcDocObor> svUcDocOborList;

    @XmlElement(name = "Документ")
    private List<Document> documentList;


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

    public String getVerProgram() {
        return verProgram;
    }

    public void setVerProgram(String verProgram) {
        this.verProgram = verProgram;
    }

    public List<SvUcDocObor> getSvUcDocOborList() {
        return svUcDocOborList;
    }

    public void setSvUcDocOborList(List<SvUcDocObor> svUcDocOborList) {
        this.svUcDocOborList = svUcDocOborList;
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }
}
//@XmlType(name = "", propOrder = {"СвУчДокОбор", "Документ"})