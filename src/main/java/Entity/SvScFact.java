package Entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

/**
 *
 */

public class SvScFact {

    private String numberScF;

    private LocalDate dateScF;

    private String codeOKV;

    private IsprScF isprScFList;

    private SvProd svProdList;

    private CargoSender cargoSenderList;

    private CargoReceiver cargoReceiverList;

    private SvPRD svPRDList;

    private SvBuyer svBuyerList;

    private DopSvFXZ1 dopSvFXZ1List;

    private DocumentConfirmShipment documentConfirmShipmentList;

    private InfPolFXZ1 infPolFXZ1List;


    @XmlAttribute(name = "НомерСчФ", required = true)
    /** "Формат\n" +
     "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getNumberScF() {
        return numberScF;
    }

    public void setNumberScF(String numberScF) {
        this.numberScF = numberScF;
    }

    @XmlAttribute(name = "ДатаСчФ", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "datetime")
    /** "Формат\n" +
     "D(10) Дата (фиксированное число знаков 10)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public LocalDate getDateScF() {
        return dateScF;
    }

    public void setDateScF(LocalDate dateScF) {
        this.dateScF = dateScF;
    }

    @XmlAttribute(name = "КодОКВ")
    /** "Формат\n" +
     "T(=3) Строка (фиксированное число знаков 3)\n" +
     "Тип элемента\n" +
     "Обязательный") */
    public String getCodeOKV() {
        return codeOKV;
    }

    public void setCodeOKV(String codeOKV) {
        this.codeOKV = codeOKV;
    }

    @XmlElement(name = "ИспрСчФ", required = false)
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public IsprScF getIsprScFList() {
        return isprScFList;
    }

    public void setIsprScFList(IsprScF isprScFList) {
        this.isprScFList = isprScFList;
    }

    @XmlElement(name = "СвПрод", required = true)
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public SvProd getSvProdList() {
        return svProdList;
    }

    public void setSvProdList(SvProd svProdList) {
        this.svProdList = svProdList;
    }

    @XmlElement(name = "ГрузОт")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public CargoSender getCargoSenderList() {
        return cargoSenderList;
    }

    public void setCargoSenderList(CargoSender cargoSenderList) {
        this.cargoSenderList = cargoSenderList;
    }

    @XmlElement(name = "ГрузПолуч")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public CargoReceiver getCargoReceiverList() {
        return cargoReceiverList;
    }

    public void setCargoReceiverList(CargoReceiver cargoReceiverList) {
        this.cargoReceiverList = cargoReceiverList;
    }

    @XmlElement(name = "СвПРД")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public SvPRD getSvPRDList() {
        return svPRDList;
    }

    public void setSvPRDList(SvPRD svPRDList) {
        this.svPRDList = svPRDList;
    }

    @XmlElement(name = "СвПокуп")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Обязательный\n" +
     "Узел") */
    public SvBuyer getSvBuyerList() {
        return svBuyerList;
    }

    public void setSvBuyerList(SvBuyer svBuyerList) {
        this.svBuyerList = svBuyerList;
    }

    @XmlElement(name = "ДопСвФХЖ1")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public DopSvFXZ1 getDopSvFXZ1List() {
        return dopSvFXZ1List;
    }

    public void setDopSvFXZ1List(DopSvFXZ1 dopSvFXZ1List) {
        this.dopSvFXZ1List = dopSvFXZ1List;
    }


    @XmlElement(name = "ДокПодтвОтгр")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public DocumentConfirmShipment getDocumentConfirmShipmentList() {
        return documentConfirmShipmentList;
    }

    public void setDocumentConfirmShipmentList(DocumentConfirmShipment documentConfirmShipmentList) {
        this.documentConfirmShipmentList = documentConfirmShipmentList;
    }

    @XmlElement(name = "ИнфПолФХЖ1")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public InfPolFXZ1 getInfPolFXZ1List() {
        return infPolFXZ1List;
    }

    public void setInfPolFXZ1List(InfPolFXZ1 infPolFXZ1List) {
        this.infPolFXZ1List = infPolFXZ1List;
    }
}
