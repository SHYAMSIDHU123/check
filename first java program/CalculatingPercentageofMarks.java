package com.company;
import java.io.*;
public class CalculatingPercentageofMarks {
    public static void main(String[] args)throws IOException {
        float sub1,sub2,sub3,total,per;
        int tmax1,tmax2,tmax3,tmax;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 3 subject obtain marks");
        sub1=Float.parseFloat(br.readLine());
        sub2=Float.parseFloat(br.readLine());
        sub3=Float.parseFloat(br.readLine());
        System.out.println("enter there total marks");
        tmax1=Integer.parseInt(br.readLine());
        tmax2=Integer.parseInt(br.readLine());
        tmax3=Integer.parseInt(br.readLine());
        total=sub1+sub2+sub3;
        tmax=tmax1+tmax2+tmax3;
        per=(total/tmax)*100;
        System.out.println("your percentage is "+per);
        //calc
    }
}
