import java.util.*;

class B04 {
  
  public static void main(String[] args) {
    new B04().start();
  }
  
  private void start() {
    Scanner s = new Scanner(System.in);
    System.out.print("연봉 원단위 입력하세요.");
    long sal = s.nextInt();
    check(sal);
  }
  
  private void check(long s) {
	 long tax = 0;
			 
	if(s>=80000000) {
		tax = Math.round(s * 0.37);
	}
	else if(s>=40000000) {
		tax = Math.round(s * 0.28);
	} else if(s>=10000000) { 
		tax = Math.round(s * 0.19);
	} else if(s>=0) {
		tax = Math.round(s * 0.095);
	}
	 System.out.println("연봉 금액에 대한 소득세는 "+tax+"입니다.");
  }
}
