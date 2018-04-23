import java.util.Scanner;
import java.util.StringTokenizer;
class Customers {
    private String data;
    private static Scanner scanner = new Scanner(System.in);
   
    public Customers() {
    	System.out.println("Enter the \"Name, DD/MM/YYYY\"");
    	data = scanner.nextLine();
    }
    
    public void assignDobToken(StringTokenizer st, String token[]) {
    	int i = 0;
    	while(st.hasMoreTokens()) {
    		token[i++] = st.nextToken();
    	}
    }

    public void show(String name, String dob[]) {
    	StringBuilder sb = new StringBuilder(name);
    	sb.append(","+ dob[0] + ","+ dob[1] + "," + dob[2]);
    	System.out.println(sb);
    }
    public static void main(String [] args) {
    	Customers customers = new Customers();
    	StringTokenizer st = new StringTokenizer(customers.data, ",");
    	String name = st.nextToken();
    	String dob = st.nextToken();
    	
    	StringTokenizer st1 = new StringTokenizer(dob, "/");
    	
    	String tokenizeDob[] = new String[3];
    	customers.assignDobToken(st1, tokenizeDob);
    	customers.show(name, tokenizeDob);
    	
    }
}