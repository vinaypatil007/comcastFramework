package grouping;

import org.testng.annotations.Test;

public class Group3 {
 @Test(groups = "functional")
public void f() {
	System.out.println("f is executed");
}
 @Test(groups = "functional")
public void g() {
	System.out.println("g is executed");
}
 @Test(groups = "integration")
public void h() {
	System.out.println("h is executed");
}
}
