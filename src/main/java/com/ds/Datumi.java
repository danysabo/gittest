package com.ds;

import org.joda.time.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

public class Datumi {
    public static void main(String[] args) throws ParseException {
        Date datum = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        System.out.println(sdf.format(datum));
        datum.setTime(datum.getTime() + 86400000);
        System.out.println(datum);

//        Calendar cal = Calendar.getInstance();
//        cal.setTime(datum);
//        cal.add(Calendar.DATE, 1);

        DateTime dateTime = new DateTime(datum);
        dateTime = dateTime.plusDays(1);


        System.out.println(dateTime);
        System.out.println(dateTime.toDate());
        datum = dateTime.toDate();

        LocalDateTime ldt = LocalDateTime.ofInstant(datum.toInstant(), ZoneId.systemDefault());
        System.out.println(dtf.format(ldt));

        Date datumcic = sdf.parse("20150230");

        //TemporalAccessor parsiran = dtf.parse("20150230");

        LocalDate par = LocalDate.parse("20150230", dtf);
        System.out.println( "          " + par);

        System.out.println(ldt);
        Date out = Date.from(ldt.atZone(ZoneId.of("UTC")).toInstant());
        System.out.println(out);

    }
}
