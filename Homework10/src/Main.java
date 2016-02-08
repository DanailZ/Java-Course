
public class Main {
	

		public static void main(String[] args) {
			
			Student[] students = new Student[5];
			students[0] = new Student("Simona", "Ivanova", 501214014, 10);
			students[1] = new Student("Georgi", "Rankov", 501214020, 9);
			students[2] = new Student("Natalia", "Nedqlkova", 501214015, 10);
			students[3] = new Student("Peter", "Griffon", 501214036, 9);
			students[4] = new Student("Veronika", "Tomova", 501214009, 10);
			
			for (int i = 0; i < students.length; i++) {
				String st = students[i].toString();
				System.out.println(st);
			}

		}

	}
