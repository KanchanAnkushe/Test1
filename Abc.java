class Parent{
    public void test(){
        System.out.println("we can access parent class properties from child");
    }
}

public class Abc {
    public static void main(String[] args) {
        System.out.println("here IS-A relation between IsHasRelation IS-A Parent");
        IsHasRelation is = new IsHasRelation();
        Parent pr=new Parent();
        pr.test();
    }
}
