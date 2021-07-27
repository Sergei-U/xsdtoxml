import XmlStruct.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 */
public class XsdToXmlApp {
    public static void main(String[] args) {

        XmlCreator xmlCreator = new XmlCreator();


        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(File.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "Windows-1251");

            marshaller.marshal(xmlCreator.xmlCreator(), new FileOutputStream("javatoxml.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

