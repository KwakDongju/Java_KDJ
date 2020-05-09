import java.util.Scanner;

interface Stack {
	   int length(); // ���� ���ÿ� ����� ���� ����
	   int capacity(); // ������ ��ü ���� ������ ���� ����
	   String pop(); // ������ ��(top)�� �Ǽ� ����
	   boolean push(String val); // ������ ��(top)�� ����� �Ǽ� ����
	}

	class StringStack implements Stack {
	   private int Num;
	   private int Save;
	   private String[] Stack;
	   public StringStack(int num) {
	      this.Num = num;
	      this.Save = 0;
	      Stack = new String[num];}
	   public int length() { return Save; }
	   public int capacity() {
	      return Stack.length; }
	   public String pop() {
	      if(Save-1 < 0)
	         return null;
	      Save--; //
	      String s = Stack[Save];
	      return s;}
	   public boolean push(String val) {
	      if(Save < Num) {
	         Stack[Save] = val;
	         Save++;
	         return true;}
	      else return false; }}

public class kdj_ex1 {
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
	      int num = scan.nextInt();
	      StringStack stack = new StringStack(num);
	      while(true) {
	         System.out.print("���ڿ� �Է� >> ");
	         String Value = scan.next();
	         if(Value.equals("�׸�"))
	            break;
	         if(!stack.push(Value)) {
	            System.out.println("������ �� ���� Ǫ�� �Ұ�!"); }}
	      System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
	      int Length = stack.length();
	      for(int i=0; i<Length; i++) {
	         String Stack = stack.pop();
	         System.out.print(Stack+" ");
	      }
	      scan.close();
		}
}