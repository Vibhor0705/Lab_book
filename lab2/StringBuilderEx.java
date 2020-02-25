package lab2;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("one");
		System.out.println(builder);
		builder.append("two").append("three").append("four");
		System.out.println(builder);
		String str = builder.toString();
		System.out.println(str);
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for (int element:arr) {
			System.out.println(element);
		}
	}

}
