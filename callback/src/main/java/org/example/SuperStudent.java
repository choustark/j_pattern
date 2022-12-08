package org.example;

/**
 * 优秀的学生类
 */
@Deprecated
public class SuperStudent implements DoJob {
    @Override
    public void fillBlank(int a, int b, int result) {

    }

    @Override
    public String fillBlank2(int a, int b) {
        return "牛掰的学生运算得到的结果为：a + b" + a + b;
    }
}
