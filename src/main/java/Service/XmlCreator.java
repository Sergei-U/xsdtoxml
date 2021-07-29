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

        SvScFact svScFact = new SvScFact();
        SummNalAll summNalAll = new SummNalAll();

        TableScFact tableScFact = new TableScFact();
        tableScFact.setTotalOplList(getTotalOpl(summNalAll)); //ВсегоОпл
        tableScFact.setSvedTovList(getSvedTov()); //СведТов


        Entity.File file = new Entity.File();
        file.setIdFile("ON_NSCHFDOPPR_" + svUcDocObor.getIdDispatch() + "_" + svUcDocObor.getIdReception() + "_" + document.getDateInfPr() + "_" + file.getUuid());
        file.setVerForm("5.01");
        file.setVerProgram("СБиС3");
        file.setSvUcDocObor(getSvUcDocObor(getSvOEDDispatch()));
        file.setDocument(getDocument(dataProcedureManager));
        return file;
    }

    private SvUcDocObor getSvUcDocObor(SvOEDDispatch svOEDDispatch) {
        SvUcDocObor svUcDocObor = new SvUcDocObor();
        svUcDocObor.setIdDispatch("12345");
        svUcDocObor.setIdReception("55555");
        svUcDocObor.setsvOEDDispatch(svOEDDispatch);
        return svUcDocObor;
    }

    private SvOEDDispatch getSvOEDDispatch() {
        SvOEDDispatch svOEDDispatch = new SvOEDDispatch();
        svOEDDispatch.setIdNumberCompany("2345678910");
        svOEDDispatch.setNameCompany("ООО Рога и копыта");
        svOEDDispatch.setIdEDO("777");
        return svOEDDispatch;
    }

    private TotalOpl getTotalOpl(SummNalAll summNalAll) {
        TotalOpl totalOpl = new TotalOpl();
        totalOpl.setDefStProdUcNalAll(); //ДефСтТовУчНалВсего
        totalOpl.setStProdNoNDSAll(); //СтТовБезНДСВсего
        totalOpl.setStProdUcNalAll(); //СтТовУчНалВсего
        totalOpl.setSummNalAllList(summNalAll); //СумНалВсего
        totalOpl.setSummNetAll(); //КолНеттоВс
        return totalOpl;
    }

    private Document getDocument(DataProcedureManager dataProcedureManager) {
        Document document = new Document();
        document.setKnd("1115131");
        document.setFunc("СЧФ");
        document.setDateInfPr(LocalDate.now());
        document.setTimeInfPr(LocalDateTime.now());
        document.setNameEconSubCondition("какое то НаимЭконСубСост");
        document.setPoFactHZ("по факт ХЖ");
        document.setNameDocReq(dataProcedureManager.mapDataProcedure.get("Document No_").toString());
        document.setOsnDoverOrgCondition("ОснДоверОргСост T(120)");
        document.setSoglStrDopInf("СоглСтрДопИнф");
//        document.setSvScFact(svScFact);
//        document.setTableScFact(tableScFact);
//        document.setSvProdPer(svProdPer);
//        document.setPodpisant(podpisant);
        return document;
    }

    private SvedTov getSvedTov() {
        SvedTov svedTov = new SvedTov();
        svedTov.setNomStr();
        svedTov.setNameProduct();
        svedTov.setOkei_product();
        svedTov.setDefOKEI_product();
        svedTov.setQuantityProduct();
        svedTov.setPriceProduct();
        svedTov.setPriceProductNoNDS();
        svedTov.setStTovUcNal();
        svedTov.setDefStTovUcNal();
        svedTov.setExciseList();
        svedTov.setSummNalList();
        svedTov.setSvTDList();
        svedTov.setDopSvedTovList();
        svedTov.setInfPolFXZ2List();
        return svedTov;
    }


}
