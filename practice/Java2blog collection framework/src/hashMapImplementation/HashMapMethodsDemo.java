package hashMapImplementation;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HashMapMethodsDemo {
	
	@Test
	public void hashMap_methods_Implementation()
	{
		HashMap<String, String> empDept= new HashMap<String, String>();
		boolean empty=empDept.isEmpty();
		System.out.println("Is employee department empty :- "+empty);
		
		empDept.put("pradeep", "Automation");
		empDept.put("Manish", "functional");
		empDept.put("Navnit", "Developer");
		empDept.put("Afrin", "PMO");
		System.out.println(empDept);
		System.out.println("The size of the department is :"+empDept.size());
		System.out.println("Pradeep department is :"+empDept.get("pradeep"));
		System.out.println("Navnit department is :"+empDept.get("Navnit"));
		
		if(empDept.containsKey("Afrin"))
			System.out.println("Afrin department is :"+empDept.get("Afrin"));
		
		empDept.clear();
		System.out.println(empDept);
		
		System.out.println();
		//user of compute method
		
		HashMap<String, Integer> teamGoalMap= new HashMap<String, Integer>();
		teamGoalMap.put("team1", 1);
		teamGoalMap.put("team2", 1);
		
		teamGoalMap.put("team1", teamGoalMap.get("team1")+1);
		
		teamGoalMap.compute("team2", (team,goal)->goal+1);
		System.out.println(teamGoalMap);
		
		teamGoalMap.computeIfPresent("team2", (team,goal)->goal+1);
		System.out.println(teamGoalMap);
		teamGoalMap.computeIfAbsent("team3", team3->0);
	}

}
