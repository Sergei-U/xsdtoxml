package XmlStruct;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeAdapter extends XmlAdapter<String, LocalDate> {


    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH.mm.ss");

    @Override
    public LocalDate unmarshal(String date) throws Exception {
        return (LocalDate) dateTimeFormatter.parse(date);
    }

    @Override
    public String marshal(LocalDate s) throws Exception {
        return dateTimeFormatter.format(s);

    }
}
