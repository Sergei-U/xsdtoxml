package XmlStruct;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter extends XmlAdapter<Date, String> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    @Override
    public String unmarshal(Date s) throws Exception {
        synchronized (dateFormat) {
            return dateFormat.format(s);
        }
    }

    @Override
    public Date marshal(String date) throws Exception {
        synchronized (dateFormat) {
            return dateFormat.parse(date);
        }
    }
}
