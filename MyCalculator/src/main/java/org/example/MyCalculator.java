package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyCalculator {
	int a;
	int b;
	public int sum(int a , int b){
		return a+b;
	}
}
