package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Testing {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		List<Employee> list = new ArrayList<Employee>(Arrays.asList(new Employee(12, "Devraj", "Poojaree"),
				new Employee(14, "Dev", "Pooja"), new Employee(17, "Don", "Poojaree")));
		// serialization
		FileOutputStream file = new FileOutputStream("C:\\Users\\DHIRAGEP\\Desktop\\Serialization\\emp.ser");
		ObjectOutputStream objectStream = new ObjectOutputStream(file);
		objectStream.writeObject(list);
		file.close();
		objectStream.close();

		// Deserialization

		FileInputStream fileInput = new FileInputStream("C:\\Users\\DHIRAGEP\\Desktop\\Serialization\\emp.ser");
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		List<Employee> li = (List<Employee>) objectInput.readObject();
		li.forEach(System.out::println);
	//	System.out.println(e1.getId() + " " + e1.geteNmae() + " " + e1.getAddress());
		fileInput.close();
		objectInput.close();
		

	}

}
