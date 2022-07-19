package RIS.Rispackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;

public class RIS_DataProviders {
	
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
	
	
	
	@DataProvider(name = "AddPersionPatient_AllFields")
	public Iterator<Object[]> AddPersionPatient_AllFields() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_RIS/AddPationesPersian.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddPatientForeign_Free")
	public Iterator<Object[]> AddPatientForeign_Free() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_RIS/AddPatientForeign_Free.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	@DataProvider(name = "AddPersionPatient_bornOutOfIranAndFree")
	public Iterator<Object[]> AddPersionPatient_bornOutOfIranAndFree() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_RIS/AddPersionPatient_bornOutOfIranAndFree.csv"),',','\'',1);
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