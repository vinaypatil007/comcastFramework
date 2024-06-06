package grouping;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = {"smoke","integration"})
public void a() {
	System.out.println("a has been excecuted");
}
	@Test(groups = "integration")
public void b() {
	System.out.println("b has been executed");
}
	@Test(groups = "adhoc")
public void c() {
	System.out.println("c has been executed");
}
}

