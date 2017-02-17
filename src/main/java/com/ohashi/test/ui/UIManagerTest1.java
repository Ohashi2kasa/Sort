package com.ohashi.test.ui;
import javax.swing.UIManager;
import javax.swing.LookAndFeel;
/**
 * Created by ohashi on 2017/02/07.
 */
public class UIManagerTest1 {
    public static void main(String[] args){
        UIManager.LookAndFeelInfo infos[] = UIManager.getInstalledLookAndFeels();

        System.out.println("getClassName:");

        for(int i = 0 ; i < infos.length ; i++){
            System.out.println(infos[i].getClassName());
        }

        System.out.println("getName:");

        for(int i = 0 ; i < infos.length ; i++){
            System.out.println(infos[i].getName());
        }
        String laf = UIManager.getSystemLookAndFeelClassName();
        System.out.println(laf);
    }
    }

