package com.company.examples.module2.ex019_anno;

@MyAnno(num = 42, str = "Hello world")
public class SomeClass {

    @MyAnno(num = 1, str = "str")
    private int field1;
    private String field2;

    public SomeClass(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    @MyAnno(num = 1, str = "str")
    public int getField1() {
        return field1;
    }

    public void setField1(
            @MyAnno(num = 1, str = "str") int field1
    ) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
}
