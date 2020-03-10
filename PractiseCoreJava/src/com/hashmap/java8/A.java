public class Test{

static Test t=null;

private Test(){

}

public static Test getTest(){

if(t==null){
	synchronized(Test.class) {
		t=new Test();
	}

}

return t;
}

public static void main(String[] args){
Test t=Test.getTest();
System.out.println(t);
}
}