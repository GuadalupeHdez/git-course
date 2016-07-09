package com.qacg;

import com.utils.StringUtils;
import com.qacg.utils.MailUtils;

public class Main {

	public static void main(String[] args) {
		String cadena = "Hola mundo";
		
		System.out.println(StringUtils.toLowerCase(cadena));
		MailUtils.send("mghh_10@hotmail.com");
	}

}
