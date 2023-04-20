package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
//		Formats
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

//		Calendrier 1
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 4, 19, 23, 59, 30);

		Date date1 = cal1.getTime();
		String chaine1 = formateur1.format(date1);
		System.out.println(chaine1);

//		Date du jour
		Calendar cal2 = Calendar.getInstance();

		Date date2 = cal2.getTime();
		String chaine2 = formateur2.format(date2);
		System.out.println(chaine2);
		
//		Versions langues		
		SimpleDateFormat francais = new SimpleDateFormat("EEEE dd MMMMM yyyy", Locale.FRANCE);
		SimpleDateFormat russe = new SimpleDateFormat("EEEE dd MMMMM yyyy", new Locale("ru", "RU"));
		SimpleDateFormat chinois = new SimpleDateFormat("EEEE dd MMMMM yyyy", Locale.CHINA);
		SimpleDateFormat allemand = new SimpleDateFormat("EEEE dd MMMMM yyyy", Locale.GERMAN);
		
		System.out.println(francais.format(date2));
		System.out.println(russe.format(date2));
		System.out.println(chinois.format(date2));
		System.out.println(allemand.format(date2));
	}

}
