import XmlStruct.Document;
import XmlStruct.FIO;
import XmlStruct.File;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class XmlCreator {
    public File xmlCreator() throws JAXBException, ParseException, FileNotFoundException {


        XmlStruct.File file = new XmlStruct.File();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat formatTime = new SimpleDateFormat("HH.mm.ss");
        Date dateNow = new Date();

        file.setIdFile("1");
        file.setVerForm("5.01");
        file.setVerProgram("reksoft");
//        file.setDocumentList();
//        file.setSvUcDocOborList();

        FIO fioOtp = new FIO("Ivaov","Ivan","Ivanovich");
        FIO fioPol = new FIO("Alekseev","Aleksei","Ivanovich");
        Document documentFirst = new Document();
        documentFirst.setKnd("1115131");
        documentFirst.setFunc("СЧФ");
        documentFirst.setDateInfPr(LocalDate.parse("2020.07.25"));
        documentFirst.setTimeInfPr(LocalDate.parse("15.13.25"));
        documentFirst.setNameEconSubCondition("какое то НаимЭконСубСост");


        return file;
    }
}
