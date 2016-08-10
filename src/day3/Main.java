package day3;

import java.io.*;
//import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("student.txt");
		BufferedReader read = null;
		BufferedWriter write = null;
		try {

			if (f.exists()) {
				read = new BufferedReader(new FileReader(f));
				Student stud;
				stud = new Student(read.readLine()+"", read.readLine()+"", read.readLine()+"");
				System.out.println(stud);
			} else {
				f.createNewFile();
				Student stud = new Student("Giovanny Roman", "Illinois", "Chicago");
				write = new BufferedWriter(new FileWriter(f));
			
				write.write(stud.getName());
				write.newLine();
				write.write(stud.getState());
				write.newLine();
				write.write(stud.getCity());
				write.flush();
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (read != null) {
				try {
					read.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			if (write != null) {
				try {
					write.close();
				} 
				catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
