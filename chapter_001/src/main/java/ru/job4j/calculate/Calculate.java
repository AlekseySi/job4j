package ru.job4j.calculate;


/**
  *Class Calculate решение задачи части 001 урок1.
  *
  *@author Siminko (mailto:alekseysimink@gmail.com)
  *version $Id$
  *@since 14.07.2018
*/
public class Calculate {
	/**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
    	/*
    	Calculate calc = new Calculate();
    	String result = calc.echo("Aleksey");
    	System.out.println(result);
    	*/

		System.out.println("Hello World");
    }

    /**
	*Metod echo.
	*@param name Aleksey 
	*@return Echo plus Aleksey
	*/
	public String echo(String name) {
          return "Echo, echo, echo : " + name;

	
	}
}