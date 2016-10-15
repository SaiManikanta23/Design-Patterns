package com.concrette.factory;

import com.interfaces.factory.*;

public class Square implements Shape {
	
	public void draw()
	{
		System.out.println("We Are Inside Square Class Implementing Draw Method");
		System.out.println("___");
		System.out.println("|__|");
	}

}
