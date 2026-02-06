class AccountHolder{
	//static variable
	static String accountHolderName;
	static Long accountNumber=1234876493328L;
static String ifscCode="SBIH253678O";
static Long mobileNumber=9108633340L;
static Float balanceAmount=100000.50f;
static Integer lastTransaction=0005;
static String bankName="State Bank of India";
public static void main(String[] accountDetails){
/*String accountHolderName="Kallesh S C.";
Long accountNumber=1234876493328L;
String ifscCode="SBIH253678O";
Long mobileNumber=9108633340L;
Float balanceAmount=100000.50f;
Integer lastTransaction=0005;
String bankName="State Bank of India";*/
System.out.println("The bank name of the account holder is "+bankName);
System.out.println("The name of the account holder is "+accountHolderName);
System.out.println("Account Number = "+accountNumber);
System.out.println("IFSC code = "+ifscCode);
System.out.println("Mobile Number = "+mobileNumber);
System.out.println("Balance amount is "+balanceAmount+"\n"+lastTransaction);
}
}