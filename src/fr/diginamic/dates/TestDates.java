package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
//		Formats
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formateur2= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
//		Date du jour 1er format
		Date date1 = new Date();
		String chaine1 = formateur1.format(date1);
		
		System.out.println(chaine1);
		
//		Date du 19/05/2016 à 23 :59 :30	
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		String chaine2 = formateur2.format(date2);
		
		System.out.println(chaine2);
		
//		Date du jour 2eme format
		chaine1 = formateur2.format(date1);
		System.out.println(chaine1);
		
	}

}
