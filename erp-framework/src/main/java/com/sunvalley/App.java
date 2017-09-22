package com.sunvalley;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {

            System.out.print(" demo-test set key test with value 'testing'");
            RedisUtil.set("test","testing");

           String key = RedisUtil.get("test");
           System.out.print("get key test values:"+key);

        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }


    }
}
