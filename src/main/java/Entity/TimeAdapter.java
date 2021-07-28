package Entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeAdapter extends XmlAdapter<String, LocalDateTime> {


    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH.mm.ss");

    @Override
    public LocalDateTime unmarshal(String date) throws Exception {
        return LocalDateTime.from(LocalDate.from(dateTimeFormatter.parse(date)));
    }

    @Override
    public String marshal(LocalDateTime s) throws Exception {
        return dateTimeFormatter.format(s);

    }
}
