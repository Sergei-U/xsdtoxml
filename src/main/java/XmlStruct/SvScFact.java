package XmlStruct;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;
import java.util.List;

/**
 *
 */

public class SvScFact {

    @XmlElement(name = "НомерСчФ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String numberScF;

    @XmlElement(name = "ДатаСчФ", required = true)
    @ApiModelProperty(value = "Формат\n" +
            "D(10) Дата (фиксированное число знаков 10)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private Date dateScF;

    @XmlElement(name = "КодОКВ")
    @ApiModelProperty(value = "Формат\n" +
            "T(=3) Строка (фиксированное число знаков 3)\n" +
            "Тип элемента\n" +
            "Обязательный")
    private String codeOKV;

    @XmlElement(name = "ИспрСчФ", required = false)
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<IsprScF> isprScFList;

    @XmlElement(name = "СвПрод",required = true)
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvProd> svProdList;

    @XmlElement(name = "ГрузОт")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<CargoSender> cargoSenderList;

    @XmlElement(name = "ГрузПолуч")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<CargoReceiver> cargoReceiverList;

    @XmlElement(name = "СвПРД")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<SvPRD> svPRDList;

    @XmlElement(name = "СвПокуп")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Обязательный\n" +
            "Узел")
    private List<SvBuyer> svBuyerList;

    @XmlElement(name = "ДопСвФХЖ1")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<DopSvFXZ1> dopSvFXZ1List;


    @XmlElement(name = "ДокПодтвОтгр")
    @ApiModelProperty(value = "Формат\n" +
            "Составной элемент\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<DocumentConfirmShipment> documentConfirmShipmentList;

    @XmlElement(name = "ИнфПолФХЖ1")
    @ApiModelProperty(value = "Формат\n" +
            "Строка\n" +
            "Тип элемента\n" +
            "Необязательный\n" +
            "Узел")
    private List<InfPolFXZ1> infPolFXZ1List;

    public String getNumberScF() {
        return numberScF;
    }

    public void setNumberScF(String numberScF) {
        this.numberScF = numberScF;
    }

    public Date getDateScF() {
        return dateScF;
    }

    public void setDateScF(Date dateScF) {
        this.dateScF = dateScF;
    }

    public String getCodeOKV() {
        return codeOKV;
    }

    public void setCodeOKV(String codeOKV) {
        this.codeOKV = codeOKV;
    }

    public List<IsprScF> getIsprScFList() {
        return isprScFList;
    }

    public void setIsprScFList(List<IsprScF> isprScFList) {
        this.isprScFList = isprScFList;
    }

    public List<SvProd> getSvProdList() {
        return svProdList;
    }

    public void setSvProdList(List<SvProd> svProdList) {
        this.svProdList = svProdList;
    }

    public List<CargoSender> getCargoSenderList() {
        return cargoSenderList;
    }

    public void setCargoSenderList(List<CargoSender> cargoSenderList) {
        this.cargoSenderList = cargoSenderList;
    }

    public List<CargoReceiver> getCargoReceiverList() {
        return cargoReceiverList;
    }

    public void setCargoReceiverList(List<CargoReceiver> cargoReceiverList) {
        this.cargoReceiverList = cargoReceiverList;
    }

    public List<SvPRD> getSvPRDList() {
        return svPRDList;
    }

    public void setSvPRDList(List<SvPRD> svPRDList) {
        this.svPRDList = svPRDList;
    }

    public List<SvBuyer> getSvBuyerList() {
        return svBuyerList;
    }

    public void setSvBuyerList(List<SvBuyer> svBuyerList) {
        this.svBuyerList = svBuyerList;
    }

    public List<DopSvFXZ1> getDopSvFXZ1List() {
        return dopSvFXZ1List;
    }

    public void setDopSvFXZ1List(List<DopSvFXZ1> dopSvFXZ1List) {
        this.dopSvFXZ1List = dopSvFXZ1List;
    }

    public List<DocumentConfirmShipment> getDocumentConfirmShipmentList() {
        return documentConfirmShipmentList;
    }

    public void setDocumentConfirmShipmentList(List<DocumentConfirmShipment> documentConfirmShipmentList) {
        this.documentConfirmShipmentList = documentConfirmShipmentList;
    }

    public List<InfPolFXZ1> getInfPolFXZ1List() {
        return infPolFXZ1List;
    }

    public void setInfPolFXZ1List(List<InfPolFXZ1> infPolFXZ1List) {
        this.infPolFXZ1List = infPolFXZ1List;
    }
}
