package junitTask;
import stringUpdate.Removecharacter;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestString {

	Removecharacter r=new Removecharacter();
	@Test
	public void test() {
		String ans=r.removeA("ABCD");
		assertEquals("BCD",ans);
	}
	@Test
	public void test1()
	{
		String ans=r.removeA("AACD");
		assertEquals("CD",ans);
	}
	@Test
	public void test2()
	{
		String ans=r.removeA("BACD");
		assertEquals("BCD",ans);
	}
	@Test
	public void test3()
	{
		String ans=r.removeA("AA");
		assertEquals("",ans);
	}
	@Test
	public void test4()
	{
		String ans=r.removeA("A");
		assertEquals("",ans);
	}
	@Test
	public void test5()
	{
		String ans=r.removeA("B");
		assertEquals("B",ans);
	}

}
