package entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAdapter extends XmlAdapter<String, LocalDate> {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public LocalDate unmarshal(String date) {
        return (LocalDate) dateTimeFormatter.parse(date);
    }

    @Override
    public String marshal(LocalDate s) {
        return dateTimeFormatter.format(s);

    }


}
