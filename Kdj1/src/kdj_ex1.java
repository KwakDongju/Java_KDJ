import java.util.Scanner;

interface Stack {
	   int length(); // 현재 스택에 저장된 개수 리턴
	   int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	   String pop(); // 스택의 톱(top)에 실수 저장
	   boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
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
	      System.out.print("총 스택 저장 공간의 크기 입력 >> ");
	      int num = scan.nextInt();
	      StringStack stack = new StringStack(num);
	      while(true) {
	         System.out.print("문자열 입력 >> ");
	         String Value = scan.next();
	         if(Value.equals("그만"))
	            break;
	         if(!stack.push(Value)) {
	            System.out.println("스택이 꽉 차서 푸시 불가!"); }}
	      System.out.print("스택에 저장된 모든 문자열 팝 : ");
	      int Length = stack.length();
	      for(int i=0; i<Length; i++) {
	         String Stack = stack.pop();
	         System.out.print(Stack+" ");
	      }
	      scan.close();
		}
}