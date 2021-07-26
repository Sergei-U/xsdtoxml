package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */

public class SvProd {


    @XmlElement(name = "ОКПО")
    @ApiModelProperty(value = "Формат\n" +
            "T(10) Строка (длина от 1 до 10 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String okpo;

    @XmlElement(name = "СтруктПодр")
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String structuralSubdivision;

    @XmlElement(name = "ИнфДляУчаст")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String infForParticipant;

    @XmlElement(name = "КраткНазв")
    @ApiModelProperty(value = "Формат\n" +
            "T(255) Строка (длина от 1 до 255 знаков)\n" +
            "Тип элемента\n" +
            "Необязательный")
    private String shortName;

    @XmlElement(name = "ИдСв",required = true)
    @ApiModelProperty(value = "Строка\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<IdSv> idSvList;

    @XmlElement(name = "Адрес")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<Address> adressList;

    @XmlElement(name = "Контакт")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<Contact> contactList;

    @XmlElement(name = "БанкРекв")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<BankReq> bankReqList;

    public String getOkpo() {
        return okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    public String getStructuralSubdivision() {
        return structuralSubdivision;
    }

    public void setStructuralSubdivision(String structuralSubdivision) {
        this.structuralSubdivision = structuralSubdivision;
    }

    public String getInfForParticipant() {
        return infForParticipant;
    }

    public void setInfForParticipant(String infForParticipant) {
        this.infForParticipant = infForParticipant;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<IdSv> getIdSvList() {
        return idSvList;
    }

    public void setIdSvList(List<IdSv> idSvList) {
        this.idSvList = idSvList;
    }

    public List<Address> getAdressList() {
        return adressList;
    }

    public void setAdressList(List<Address> adressList) {
        this.adressList = adressList;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<BankReq> getBankReqList() {
        return bankReqList;
    }

    public void setBankReqList(List<BankReq> bankReqList) {
        this.bankReqList = bankReqList;
    }
}
