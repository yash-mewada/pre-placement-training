import java.util.*;

class Student{
	int sid[] = new int[10];
	String sname[] = new String[10];
	String city[] = new String[10];
	int mob[] = new int[10];

	int i = 0;

	Scanner sc = new Scanner(System.in);
	public void addStudent(){
		System.out.println("Enter Student id: ");
		sid[i] = sc.nextInt();

		System.out.println("Enter Student name: ");
		sname[i] = sc.next();

		System.out.println("Enter Student city: ");
		city[i] = sc.next();

		System.out.println("Enter Student mobile no: ");
		mob[i] = sc.nextInt();
		i++;
	}

	public void updateStudent(){

	}

	public void deleteStudent(){

	}

	public void showStudent(){
		System.out.println("sid\tsname\tcity\tmobile");
		for (int j = 0;j < i ;j++ ) {
			System.out.println(sid[j]+"\t"+sname[j]+"\t"+city[j]+"\t"+mob[j]);
		}
	}
}

class P15{
	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("Select Options: ");
			System.out.println("1: Add student");
			System.out.println("2: Edit student");
			System.out.println("3: Delete student");
			System.out.println("4: Show student");
			System.out.println("5: Exit");

			int ch = sc.nextInt();

			switch (ch) {
				case 1: s.addStudent();
					break;
				case 2: s.updateStudent();
					break;
				case 3: s.deleteStudent();
					break;
				case 4: s.showStudent();
					break;
				case 5: System.exit(0);
			}
		}
	}
}