public class Test{

static Test t=null;

private Test(){

}

public static Test getTest(){

if(t==null){
t=new Test();
}

}

public static void main(String[] args){
Test t=Test.getTest();
System.out.println(t);
}
}