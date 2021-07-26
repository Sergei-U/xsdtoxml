package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;
import java.util.List;

/**
 *
 */

public class InfProdGosZakKazn {

    @XmlElement(name = "ДатаГосКонт",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private Date dateContract;

    @XmlElement(name = "НомерГосКонт",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(100) Строка (длина от 1 до 100 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String numberGosContract;

    @XmlElement(name = "ЛицСчетПрод")
    @ApiModelProperty(value = "Формат\n" +
            "T(=11) Строка (фиксированное число знаков 11)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String personalAccSeller;

    @XmlElement(name = "КодПродБюджКласс")
    @ApiModelProperty(value = "Формат\n" +
            "T(=20) Строка (фиксированное число знаков 20)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String codeProdBudzClass;

    @XmlElement(name = "КодЦелиПрод")
    @ApiModelProperty(value = "Формат\n" +
            "T(=20) Строка (фиксированное число знаков 20)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String codeTargetProd;

    @XmlElement(name = "КодКазначПрод")
    @ApiModelProperty(value = "Формат\n" +
            "T(4) Строка (длина от 1 до 4 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String codeKaznacProd;

    @XmlElement(name = "НаимКазначПрод")
    @ApiModelProperty(value = "Формат\n" +
            "T(2000) Строка (длина от 1 до 2000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String nameKaznacProd;

    @XmlElement(name = "СвФактор")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<SvFactor> svFactorList;

    @XmlElement(name = "ОснУстДенТреб")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<OsnUstDenTreb> osnUstDenTrebList;

    public Date getDateContract() {
        return dateContract;
    }

    public void setDateContract(Date dateContract) {
        this.dateContract = dateContract;
    }

    public String getNumberGosContract() {
        return numberGosContract;
    }

    public void setNumberGosContract(String numberGosContract) {
        this.numberGosContract = numberGosContract;
    }

    public String getPersonalAccSeller() {
        return personalAccSeller;
    }

    public void setPersonalAccSeller(String personalAccSeller) {
        this.personalAccSeller = personalAccSeller;
    }

    public String getCodeProdBudzClass() {
        return codeProdBudzClass;
    }

    public void setCodeProdBudzClass(String codeProdBudzClass) {
        this.codeProdBudzClass = codeProdBudzClass;
    }

    public String getCodeTargetProd() {
        return codeTargetProd;
    }

    public void setCodeTargetProd(String codeTargetProd) {
        this.codeTargetProd = codeTargetProd;
    }

    public String getCodeKaznacProd() {
        return codeKaznacProd;
    }

    public void setCodeKaznacProd(String codeKaznacProd) {
        this.codeKaznacProd = codeKaznacProd;
    }

    public String getNameKaznacProd() {
        return nameKaznacProd;
    }

    public void setNameKaznacProd(String nameKaznacProd) {
        this.nameKaznacProd = nameKaznacProd;
    }

    public List<SvFactor> getSvFactorList() {
        return svFactorList;
    }

    public void setSvFactorList(List<SvFactor> svFactorList) {
        this.svFactorList = svFactorList;
    }

    public List<OsnUstDenTreb> getOsnUstDenTrebList() {
        return osnUstDenTrebList;
    }

    public void setOsnUstDenTrebList(List<OsnUstDenTreb> osnUstDenTrebList) {
        this.osnUstDenTrebList = osnUstDenTrebList;
    }
}
