package grouping;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups = "adhoc")
public void d() {
	System.out.println("d is executed");
}
	@Test(groups = "functional")
public void e() {
System.out.println("e is executed");
}
}
