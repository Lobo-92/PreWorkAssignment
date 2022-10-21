package com.gl.companystocks;

import java.util.Scanner;

public class Stockers {
	
	public double num_companies, stock_prices;
	public double comp[], L[], R[];
	public boolean status = false;
	
	Scanner sc = new Scanner(System.in);
	
	public void Stockdetails() {
		System.out.println("Dear Invester,");
		System.out.println("Welcome to Stockers portal.");
		System.out.println();
		System.out.println("Enter the number of companies.");
		num_companies = sc.nextInt();
		comp = new double [(int) num_companies];
		
		System.out.println("Enter the stock prices of each company.");
		insertValues();
		
		sortArray(comp, 0, comp.length-1);
		System.out.println("Stocks after sorting.");
		printValues();
		
	}
	
	public void insertValues() {
		for(int i=0; i<num_companies; i++) {
			System.out.println("The stock price of company " +(i+1)+ ":");
			comp[i] = sc.nextDouble();
		}
	}
	
	public void sortArray(double arr[], int l, int r){
		
		if(l < r) {
			int m = (l+r)/2;
			sortArray(comp, l, m);
			sortArray(comp, m+1, r);
			
			conquerArray(comp, l, m, r);
		}
	}
	
	public void conquerArray(double array[], int l, int m, int r) {
		
		int n1 = m-l + 1;
		int n2 = r - m;
		
		double L[] = new double[n1];
		double R[] = new double[n2];
		
		for(int i=0; i<n1; ++i) {
			L[i] = array[l + i];
		}
		for(int j=0; j<n2; ++j) {
			R[j] = array[m+1 + j];
		}
		
		int i =0, j=0;
		int k = l;
		
		while (i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			}else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while (i<n1) {
		array[k] = L[i];
		i++;
		k++;
		
		}
		while(j<n2) {
		array[k] = R[j];
		j++;
		k++;
		}		
	}
	
	public void reverseArray() {
		for(int i=0; i < comp.length/2; i++) {
			double temp = comp[i];
			comp[i] = comp[comp.length - i -1];
			comp[comp.length - i -1] = temp;
		}
	}
	public void printValues() {
		System.out.println("Stock prices is shared below: ");
		for(int i=0; i < comp.length; i++) {
			System.out.println(comp[i]);
		}
	}
	
	public void Search() {
		
		double search_ele;
		Stockers search = new Stockers();
		search.sortArray(comp, 0, comp.length);
		search_ele = sc.nextDouble();
		
		for(int i=0; i<comp.length; i++) {
			if(search_ele == comp[i]) {
				System.out.println("Found the search element");
			}else
				System.out.println("Element not found.");
		}
	}
}
