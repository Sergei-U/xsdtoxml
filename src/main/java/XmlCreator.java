import XmlStruct.*;

import java.time.LocalDate;
import java.util.Date;

public class XmlCreator {
    public File xmlCreator() {


        XmlStruct.File file = new XmlStruct.File();


        file.setIdFile("1");
        file.setVerForm("5.01");
        file.setVerProgram("СБиС3");

        SvOEDDispatch svOEDDispatch = new SvOEDDispatch("ООО Рога и копыта", "2345678910", "777");


        SvUcDocObor svUcDocObor = new SvUcDocObor("12345", "55555", svOEDDispatch);
        file.setSvUcDocObor(svUcDocObor);

        Document documentFirst = new Document();
        documentFirst.setKnd("1115131");
        documentFirst.setFunc("СЧФ");
        documentFirst.setDateInfPr();
        documentFirst.setTimeInfPr();
        documentFirst.setNameEconSubCondition("какое то НаимЭконСубСост");
        documentFirst.setPoFactHZ("по факт ХЖ");
        documentFirst.setNameDocReq("накладная");
        documentFirst.setOsnDoverOrgCondition("ОснДоверОргСост T(120)");
        documentFirst.setSoglStrDopInf("СоглСтрДопИнф");
        file.setDocument(documentFirst);







        FIO fioOtp = new FIO("Ivaov","Ivan","Ivanovich");
        FIO fioPol = new FIO("Alekseev","Aleksei","Ivanovich");



        return file;
    }
}
