package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class SvProd {
    
    private String okpo;

    private String structuralSubdivision;

    private String infForParticipant;

    private String shortName;

    private List<IdSv> idSvList;

    private List<Address> adressList;

    private List<Contact> contactList;

    private List<BankReq> bankReqList;

    @XmlElement(name = "ОКПО")
    @ApiModelProperty(value = "Формат\n" +
            "T(10) Строка (длина от 1 до 10 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getOkpo() {
        return okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    @XmlElement(name = "СтруктПодр")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getStructuralSubdivision() {
        return structuralSubdivision;
    }

    public void setStructuralSubdivision(String structuralSubdivision) {
        this.structuralSubdivision = structuralSubdivision;
    }

    @XmlElement(name = "ИнфДляУчаст")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getInfForParticipant() {
        return infForParticipant;
    }

    public void setInfForParticipant(String infForParticipant) {
        this.infForParticipant = infForParticipant;
    }

    @XmlElement(name = "КраткНазв")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @XmlElement(name = "ИдСв",required = true)
    @ApiModelProperty(value = "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<IdSv> getIdSvList() {
        return idSvList;
    }

    public void setIdSvList(List<IdSv> idSvList) {
        this.idSvList = idSvList;
    }

    @XmlElement(name = "Адрес")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<Address> getAdressList() {
        return adressList;
    }

    public void setAdressList(List<Address> adressList) {
        this.adressList = adressList;
    }

    @XmlElement(name = "Контакт")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @XmlElement(name = "БанкРекв")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<BankReq> getBankReqList() {
        return bankReqList;
    }

    public void setBankReqList(List<BankReq> bankReqList) {
        this.bankReqList = bankReqList;
    }
}
