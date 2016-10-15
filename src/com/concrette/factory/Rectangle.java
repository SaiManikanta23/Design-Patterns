package com.concrette.factory;

import com.interfaces.factory.*;

public class Rectangle implements Shape {
	
	public void draw()
	{
		System.out.println("We Are Inside Rectangle Class Implementing Draw Method");
		System.out.println("_____");
		System.out.println("|____|");
	}

}
