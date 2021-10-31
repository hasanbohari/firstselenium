import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Test_post {
	@Test
	public void test_02()
	{
		
		 JSONObject request = new JSONObject();
		 request.put("name", "Hasan");
	     request.put("Job", "Tester");
//	     System.out.println(request);
	     System.out.println(request.toJSONString());
	     
	     given().
	     
	         body(request.toJSONString()).
	     when().
	         
	         post("https://reqres.in/api/users").then().statusCode(201);
	    
	}	

}
