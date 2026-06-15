package src.com.java17;

public class GrandChildExample {
  public static void main(String[] args){
      Parent parent = new GrandChild();
      parent.parentMethod();
  }
}

sealed class Parent permits Child {
    public void parentMethod() {
        System.out.println("Parent method");
    }
}

non-sealed class Child extends Parent {
    public void childMethod() {
        System.out.println("Child method");
    }
}

class GrandChild extends Child {
    // GrandChild inherits both parentMethod() and childMethod()

}