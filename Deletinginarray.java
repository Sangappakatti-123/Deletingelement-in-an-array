package com.jspider.p11;

import java.util.Arrays;

public class Deletinginarray {
  public static void main(String[] args) {
	int[] a= {2,89,2,5,2,42,14,36};
	
		delete(a);	
	}

private static void delete(int[] a) {
	int [] res=new int[a.length-1];
	int x=0;
	for(int i=0;i<=a.length-1;i++) {
		if(i==3) {
			continue ;
		}
		res[x]=a[i];
		x++;
	}
	System.out.println(Arrays.toString(res));
}
}

