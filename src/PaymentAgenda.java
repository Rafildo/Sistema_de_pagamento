import java.util.Calendar;
import java.util.Date;

public class PaymentAgenda {
    Calendar cal = Calendar.getInstance();
    private String type;
    private int interval;
    private int weekday;
    private int dateday;
    private int datemonth;
    private int dueweekday;
    private int duedateday;
    private  int duedatemonth;

    public PaymentAgenda(String type,int interval,int day)
    {
        this.type = type;
        this.interval = interval;
        this.weekday = day;
        this.dateday = cal.get(Calendar.DAY_OF_MONTH);
        this.datemonth = cal.get(Calendar.MONTH);
    }

    public int getDateday() {
        return dateday;
    }

    public void setDateday(int dateday) {
        this.dateday = dateday;
    }

    public int getDatemonth() {
        return datemonth;
    }

    public void setDatemonth(int datemonth) {
        this.datemonth = datemonth;
    }

    public int getDuedateday() {
        return duedateday;
    }

    public void setDuedateday(int duedateday) {
        this.duedateday = duedateday;
    }

    public int getDuedatemonth() {
        return duedatemonth;
    }

    public void setDuedatemonth(int duedatemonth) {
        this.duedatemonth = duedatemonth;
    }


    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public int getWeekday() {
        return weekday;
    }

    public int getDueweekday() {
        return dueweekday;
    }

    public void setDueweekday(int dueweekday) {
        this.dueweekday = dueweekday;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
}
