package summerschool.sentiment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan=new Scanner(new File("geo_100.csv"));
		PrintWriter pw=new PrintWriter("100output.txt");
		while(scan.hasNextLine()){
			String line=scan.nextLine();
			String[] cols=line.split(",");
			int d1=Integer.parseInt(cols[2]);
			int d2=Integer.parseInt(cols[3]);
			for(int i=0;i<d2;i++){
				pw.print(cols[0]+","+cols[1]+","+(double)(d2)/d1+",");
				System.out.println(cols[0]+","+cols[1]+","+(double)(d2)/d1);
			}
		}
		pw.flush();
	}

}
