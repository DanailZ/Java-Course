package RemoteSystemsTempFiles;
import java.*;
import java.util.HashSet;

public class Townmain {

	public static void main(String[] args) {
		
		HashSet<Town> set = new HashSet<Town>();
		Town Sofia = new Town("Sofia","Bulgaria",2000000);
		Town Burgas = new Town("Burgas","Bulgaria",546789);
		Town Paris = new Town("France","PrayForParis",2000000);
		Town USA = new Town("USA","WashingtonDC",24356789);
		Town India = new Town("Maroco:D ","India",2000000);
		
		set.add(Sofia);
		set.add(Burgas);
		set.add(Paris);
		set.add(USA);
		set.add(India);
		
		if(set.contains(Sofia)){
			set.remove(Sofia);
		}
		
		

	}

}
