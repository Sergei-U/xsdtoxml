package Service;

import Entity.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class XmlCreator {


//    SvScFact svScFact = getSvScFact(dataProcedureManager);

    public File xmlCreator() {
        DataProcedureManager dataProcedureManager = new DataProcedureManager();
        dataProcedureManager.getDataOnProcedureManager();
        SvOEDDispatch svOEDDispatch = getSvOEDDispatch();
        SvUcDocObor svUcDocObor = getSvUcDocObor(svOEDDispatch);
        Document document = getDocument(dataProcedureManager);
        Entity.File file = new Entity.File();
        file.setIdFile("ON_NSCHFDOPPR_" + svUcDocObor.getIdDispatch() + "_" + svUcDocObor.getIdReception() + "_" + document.getDateInfPr() + "_" + file.getUuid());
        file.setVerForm("5.01"); //ВерсФорм +
        file.setVerProgram("СБиС3"); //ВерсПрог +
        file.setSvUcDocObor(svUcDocObor);
        file.setDocument(document);
        return file;
    }


    private Document getDocument(DataProcedureManager dataProcedureManager) {
        Document document = new Document();
        document.setKnd("1115131"); //КНД +
        document.setFunc("СЧФ"); //Функиця +
        document.setDateInfPr(LocalDate.now());
        document.setTimeInfPr(LocalDateTime.now());
        document.setNameEconSubCondition("ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \"РЕКСОФТ.РУ\""); //НаимЭконСубСост +
        document.setNameDocReq(dataProcedureManager.mapDataProcedure.get("Document No_").toString());
        document.setOsnDoverOrgCondition("ОснДоверОргСост T(120)");
        document.setSoglStrDopInf("СоглСтрДопИнфФ"); //обязательно 14 знаков
        document.setSvScFact(getSvScFact(dataProcedureManager));
//        document.setPoFactHZ("по факт ХЖ");
//        document.setTableScFact(getTableScFact());
        document.setSvProdPer(getSvProdPer());
        document.setPodpisant(getPodpisant());
        return document;
    }


    private Podpisant getPodpisant() {
        Podpisant podpisant = new Podpisant();
        podpisant.setOblPolnEnum(6);
        podpisant.setStatusEnum(1); //1 or 4
        podpisant.setOsnPoln("Формат");
        podpisant.setOsnPolnOrg("ОснПолнОрг");
        podpisant.setUl(getUL());

        return podpisant;
    }

    private UL getUL() {
        UL ul = new UL();
        ul.setGosRegIPVidDov("ГосРегИПВыдДов");
        ul.setInnUL("7802144867");
        ul.setOverInf("ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ РЕКСОФТ.РУ");
        ul.setNameOrg("ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ РЕКСОФТ.РУ");
        ul.setDolzhnost("ДИректор");
        ul.setFioList(getFIOPodpisant());
        return ul;
    }

    private FIO getFIOPodpisant() {
        FIO fio = new FIO();
        fio.setFirstName("Егоров А.Г.");
        fio.setLastName("Егоров А.Г.");
        return fio;
    }


    private SvProdPer getSvProdPer() {
        SvProdPer svProdPer = new SvProdPer();
        svProdPer.setSvPerList(getSvPerList());
//        svProdPer.setInfPolFXZ3List(getInfPolFXZ3List());
        return svProdPer;
    }

    private InfPolFXZ3 getInfPolFXZ3List() {
        InfPolFXZ3 infPolFXZ3 = new InfPolFXZ3();
        infPolFXZ3.setIdFileInfPol("9c3adc2b-a085-4acd-af8c-3494290d782c");
//        infPolFXZ3.setTextInfList();
        return infPolFXZ3;
    }

    private SvPer getSvPerList() {
        SvPer svPer = new SvPer();
        svPer.setSodOper("Обязательный");
        svPer.setVidOper("ВидОпер");
        svPer.setDatePer(LocalDate.now());
        svPer.setDateStart(LocalDate.now());
        svPer.setDateEnd(LocalDate.now());
        svPer.setOsnPerList(getOsnPerList());
//        svPer.setSvLicPerList();
//        svPer.setTranGruzList();
//        svPer.setSvPerVechList();
        return svPer;
    }

    private OsnPer getOsnPerList() {
        OsnPer osnPer = new OsnPer();
        osnPer.setNameOsn("Без документа-основания");
        osnPer.setNomOns("Необязательный");
        osnPer.setDateOsn(LocalDate.now());
        osnPer.setDopSvOsn("Необязательный");
        osnPer.setIdentOsn("Необязательный");
        return osnPer;
    }

    private TableScFact getTableScFact() {
        TableScFact tableScFact = new TableScFact();
        tableScFact.setTotalOplList(getTotalOpl()); //ВсегоОпл
        tableScFact.setSvedTovList(getSvedTov()); //СведТов
        return tableScFact;
    }

    private TotalOpl getTotalOpl() {
        TotalOpl totalOpl = new TotalOpl();
        totalOpl.setDefStProdUcNalAll("-"); //ДефСтТовУчНалВсего
        totalOpl.setStProdNoNDSAll(BigDecimal.valueOf(19.2)); //СтТовБезНДСВсего
        totalOpl.setStProdUcNalAll(BigDecimal.valueOf(19.2)); //СтТовУчНалВсего
        totalOpl.setSummNalAllList(getsummNalAll()); //СумНалВсего
        totalOpl.setSummNetAll(BigDecimal.valueOf(19.2)); //КолНеттоВс
        return totalOpl;
    }

    private SummNalAll getsummNalAll() {
        SummNalAll summNalAll = new SummNalAll();
        summNalAll.setSummNal(BigDecimal.valueOf(500.5));
        summNalAll.setDefNDS("-");
        summNalAll.setNonNDS(String.valueOf(480.5));
        return summNalAll;
    }


    private SvedTov getSvedTov() {
        SvedTov svedTov = new SvedTov();
        svedTov.setNomStr(6);
        svedTov.setNameProduct("НаимТов T(1000) Строка (длина от 1 до 1000 знаков)");
        svedTov.setOkei_product("334");
        svedTov.setDefOKEI_product("-");
        svedTov.setQuantityProduct(BigDecimal.valueOf(26.11));
        svedTov.setPriceProduct(BigDecimal.valueOf(25.11));
        svedTov.setPriceProductNoNDS(BigDecimal.valueOf(19.2));
        svedTov.setStTovUcNal(BigDecimal.valueOf(19.2));
        svedTov.setDefStTovUcNal("-");
        svedTov.setNalst("0%");
        svedTov.setExciseList(getExiceList());
//        svedTov.setSummNalList();
//        svedTov.setSvTDList();
//        svedTov.setDopSvedTovList();
//        svedTov.setInfPolFXZ2List();
        return svedTov;
    }

    private Excise getExiceList() {
        Excise excise = new Excise();
        excise.setSummExcise(BigDecimal.valueOf(19.2));
        excise.setNonExcise("Без акциза");
        return excise;
    }

    private SvScFact getSvScFact(DataProcedureManager dataProcedureManager) {
        SvScFact svScFact = new SvScFact();
        svScFact.setDateScF(LocalDate.now());
//        svScFact.setCodeOKV(dataProcedureManager.mapDataProcedure.get("Currency Code").toString()); //КодОКВ+
        svScFact.setCodeOKV("643"); //КодОКВ+
        svScFact.setNumberScF(dataProcedureManager.mapDataProcedure.get("Inv_No").toString()); //НомерСчФ+
        svScFact.setSvProdList(getSvProd()); //СвПрод
//        svScFact.setCargoSenderList(getCargoSendler()); //ГрузОт
        svScFact.setCargoReceiverList(getCargoReceiverShipTo()); //ГрузПолуч
        svScFact.setSvBuyerList(getSvBuyer());
        svScFact.setIsprScFList(getIsprScFList());
//        svScFact.setSvPRDList(getSvPRD());
        return svScFact;
    }

    private CargoSender getCargoSendler() {
        CargoSender cargoSender = new CargoSender();
        cargoSender.setOnZ("Он Же");
        return cargoSender;
    }

    private SvULUc getSvULUcShipTo() {
        SvULUc svULUc = new SvULUc();
        svULUc.setInnUL("7826087713");
        svULUc.setNameOrg("О`Кей, ООО");
        svULUc.setKpp("780601001");
        return svULUc;
    }

    private Address getAddressShipTo() {
        Address addressProd = new Address();
        addressProd.setAddressRFList(getAddressRFShipTo());
        return addressProd;
    }

    private IdSv getIdSvProd() {
        IdSv idSv = new IdSv();
        idSv.setSvULUcList(getSvULUcProd());
        return idSv;
    }

    private AddressRF getAddressRFShipTo() {
        AddressRF addressRFProd = new AddressRF();
        addressRFProd.setIndex("195112"); //индекс
        addressRFProd.setCodeRegion("78"); //Код регион
        addressRFProd.setCity("Санкт-Петербург"); //Город
        addressRFProd.setStreet("пр-кт.Заневский"); //Улица
        addressRFProd.setHouse("65"); //Дом
        addressRFProd.setHousing("лит.А"); //Корпус
        addressRFProd.setAppartment("к.1, лит.А"); //Кварт
        return addressRFProd;
    }

    private Address getAddressProd() {
        Address addressProd = new Address();
        addressProd.setAddressRFList(getAddressRFProd());
        return addressProd;
    }

    private AddressRF getAddressRFProd() {
        AddressRF addressRFProd = new AddressRF();
        addressRFProd.setCity("Санкт-Петербург"); //Город
        addressRFProd.setStreet("пр.Медиков"); //Улица
        addressRFProd.setCodeRegion("78"); //Код регион
        addressRFProd.setIndex("197022"); //индекс
        addressRFProd.setHouse("3"); //Дом
        addressRFProd.setHousing("лит.А"); //Корпус
        addressRFProd.setAppartment("пом.4Н,офис 310"); //Кварт
        return addressRFProd;
    }

    private SvProd getSvProd() {
        SvProd svProd = new SvProd();
        svProd.setAdressList(getAddressProd());
        svProd.setIdSvList(getIdSvProd());
        return svProd;
    }

    private SvULUc getSvULUcProd() {
        SvULUc svULUc = new SvULUc();
        svULUc.setInnUL("7802144867");
        svULUc.setNameOrg("ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \"РЕКСОФТ.РУ\"\n");
        svULUc.setKpp("781301001");
        return svULUc;
    }


    private IsprScF getIsprScFList() {
        IsprScF isprScF = new IsprScF();
        isprScF.setDateIsprScf(LocalDate.now()); //ДатаИспрСчФ
        isprScF.setDefDateIsprScf("-"); //ДефДатаИспрСчФ
        isprScF.setNomIsprScf(1); //НомИспрСчФ большой вопрос что тут должно быть
        isprScF.setDefNomIsprScf("-"); //ДефНомИспрСчФ
        return isprScF;
    }

    private SvBuyer getSvBuyer() {
        SvBuyer svBuyer = new SvBuyer();
        svBuyer.setIdSvList(getIdSvShipTo());
        svBuyer.setAddressList(getAddressShipTo());
        return svBuyer;
    }

    private CargoReceiver getCargoReceiverShipTo() {
        CargoReceiver cargoReceiver = new CargoReceiver();
        cargoReceiver.setIdSvList(getIdSvShipTo());
        cargoReceiver.setAddressList(getAddressShipTo());
        return cargoReceiver;
    }

    private IdSv getIdSvShipTo() {
        IdSv idSv = new IdSv();
        idSv.setSvULUcList(getSvULUcShipTo());
        return idSv;

    }

    private SvUcDocObor getSvUcDocObor(SvOEDDispatch svOEDDispatch) {
        SvUcDocObor svUcDocObor = new SvUcDocObor();
        svUcDocObor.setIdDispatch("2BEf92fa276854f11e28400005056917125"); //ИдПол +
        svUcDocObor.setIdReception("2BEfb1c17c6771e4766b448f7223f56d399"); //ИдОтпр +
        svUcDocObor.setsvOEDDispatch(svOEDDispatch);
        return svUcDocObor;
    }

    private SvOEDDispatch getSvOEDDispatch() {
        SvOEDDispatch svOEDDispatch = new SvOEDDispatch();
        svOEDDispatch.setIdNumberCompany("7605016030"); //ИННЮЛ +
        svOEDDispatch.setNameCompany("ООО Компания Тензор"); //НаимОрг +
        svOEDDispatch.setIdEDO("2BE"); //ИдЭДО +
        return svOEDDispatch;
    }




}
