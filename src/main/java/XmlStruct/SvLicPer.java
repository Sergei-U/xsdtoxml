package XmlStruct;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class SvLicPer {

    private List<RabOrgProd> rabOrgProdList;

    private List<InLico> inLicoList;

    @XmlElement(name = "РабОргПрод", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<RabOrgProd> getRabOrgProdList() {
        return rabOrgProdList;
    }

    public void setRabOrgProdList(List<RabOrgProd> rabOrgProdList) {
        this.rabOrgProdList = rabOrgProdList;
    }

    @XmlElement(name = "ИнЛицо")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<InLico> getInLicoList() {
        return inLicoList;
    }

    public void setInLicoList(List<InLico> inLicoList) {
        this.inLicoList = inLicoList;
    }
}
