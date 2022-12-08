package org.example;

@Deprecated
public class Student03 {

    public DoJob doJob;

    private String name;

    public Student03() {
    }

    public Student03(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void calculateTitle(int a, int b) {
        if (a > 10 || b > 10) {
            // 大于10 需要求助,算力不够需要请求帮助
            String askHelp = askHelp(a, b, doJob);
            System.out.printf(askHelp);
        }
        System.out.printf("学生运算得到的结果为：a + b" + a + b);

    }

    public String askHelp(int a,int b,DoJob job) {
        return job.fillBlank2(a,b);
    }
}
