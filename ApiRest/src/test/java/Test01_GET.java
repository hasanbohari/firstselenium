
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {
	
	@Test
	void test_01(){
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody());
		System.out.println(response.statusCode());
		System.out.println(response.getHeader("ABC"));
		System.out.println(response.getTime());
		
	}
	

	}

