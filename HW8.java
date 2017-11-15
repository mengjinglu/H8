/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw8;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;



/**
 *
 * @author mengjinglu
 */
public class HW8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       PrintStream o = new PrintStream(new File("dir_tree.txt"));
        PrintStream console = System.out;
        System.setOut(o);
        showDir(1, new File("/Users/mengjinglu/NetBeansProjects"));
        o.close();
    }
    static void showDir(int indent, File file) throws IOException{
        
        //System.setOut(console);
        for(int i = 0; i <= indent; i++){
            System.out.print("-");
           
        }
        System.out.println(file.getName());
       
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for(int i = 0; i < files.length; i++){
                showDir(indent + 2, files[i]);
            }
        }
       
    }
}
