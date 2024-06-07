import java.io.*;

class TimeConversionResult {
    public static String timeConversion(String s) {
        String tailString = s.substring(2, 8);
        int hours = Integer.parseInt(s.substring(0, 2));
        String hourString = s.substring(0, 8);
        if (hours == 12) {
            if (s.charAt(8) == 'A') {
                hourString = "00" + tailString;
            } else {
                hourString = "12" + tailString;
            }
        } else if (s.charAt(8) == 'P') {
            hourString = (hours + 12) + tailString;
        }
        return hourString;
    }
}

public class TimeConversion {
    public static void main(String[] args) throws IOException {

        String s = "12:01:00AM";
        System.out.println(TimeConversionResult.timeConversion(s));

        s = "07:05:45PM";
        System.out.println(TimeConversionResult.timeConversion(s));

        s = "00:01:00PM";
        System.out.println(TimeConversionResult.timeConversion(s));

        s = "01:01:00PM";
        System.out.println(TimeConversionResult.timeConversion(s));
    }
}
