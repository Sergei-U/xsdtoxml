import XmlStruct.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class XmlCreator {
    public File xmlCreator() {


        XmlStruct.File file = new XmlStruct.File();
        Document documentFirst = new Document();
        SvOEDDispatch svOEDDispatch = new SvOEDDispatch("ООО Рога и копыта", "2345678910", "777");
        SvUcDocObor svUcDocObor = new SvUcDocObor("12345", "55555", svOEDDispatch);


        file.setIdFile("ON_NSCHFDOPPR_" + svUcDocObor.getIdDispatch() + "_" + svUcDocObor.getIdReception() + "_" + documentFirst.getDateInfPr() + "_" + file.getUuid());
        file.setVerForm("5.01");
        file.setVerProgram("СБиС3");
        file.setSvUcDocObor(svUcDocObor);

        documentFirst.setKnd("1115131");
        documentFirst.setFunc("СЧФ");
        documentFirst.setDateInfPr(LocalDate.now());
        documentFirst.setTimeInfPr(LocalDateTime.now());
        documentFirst.setNameEconSubCondition("какое то НаимЭконСубСост");
        documentFirst.setPoFactHZ("по факт ХЖ");
        documentFirst.setNameDocReq("накладная");
        documentFirst.setOsnDoverOrgCondition("ОснДоверОргСост T(120)");
        documentFirst.setSoglStrDopInf("СоглСтрДопИнф");
        file.setDocument(documentFirst);


        FIO fioOtp = new FIO("Ivaov", "Ivan", "Ivanovich");
        FIO fioPol = new FIO("Alekseev", "Aleksei", "Ivanovich");


        return file;
    }
}
