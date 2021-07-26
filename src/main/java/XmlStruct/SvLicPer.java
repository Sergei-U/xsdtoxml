package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class SvLicPer {


    @XmlElement(name = "РабОргПрод",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<RabOrgProd> rabOrgProdList;

    @XmlElement(name = "ИнЛицо")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<InLico> inLicoList;

    public List<RabOrgProd> getRabOrgProdList() {
        return rabOrgProdList;
    }

    public void setRabOrgProdList(List<RabOrgProd> rabOrgProdList) {
        this.rabOrgProdList = rabOrgProdList;
    }

    public List<InLico> getInLicoList() {
        return inLicoList;
    }

    public void setInLicoList(List<InLico> inLicoList) {
        this.inLicoList = inLicoList;
    }
}
