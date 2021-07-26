import XmlStruct.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 */
public class XsdToXmlApp {
    public static void main(String[] args) {
        XmlCreator xmlCreator = new XmlCreator();

        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(File.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        Marshaller marshaller = null;
        try {
            marshaller = context.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        } catch (PropertyException e) {
            e.printStackTrace();
        }
        try {
            try {
                marshaller.marshal(xmlCreator, new FileOutputStream("scfNewTest.xml"));
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
