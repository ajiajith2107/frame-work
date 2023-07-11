package STEPDEFINITION;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("the following clubs and their stadiums")
	public void the_following_clubs_and_their_stadiums(DataTable args) {

		List<String> asList = args.asList();
		String string = asList.get(2);
	
		//System.out.println(string+"=========");
		
		System.out.println("==========asLists  Example==========");
		List<List<String>> asLists = args.asLists();
		
		
		for (List<String> list : asLists) {
			
			System.out.println(list);
		}
	}

	@Then("i will check the status")
	public void i_will_check_the_status(DataTable dataTable) {

		Map<Object, Object> asMap = dataTable.asMap(String.class, String.class);

		
		Object object = asMap.get("AS Roma");
		System.out.println("==========asMaps  Example==========");
		
		
		List<Map<String, String>> asMaps = dataTable.asMaps();
		for (Map<String, String> map : asMaps) {
			
			
			String string = map.get("username");
			System.out.println(string);
			
			
		}
	//	System.out.println(object+"tttttttttttt");
	}


@Given("luanh the twiter")
public void luanh_the_twiter() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("validate the login")
public void validate_the_login(DataTable dataTable) {
	
	List<String> asList = dataTable.asList();
	for (String string : asList) {
		System.out.println(string);
	}
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
   
}



}