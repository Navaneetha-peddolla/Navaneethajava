package com.navi;

public class AreaOfFigures {

	public static void main(String[] args) {
		int length,breadth,side,pi,r,area;
		length=2;
		breadth=5;
		side=5;
		r=5;
		pi=3;
		
		area=side*side;
		System.out.println("Area of Square of side="+side+ " is " +area);
		
		area=length*breadth;
		System.out.println("Area of Rectangle of length="+length+" and breadth="+breadth+ " is " +area);
		 
		area=pi*r*r;
		System.out.println("Area of Circle of radius=" +r+" is " +area);
		
		

	}

}
