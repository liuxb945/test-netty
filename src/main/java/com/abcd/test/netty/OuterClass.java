package com.abcd.test.netty;

public class OuterClass {
    private String name ;
    private int age;
    
    public void display(){
        System.out.println("name：" + getName() +"   ;age：" + getAge());
    }

    /**省略getter和setter方法**/

    public class InnerClass{
        public InnerClass(){
            setName("chenssy");
            setAge(23);
        }

        public void display(){
            System.out.println("name：" + getName() +"   ;age：" + getAge());
        }
        
        public OuterClass getOuterClass(){
            return OuterClass.this;
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
//        innerClass.display();
        innerClass.getOuterClass().display();
    }

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
}
