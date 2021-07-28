package Entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAdapter extends XmlAdapter<String, LocalDate> {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public LocalDate unmarshal(String date) throws Exception {
        return (LocalDate) dateTimeFormatter.parse(date);
    }

    @Override
    public String marshal(LocalDate s) throws Exception {
        return dateTimeFormatter.format(s);

    }


//
//    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
//
//    @Override
//    public String unmarshal(Date s) throws Exception {
//        synchronized (dateFormat) {
//            return dateFormat.format(s);
//        }
//    }
//
//    @Override
//    public Date marshal(String date) throws Exception {
//        synchronized (dateFormat) {
//            return dateFormat.parse(date);
//        }
//    }
}
