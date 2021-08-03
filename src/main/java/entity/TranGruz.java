package entity;

import javax.xml.bind.annotation.XmlElement;


public class TranGruz {

    private String svTranGruz;

    private TranNakl tranNaklList;

    private Perevozchik perevozchikList;

    @XmlElement(name = "СвТранГруз")
    /** "Формат\n" +
     "T(1000) Строка (длина от 1 до 1000 знаков)\n" +
     "Тип элемента\n" +
     "Необязательный") */
    public String getSvTranGruz() {
        return svTranGruz;
    }

    public void setSvTranGruz(String svTranGruz) {
        this.svTranGruz = svTranGruz;
    }

    @XmlElement(name = "ТранНакл")
    /** "Формат\n" +
     "Составной элемент\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public TranNakl getTranNaklList() {
        return tranNaklList;
    }

    public void setTranNaklList(TranNakl tranNaklList) {
        this.tranNaklList = tranNaklList;
    }

    @XmlElement(name = "Перевозчик")
    /** "Формат\n" +
     "Строка\n" +
     "Тип элемента\n" +
     "Необязательный\n" +
     "Узел") */
    public Perevozchik getPerevozchikList() {
        return perevozchikList;
    }

    public void setPerevozchikList(Perevozchik perevozchikList) {
        this.perevozchikList = perevozchikList;
    }
}
