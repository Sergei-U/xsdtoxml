package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.Date;
import java.util.List;

/**
 *
 */

public class InfProdGosZakKazn {

    private Date dateContract;

    private String numberGosContract;

    private String personalAccSeller;

    private String codeProdBudzClass;

    private String codeTargetProd;

    private String codeKaznacProd;

    private String nameKaznacProd;

    private List<SvFactor> svFactorList;

    private List<OsnUstDenTreb> osnUstDenTrebList;

    @XmlElement(name = "ДатаГосКонт",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public Date getDateContract() {
        return dateContract;
    }

    public void setDateContract(Date dateContract) {
        this.dateContract = dateContract;
    }

    @XmlElement(name = "НомерГосКонт",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(100) Строка (длина от 1 до 100 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getNumberGosContract() {
        return numberGosContract;
    }

    public void setNumberGosContract(String numberGosContract) {
        this.numberGosContract = numberGosContract;
    }

    @XmlElement(name = "ЛицСчетПрод")
    @ApiModelProperty(value = "Формат\n" +
            "T(=11) Строка (фиксированное число знаков 11)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getPersonalAccSeller() {
        return personalAccSeller;
    }

    public void setPersonalAccSeller(String personalAccSeller) {
        this.personalAccSeller = personalAccSeller;
    }

    @XmlElement(name = "КодПродБюджКласс")
    @ApiModelProperty(value = "Формат\n" +
            "T(=20) Строка (фиксированное число знаков 20)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getCodeProdBudzClass() {
        return codeProdBudzClass;
    }

    public void setCodeProdBudzClass(String codeProdBudzClass) {
        this.codeProdBudzClass = codeProdBudzClass;
    }

    @XmlElement(name = "КодЦелиПрод")
    @ApiModelProperty(value = "Формат\n" +
            "T(=20) Строка (фиксированное число знаков 20)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getCodeTargetProd() {
        return codeTargetProd;
    }

    public void setCodeTargetProd(String codeTargetProd) {
        this.codeTargetProd = codeTargetProd;
    }

    @XmlElement(name = "КодКазначПрод")
    @ApiModelProperty(value = "Формат\n" +
            "T(4) Строка (длина от 1 до 4 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getCodeKaznacProd() {
        return codeKaznacProd;
    }

    public void setCodeKaznacProd(String codeKaznacProd) {
        this.codeKaznacProd = codeKaznacProd;
    }

    @XmlElement(name = "НаимКазначПрод")
    @ApiModelProperty(value = "Формат\n" +
            "T(2000) Строка (длина от 1 до 2000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getNameKaznacProd() {
        return nameKaznacProd;
    }

    public void setNameKaznacProd(String nameKaznacProd) {
        this.nameKaznacProd = nameKaznacProd;
    }

    @XmlElement(name = "СвФактор")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<SvFactor> getSvFactorList() {
        return svFactorList;
    }

    public void setSvFactorList(List<SvFactor> svFactorList) {
        this.svFactorList = svFactorList;
    }

    @XmlElement(name = "ОснУстДенТреб")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<OsnUstDenTreb> getOsnUstDenTrebList() {
        return osnUstDenTrebList;
    }

    public void setOsnUstDenTrebList(List<OsnUstDenTreb> osnUstDenTrebList) {
        this.osnUstDenTrebList = osnUstDenTrebList;
    }
}
