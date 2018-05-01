package com.ele.me.Java8.interfaces;

public class LabbadaFunctionTest {

    public static void main(String args[]){

       /* //jdk 1.8以前
        UserTest userTest = new UserTest() {
            @Override
            public int  test(int x,int y) {
                System.out.println("匿名内部类实现");
                return x+y;
            }
        };

        int tt = userTest.test(6,4);
        System.out.println(tt);


        //labamda

        UserTest ut = (x,y) ->{
            System.out.println("lambda表达式实现");
            return x+y;

        };
        int result = ut.test(5,3);
        System.out.println(result);
*/

        UserTest ut = (z) -> z+10;
        int o1= ut.testY(12);
        System.out.println(o1);
    }


}

@FunctionalInterface
 interface UserTest{

    //int  test(int x,int y);

    int testY(int z);
}
