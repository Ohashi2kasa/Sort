package com.ohashi.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Created by ohashi on 2017/02/10.
 */
public class EventLogCopy {
    public static void main(String[] args) throws IOException, InterruptedException {

        for (int j = 1; j < 1000; j++) {
            for (int i=0; i < 10; i++) {

                Path tmpLineFile = Paths.get("D:\\elc-share\\clientModule\\tmp\\192.168.0.1$6.1.0$Security$ja$1486003288421.log");

                Random rnd = new Random();
                int ran = rnd.nextInt(200) +1;

                Path destEventFile = Paths.get("D:\\elc-share\\clientModule\\192.168.0." + ran + "\\output\\192.168.0." + ran + "$6.1.0$Security$ja$1486003288421.log");
                try {
                    if(!Files.exists(destEventFile)) {
                        Files.copy(tmpLineFile, destEventFile, REPLACE_EXISTING);
                        System.out.println(ran);
                    }else{
                        System.out.println(ran + "no copy");
                    }
                    //Thread.sleep(100);

                }catch (Exception e){

                }
            }
            //System.out.println(i + " :count");
            Thread.sleep(20000);
        }
        //Thread.sleep(15000);
    }
}
