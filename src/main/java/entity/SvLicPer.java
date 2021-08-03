package entity;

import javax.xml.bind.annotation.XmlElement;


public class SvLicPer {

    private RabOrgProd rabOrgProdList;

    private InLico inLicoList;

    @XmlElement(name = "РабОргПрод", required = true)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public RabOrgProd getRabOrgProdList() {
        return rabOrgProdList;
    }

    public void setRabOrgProdList(RabOrgProd rabOrgProdList) {
        this.rabOrgProdList = rabOrgProdList;
    }

    @XmlElement(name = "ИнЛицо")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public InLico getInLicoList() {
        return inLicoList;
    }

    public void setInLicoList(InLico inLicoList) {
        this.inLicoList = inLicoList;
    }
}
