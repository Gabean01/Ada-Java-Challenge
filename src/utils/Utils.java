package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Utils {
    public static Date convertStringDateToDate(String date) throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }

    public static double getAverageFromList(List<Integer> data){
        Integer sum = 0;
        if(!data.isEmpty()){
            for (Integer number : data) {
                sum += number;
            }
            return sum.doubleValue() / data.size();
        }
        return 0;
    }
}
