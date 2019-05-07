package com.example.factoryPattern;

import com.example.factoryPattern.Computer;
import com.example.factoryPattern.PC;
import com.example.factoryPattern.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram, hdd, cpu);
		
		return null;
	}
}
