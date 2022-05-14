package cis.cispackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;

public class DataProviders {
	
	@DataProvider(name = "Login")
	public Iterator<Object[]> Login () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_CIS/Login.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	
	
	@DataProvider(name = "AddPationesPersian")
	public Iterator<Object[]> AddPationesPersian() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_CIS/AddPationesPersian.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddPationesForeign")
	public Iterator<Object[]> AddPationesForeign() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_CIS/AddPationesForeign.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AdmitData")
	public Iterator<Object[]> AdmitData() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_CIS/AdmitData.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddPationesPersianInAdmit")
	public Iterator<Object[]> AddPationesPersianInAdmit () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_CIS/AddPationesPersian&Admit.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}

	} 