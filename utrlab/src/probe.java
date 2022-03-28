import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class probe {
	
	
	public static void main(String args[]) throws IOException {
		LinkedHashSet<TreeSet<String>> svaStanja = new LinkedHashSet<TreeSet<String>>();
        boolean zarez;
        boolean vertikala=false;
        TreeSet<String> x = new TreeSet<String>();
        x.add("eks");
        x.add("keks"); 
        x.add("zeks"); 
        svaStanja.add(x);
        x = new TreeSet<String>();
        x.add("eRTks");
        x.add("kRTeks"); 
        x.add("zRTeks"); 
        svaStanja.add(x);
        x = new TreeSet<String>();
        x.add("eTks");
        x.add("kTeks"); 
        x.add("zTeks"); 
        svaStanja.add(x);
        
		 for(TreeSet<String> r: svaStanja) {
         	if(vertikala) {
         		System.out.printf("|");
         	}
         	zarez = false;
         	for(String y: r) {
         		if(zarez) {
         			System.out.printf(",");
         		}
         		System.out.printf("%s", y);
         		zarez = true;
         	}
         	vertikala = true;
         }
   }
}

