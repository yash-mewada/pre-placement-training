import java.util.*;

class P12{
	public static void main(String[] args) {
		String[] strArray = {"yash","neha","gaurav","yash","neha"};

		for (int i = 0;i < strArray.length ;i++ ) {
			for (int j = i+1;j < strArray.length ;j++ ) {
				if(strArray[i].equals(strArray[j]) && (i != j)){
					System.out.println("Duplicate string: " + strArray[j]);
				}
			}
		}
	}
}