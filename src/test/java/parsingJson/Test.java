package parsingJson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		
		byte[] jsonData=Files.readAllBytes(Paths.get("E:\\Workspace\\jsonParsingBatch3\\FirstJsonParsing.json"));
	
		ObjectMapper mapper= new ObjectMapper();
		
		Person person=mapper.readValue(jsonData, Person.class);
		
		System.out.println(person.getEmail());
		System.out.println(person.getAge());
		
		System.out.println(person.getAddress().getCountry());
		
		System.out.println(person.getAddress().getabc().getPin());
		
		
		
		
	}
	
	public Test get()
	{
		return new Test();
	}
	
	

}
