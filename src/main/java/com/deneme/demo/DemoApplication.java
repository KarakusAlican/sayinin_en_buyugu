package com.deneme.demo;
/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static int ikiilecarp(int a) {
		return a * 2;
	}

	public static int ikiiletopla(int a) {
		return a + 2;
	}

	public static int dortilecarp(int a) {

		return a * 4;

	}



	public static void main(String[] args) {
		System.out.println("sonuç =" + dortilecarp(ikiiletopla(ikiilecarp(16))));
	}



	}

*/
public class DemoApplication {
    public static void main(String[]args){
        int enk=0;
        int enb=0;
        int  a[] = {10,30,15,80,40,89,35,66,23,5};

        enb = enBuyuk(a);
        enk = enKucuk(a);

        System.out.println("en büyük sayı = "+enb);
        System.out.println("en küçük sayı =" +enk);


    }

    private static int enBuyuk(int[] arr){
        int enb=0;

        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                enb = arr[0];
            }

            if (arr[i]>enb){
                enb = arr[i];
            }

        }

        return enb;
    }

    private static int enKucuk(int[] arr){
        int en=0;

        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                en = arr[0];
            }

            if (arr[i]<en){
                en = arr[i];
            }

        }

        return en;
    }


}













