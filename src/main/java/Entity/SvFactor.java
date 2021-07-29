package Entity;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 */

public class SvFactor {

    private String okpo;

    private String structSubdivision;

    private String infForParticipation;

    private String shortName;

    private IdSv idSvList;

    private Address addressList;

    private Contact contactList;

    private BankReq bankReqList;

    @XmlElement(name = "ОКПО")
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

    @XmlElement(name = "СтруктПодр")
    /** "Формат\n" +
     "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getStructSubdivision() {
        return structSubdivision;
    }

    public void setStructSubdivision(String structSubdivision) {
        this.structSubdivision = structSubdivision;
    }

    @XmlElement(name = "ИнфДляУчаст")
    /** "Формат\n" +
     "T(255) Строка (длина от 1 до 255 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getInfForParticipation() {
        return infForParticipation;
    }

    public void setInfForParticipation(String infForParticipation) {
        this.infForParticipation = infForParticipation;
    }

    @XmlElement(name = "КраткНазв")
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
    /** "Формат\n" +
     "Строка\n" +
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
    public Address getAddressList() {
        return addressList;
    }

    public void setAddressList(Address addressList) {
        this.addressList = addressList;
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
