package doviz;

import java.io.BufferedReader;  
import java.io.*;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DovizModel {
	Float amerikanDolari;
	Float japonYeni;
	Float euro;
	Float sterlin;
	Float kanadaDolar;
	Float frank;
	
	//Amerikan Dolari
	Float amerikanToFrank;
	Float frankToAmerikan;
	Float amerikanToYen;
	Float yenToAmerikan;
	Float amerikanToEuro;
	Float euroToAmerikan;
	Float amerikanToKanada;
	Float kanadaToAmerikan;
	
	//Japon Yeni
	Float yenToEuro;
	Float euroToYen;
	Float yenToSterlin;
	Float sterlinToYen;
	Float yenToKanada;
	Float kanadaToYen;
	Float yenToFrank;
	Float frankToYen;
	
	//Euro
	Float euroToSterlin;
	Float sterlinToEuro;
	Float euroToKanada;
	Float kanadaToEuro;
	Float euroToFrank;
	Float frankToEuro;
	
	//Sterlin
	
	Float sterlinToKanada;
	Float kanadaToSterlin;
	Float sterlinToFrank;
	Float frankToSterlin;
	
	//KanadaDolar
	
	Float kanadaToFrank;
	Float frankToKanada;
	
	//Frank zaten yapildi
	
	public void getDovizData()
	{
		
		try {

			
			URL u = new URL("https://uzmanpara.milliyet.com.tr/dolar-kuru/");
			
			HttpURLConnection hr = (HttpURLConnection)u.openConnection();
			if(hr.getResponseCode() == 200)
			{
				InputStream is =  hr.getInputStream();
				
				StringBuffer sb = new StringBuffer();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String line = br.readLine();
				
				while(line!=null)
				{
					if(line.contains("<td class=\"currency\"><a href=\"/yen-kuru/\"") )
					{
						line = br.readLine();
						line = br.readLine();
						
						String japonyen = line;
						
						
						japonyen = japonyen.replaceAll("\\D+",".");
						japonyen = japonyen.substring(1,japonyen.length()-1);
						japonYeni = Float.parseFloat(japonyen);
						
						System.out.println("100 Japon Yeni= "+japonYeni);
						
					}
					
					if(line.contains("<td class=\"currency\"><a href=\"/dolar-kuru/\""))
					{
						line = br.readLine();
						line = br.readLine();
						
						String amerikandolar = line;
						
						
						amerikandolar = amerikandolar.replaceAll("\\D+",".");
						amerikandolar = amerikandolar.substring(1,amerikandolar.length()-1);
						amerikanDolari = Float.parseFloat(amerikandolar);
						
						System.out.println("Amerikan Dolari= "+amerikanDolari);
						
					}
					
					if(line.contains("<td class=\"currency\"><a href=\"/sterlin-kuru/\""))
					{
						line = br.readLine();
						line = br.readLine();
						
						String Sterlin = line;
						
						
						Sterlin = Sterlin.replaceAll("\\D+",".");
						Sterlin = Sterlin.substring(1,Sterlin.length()-1);
						sterlin = Float.parseFloat(Sterlin);
						
						System.out.println("Sterlin= "+sterlin);
						
					}
					if(line.contains("<td class=\"currency\"><a href=\"/euro-kuru/\""))
					{
						line = br.readLine();
						line = br.readLine();
						
						String Euro = line;
						
						
						Euro = Euro.replaceAll("\\D+",".");
						Euro = Euro.substring(1,Euro.length()-1);
						euro = Float.parseFloat(Euro);
						
						System.out.println("Euro= "+euro);
						
					}
					if(line.contains("<td class=\"currency\"><a href=\"/kanada-dolari-kuru/\""))
					{
						line = br.readLine();
						line = br.readLine();
						
						String kanadadolar = line;
						
						
						kanadadolar = kanadadolar.replaceAll("\\D+",".");
						kanadadolar = kanadadolar.substring(1,kanadadolar.length()-1);
						kanadaDolar = Float.parseFloat(kanadadolar);
						
						System.out.println("Kanada Dolari= "+kanadaDolar);
						
					}
					if(line.contains("<td class=\"currency\"><a href=\"/frank-kuru/\""))
					{
						line = br.readLine();
						line = br.readLine();
						
						String Frang = line;
						
						
						Frang = Frang.replaceAll("\\D+",".");
						Frang = Frang.substring(1,Frang.length()-1);
						frank = Float.parseFloat(Frang);
						
						System.out.println("Isvicre Frangi= "+frank);
						
					}
					
					line = br.readLine();
					
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
	}
	
			public void dovizHesapla(){
			
				
				amerikanToFrank =  (amerikanDolari/frank);
				frankToAmerikan = frank/amerikanDolari;
				amerikanToYen = amerikanDolari/japonYeni;
				yenToAmerikan = japonYeni/amerikanDolari;
				amerikanToEuro = amerikanDolari/euro;
				euroToAmerikan = euro/amerikanDolari;
				amerikanToKanada = amerikanDolari/kanadaDolar;
				kanadaToAmerikan = kanadaDolar/amerikanDolari;
				
				 yenToEuro = japonYeni/euro;
				 euroToYen = euro/japonYeni;
				 yenToSterlin = japonYeni/sterlin;
				 sterlinToYen = sterlin/japonYeni;
				 yenToKanada = japonYeni/kanadaDolar;
				 kanadaToYen = kanadaDolar/japonYeni;
				 yenToFrank = japonYeni/frank;
				 frankToYen = frankToYen;
				 
				 euroToSterlin = euro/sterlin;
				 sterlinToEuro = sterlin/euro;
				 euroToKanada = euro/kanadaDolar;
				 kanadaToEuro = kanadaDolar/euro;
				 euroToFrank = euro/frank;
				 frankToEuro = frank/euro;
				 
				 
				 sterlinToKanada = sterlin / kanadaDolar;
				 kanadaToSterlin = kanadaDolar/sterlin;
				 sterlinToFrank = sterlin/frank;
				 frankToSterlin = frank/sterlin;
				 
				 kanadaToFrank = kanadaDolar/frank;
				 frankToKanada = frank/kanadaDolar;
				 
				 
			}

}