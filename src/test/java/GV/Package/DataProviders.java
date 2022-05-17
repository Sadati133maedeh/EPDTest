package GV.Package;

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
				new FileReader("./src/test/resources/data/CSVFiles_GV/Login.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	
	
	@DataProvider(name = "AddSpeciality")
	public Iterator<Object[]> AddSpeciality() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddSpeciality.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddLicense")
	public Iterator<Object[]> AddLicense() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddLicense.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddInsurance")
	public Iterator<Object[]> AddInsurance() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddInsurance.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddCenterPart")
	public Iterator<Object[]> AddCenterPart() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddCenterPart.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "Service_Search")
	public Iterator<Object[]> Service_Search() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/Service_Search.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "DeActive_GroupService")
	public Iterator<Object[]> DeActive_GroupService() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/DeActive_GroupService.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}

	@DataProvider(name = "clippingServiceName")
	public Iterator<Object[]> clippingServiceName() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/clippingServiceName.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "CopyServiceName")
	public Iterator<Object[]> CopyServiceName() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/CopyServiceName.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "CheckCopyServiceName")
	public Iterator<Object[]> CheckCopyServiceName() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/CheckCopyServiceName.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddTarrif")
	public Iterator<Object[]> AddTarrif() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddTarrif.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}

	@DataProvider(name = "EditTarrif")
	public Iterator<Object[]> EditTarrif() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/EditTarrif.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "DeActiveActiveTarrif")
	public Iterator<Object[]> DeActiveActiveTarrif() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/DeActiveActiveTarrif.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	@DataProvider(name = "StandardizationTarrif")
	public Iterator<Object[]> StandardizationTarrif() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/StandardizationTarrif.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	@DataProvider(name = "AddK")
	public Iterator<Object[]> AddK() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddK.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "EditTarrifK")
	public Iterator<Object[]> EditTarrifK() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/EditTarrifK.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}
	
	@DataProvider(name = "DeleteTariffk")
	public Iterator<Object[]>DeleteTariffk () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/DeleteTariffk.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}
	
	@DataProvider(name = "AddFixPrice")
	public Iterator<Object[]>AddFixPrice () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddFixPrice.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}
	
	@DataProvider(name = "SearchService_Add")
	public Iterator<Object[]>SearchService_Add () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/SearchService_Add.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}

	@DataProvider(name = "SearchTariffContract")
	public Iterator<Object[]>SearchTariffContract () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/SearchTariffContract.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}

	@DataProvider(name = "SearchService_Show")
	public Iterator<Object[]>SearchService_Show () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/SearchService_Show.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}
	
	@DataProvider(name = "AddFixPriceRepetitious")
	public Iterator<Object[]>AddFixPriceRepetitious () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddFixPriceRepetitious.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}
	
	@DataProvider(name = "EditFixPrice")
	public Iterator<Object[]>EditFixPrice () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/EditFixPrice.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}
	
	@DataProvider(name = "DeleteFixPrice")
	public Iterator<Object[]>DeleteFixPrice () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/DeleteFixPrice.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}

	@DataProvider(name = "AddInsuranceContract")
	public Iterator<Object[]>AddInsuranceContract () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddInsuranceContract.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}
	
	@DataProvider(name = "AddContractType")
	public Iterator<Object[]>AddContractType () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddContractType.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}


	@DataProvider(name = "EditInsuranceContract")
	public Iterator<Object[]>EditInsuranceContract () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/EditInsuranceContract.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}

	@DataProvider(name = "AddeInsuranceAllocation")
	public Iterator<Object[]>AddeInsuranceAllocation () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddeInsuranceAllocation.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}

	@DataProvider(name = "SearchInsuranceAllocationList")
	public Iterator<Object[]>SearchInsuranceAllocationList () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/SearchInsuranceAllocationList.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}
	@DataProvider(name = "AddInsuranceContract_Repetitious")
	public Iterator<Object[]>AddInsuranceContract_Repetitious () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddInsuranceContract_Repetitious.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

	}



} 