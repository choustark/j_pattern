package org.example.dependency;

/**
 * Hello world!
 *
 */
public class InterfaceDependency {
    public static void main( String[] args ) {
        SexWoman sexWoman = new SexWoman();

        FuckAction fuckAction = new FuckAction();
        fuckAction.fuck(sexWoman);
    }

}
interface IFuckAction{
   void fuck(IWoman iWoman);
}
class FuckAction implements IFuckAction{

    @Override
    public void fuck(IWoman iWoman) {
        iWoman.toPlay("sexWoman is very good feel");
    }
}

interface IWoman{
    void toPlay(String feelLevel);

    default void f2() {
            // do sth
    }
    static void f3(){

    }
}
class SexWoman implements IWoman{
    @Override
    public void toPlay(String s) {
        System.out.println(s);
    }
}

