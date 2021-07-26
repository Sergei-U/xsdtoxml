package XmlStruct;

import io.swagger.annotations.ApiModelProperty;


import javax.xml.bind.annotation.XmlElement;
import java.util.Date;
import java.util.List;

/**
 *
 */

public class SvScFact {

    private String numberScF;

    private Date dateScF;

    private String codeOKV;

    private List<IsprScF> isprScFList;

    private List<SvProd> svProdList;

    private List<CargoSender> cargoSenderList;

    private List<CargoReceiver> cargoReceiverList;

    private List<SvPRD> svPRDList;

    private List<SvBuyer> svBuyerList;

    private List<DopSvFXZ1> dopSvFXZ1List;

    private List<DocumentConfirmShipment> documentConfirmShipmentList;

    private List<InfPolFXZ1> infPolFXZ1List;


    @XmlElement(name = "НомерСчФ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getNumberScF() {
        return numberScF;
    }

    public void setNumberScF(String numberScF) {
        this.numberScF = numberScF;
    }

    @XmlElement(name = "ДатаСчФ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public Date getDateScF() {
        return dateScF;
    }

    public void setDateScF(Date dateScF) {
        this.dateScF = dateScF;
    }

    @XmlElement(name = "КодОКВ")
    @ApiModelProperty(value = "Формат\n" +
            "T(=3) Строка (фиксированное число знаков 3)\n" +
            "Тип элемента\n" +
            "Обязательный")
    public String getCodeOKV() {
        return codeOKV;
    }

    public void setCodeOKV(String codeOKV) {
        this.codeOKV = codeOKV;
    }

    @XmlElement(name = "ИспрСчФ", required = false)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<IsprScF> getIsprScFList() {
        return isprScFList;
    }

    public void setIsprScFList(List<IsprScF> isprScFList) {
        this.isprScFList = isprScFList;
    }

    @XmlElement(name = "СвПрод",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<SvProd> getSvProdList() {
        return svProdList;
    }

    public void setSvProdList(List<SvProd> svProdList) {
        this.svProdList = svProdList;
    }

    @XmlElement(name = "ГрузОт")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<CargoSender> getCargoSenderList() {
        return cargoSenderList;
    }

    public void setCargoSenderList(List<CargoSender> cargoSenderList) {
        this.cargoSenderList = cargoSenderList;
    }

    @XmlElement(name = "ГрузПолуч")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<CargoReceiver> getCargoReceiverList() {
        return cargoReceiverList;
    }

    public void setCargoReceiverList(List<CargoReceiver> cargoReceiverList) {
        this.cargoReceiverList = cargoReceiverList;
    }

    @XmlElement(name = "СвПРД")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<SvPRD> getSvPRDList() {
        return svPRDList;
    }

    public void setSvPRDList(List<SvPRD> svPRDList) {
        this.svPRDList = svPRDList;
    }

    @XmlElement(name = "СвПокуп")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    public List<SvBuyer> getSvBuyerList() {
        return svBuyerList;
    }

    public void setSvBuyerList(List<SvBuyer> svBuyerList) {
        this.svBuyerList = svBuyerList;
    }

    @XmlElement(name = "ДопСвФХЖ1")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<DopSvFXZ1> getDopSvFXZ1List() {
        return dopSvFXZ1List;
    }

    public void setDopSvFXZ1List(List<DopSvFXZ1> dopSvFXZ1List) {
        this.dopSvFXZ1List = dopSvFXZ1List;
    }


    @XmlElement(name = "ДокПодтвОтгр")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<DocumentConfirmShipment> getDocumentConfirmShipmentList() {
        return documentConfirmShipmentList;
    }

    public void setDocumentConfirmShipmentList(List<DocumentConfirmShipment> documentConfirmShipmentList) {
        this.documentConfirmShipmentList = documentConfirmShipmentList;
    }

    @XmlElement(name = "ИнфПолФХЖ1")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    public List<InfPolFXZ1> getInfPolFXZ1List() {
        return infPolFXZ1List;
    }

    public void setInfPolFXZ1List(List<InfPolFXZ1> infPolFXZ1List) {
        this.infPolFXZ1List = infPolFXZ1List;
    }
}
