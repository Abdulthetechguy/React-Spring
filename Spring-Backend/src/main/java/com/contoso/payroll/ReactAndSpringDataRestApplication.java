package com.contoso.payroll;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ReactAndSpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactAndSpringDataRestApplication.class, args);


//		ObjectMapper mapper = new ObjectMapper();
//
//		Employee staff = new Employee();
//
//		try {
//
//			// Java objects to JSON file
////			mapper.writeValue(new File("c:\\test\\staff.json"), staff);
//
//			// Java objects to JSON string - compact-print
//			String jsonString = mapper.writeValueAsString(staff);
//
////			System.out.println(jsonString);
//
//			// Java objects to JSON string - pretty-print
//			String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
//
//			System.out.println(jsonInString2);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
