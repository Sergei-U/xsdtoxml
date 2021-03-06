package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 */

@XmlType(propOrder = {"idSvList",
        "adressList",
        "contactList",
        "bankReqList"})
public class SvProd {

    private String okpo;

    private String structuralSubdivision;

    private String infForParticipant;

    private String shortName;

    private IdSv idSvList;

    private Address adressList;

    private Contact contactList;

    private BankReq bankReqList;

    @XmlAttribute(name = "ОКПО")
    /** "Формат\n" +
     "T(10) Строка (длина от 1 до 10 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getOkpo() {
        return okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    @XmlAttribute(name = "СтруктПодр")
    /** "Формат\n" +
     "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getStructuralSubdivision() {
        return structuralSubdivision;
    }

    public void setStructuralSubdivision(String structuralSubdivision) {
        this.structuralSubdivision = structuralSubdivision;
    }

    @XmlAttribute(name = "ИнфДляУчаст")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getInfForParticipant() {
        return infForParticipant;
    }

    public void setInfForParticipant(String infForParticipant) {
        this.infForParticipant = infForParticipant;
    }

    @XmlAttribute(name = "КраткНазв")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @XmlElement(name = "ИдСв", required = true)
    /** "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public IdSv getIdSvList() {
        return idSvList;
    }

    public void setIdSvList(IdSv idSvList) {
        this.idSvList = idSvList;
    }

    @XmlElement(name = "Адрес")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public Address getAdressList() {
        return adressList;
    }

    public void setAdressList(Address adressList) {
        this.adressList = adressList;
    }

    @XmlElement(name = "Контакт")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public Contact getContactList() {
        return contactList;
    }

    public void setContactList(Contact contactList) {
        this.contactList = contactList;
    }

    @XmlElement(name = "БанкРекв")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public BankReq getBankReqList() {
        return bankReqList;
    }

    public void setBankReqList(BankReq bankReqList) {
        this.bankReqList = bankReqList;
    }
}
