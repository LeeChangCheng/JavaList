import java.util.ArrayList;
import java.util.Iterator;

class Person
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}


public class ListDemo03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
ArrayList a=new ArrayList();
Person b=new Person("张山",32);
a.add(new Person("张山",32));
a.add(new Person("张山",45));
a.add(new Person("张山",87));
a.add(new Person("张山",32));
a.add(new Person("张山",95));
a.add(b);
for(Iterator it=a.iterator(); it.hasNext();)
{
	//System.out.println(it.next());
	Person p=(Person)it.next();//it.next()返回的是Object类
	System.out.println(p.getName()+"    "+p.getAge());
}
	}

}
