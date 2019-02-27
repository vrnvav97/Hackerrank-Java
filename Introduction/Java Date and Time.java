import java.util.Calendar;
import java.util.GregorianCalendar;
class B
{ 
static byte d,m;
static short y;
static String dayy[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
    static String getDay ( String DD,String MM,String YY)
{
        d = Byte.parseByte(DD);
        m = Byte.parseByte(MM);
        y = Short.parseShort(YY);
	
        if ( y>2000 && y < 3000)
        {	
        Calendar day = Calendar.getInstance();    
	    day.set (y,m-1,d); 			     

       return (dayy[day.get(Calendar.DAY_OF_WEEK)-1]);
	}
return "";

    }