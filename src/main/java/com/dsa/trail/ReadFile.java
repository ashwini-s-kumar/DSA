package com.dsa.trail;

/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class ReadFile
{
    public static void main(String[] args)
    {
        String line = "";
        String splitBy = ",";
        try
        {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ashwini.s\\OneDrive - HealTech Software India Pvt Ltd\\Documents\\DSA\\src\\main\\java\\com\\dsa\\trail\\excel.txt"));

            File f1 = new File("sql.txt");
            if(!f1.exists()) {
                f1.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            //bw.write("use dataadapter_appdynamics;\ndelete from a1_logscan_heal_instance_mapper;\n");
            int num =2;
            //System.out.println("Done");
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] item = line.split(splitBy);// use comma as separator
                bw.write("insert into a1_logscan_heal_instance_mapper values(\"" + item[0]+"\",\"" +item[1]+"\",\""+item[2]+ "\");\n");
                num++;
            }
            bw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

