import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import javax.xml.bind.annotation.*;
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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"СвУчДокОбор", "Документ"})
@XmlRootElement(name = "Файл")
public class File {

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
}
