package Service;

import Entity.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class XmlCreator {


    public File xmlCreator() {

        DataProcedureManager dataProcedureManager = new DataProcedureManager();
        dataProcedureManager.getDataOnProcedureManager();

        SvOEDDispatch svOEDDispatch = getSvOEDDispatch();
        SvUcDocObor svUcDocObor = getSvUcDocObor(svOEDDispatch);
        Document document = getDocument(dataProcedureManager);
        SvScFact svScFact = getSvScFact(dataProcedureManager);
        SvULUc svULUc = getSvULUc();
        AddressRF addressRFProd = getAddressRF();
//        TableScFact tableScFact = getTableScFact();
        SvProd svProd = getSvProd();
        Address addressProd = getAddressProd();
        IdSv idSv = getIdSv();
        SvPRD svPRD = getSvPRD();



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
//        document.setPoFactHZ("по факт ХЖ");
        document.setNameDocReq(dataProcedureManager.mapDataProcedure.get("Document No_").toString());
        document.setOsnDoverOrgCondition("ОснДоверОргСост T(120)");
        document.setSoglStrDopInf("СоглСтрДопИнф");
        document.setSvScFact(getSvScFact(dataProcedureManager));
//        document.setTableScFact(tableScFact);
//        document.setSvProdPer(svProdPer);
//        document.setPodpisant(podpisant);
        return document;
    }

    private IdSv getIdSv() {
        IdSv idSv = new IdSv();
        idSv.setSvULUcList(getSvULUc());
        return idSv;
    }

    private SvULUc getSvULUcShipTo() {
        SvULUc svULUc = new SvULUc();
        svULUc.setInnUL("7826087713");
        svULUc.setNameOrg("О`Кей, ООО");
        svULUc.setKpp("780601001");
        return svULUc;
    }


    private Address getAddressProd() {
        Address addressProd = new Address();
        addressProd.setAddressRFList(getAddressRF());
        return addressProd;
    }

    private AddressRF getAddressRF() {
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
        return svProd;
    }

    private SvULUc getSvULUc() {
        SvULUc svULUc = new SvULUc();
        svULUc.setInnUL("7802144867");
        svULUc.setNameOrg("ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \"РЕКСОФТ.РУ\"\n");
        svULUc.setKpp("781301001");
        return svULUc;
    }

    private SvScFact getSvScFact(DataProcedureManager dataProcedureManager) {
        SvScFact svScFact = new SvScFact();
        svScFact.setCodeOKV(dataProcedureManager.mapDataProcedure.get("Currency Code").toString()); //КодОКВ+
        svScFact.setNumberScF(dataProcedureManager.mapDataProcedure.get("Inv_No").toString()); //НомерСчФ+
        svScFact.setSvPRDList(getSvPRD());
        return svScFact;
    }

    private SvPRD getSvPRD() {
        SvPRD svPRD = new SvPRD();
        svPRD.setDatePRD(); //ДатаПРД
        svPRD.setNumberPRD(); //НомерПРД
        svPRD.setSummPRD(); //СуммаПРД
        return svPRD;
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

//    private TotalOpl getTotalOpl() {
//        TotalOpl totalOpl = new TotalOpl();
//        totalOpl.setDefStProdUcNalAll(); //ДефСтТовУчНалВсего
//        totalOpl.setStProdNoNDSAll(); //СтТовБезНДСВсего
//        totalOpl.setStProdUcNalAll(); //СтТовУчНалВсего
//        totalOpl.setSummNalAllList(); //СумНалВсего
//        totalOpl.setSummNetAll(); //КолНеттоВс
//        return totalOpl;
//    }



//    private SvedTov getSvedTov() {
//        SvedTov svedTov = new SvedTov();
//        svedTov.setNomStr();
//        svedTov.setNameProduct();
//        svedTov.setOkei_product();
//        svedTov.setDefOKEI_product();
//        svedTov.setQuantityProduct();
//        svedTov.setPriceProduct();
//        svedTov.setPriceProductNoNDS();
//        svedTov.setStTovUcNal();
//        svedTov.setDefStTovUcNal();
//        svedTov.setExciseList();
//        svedTov.setSummNalList();
//        svedTov.setSvTDList();
//        svedTov.setDopSvedTovList();
//        svedTov.setInfPolFXZ2List();
//        return svedTov;
//    }

//    private TableScFact getTableScFact() {
//        TableScFact tableScFact = new TableScFact();
//        tableScFact.setTotalOplList(getTotalOpl()); //ВсегоОпл
//        tableScFact.setSvedTovList(getSvedTov()); //СведТов
//        return tableScFact;
//    }
}
