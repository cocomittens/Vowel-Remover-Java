import java.util.Scanner;

class disemvoweler{

	public static boolean isVowel(String c){
            return "aeiou".indexOf(c) != -1;
	}

	public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            s = s.replaceAll("\\s", "");
            String newS = "", vowelS="", ch="";
            for(int i=0; i<s.length()-1; i++){
                    ch =  s.substring(i, i+1);
                    if(isVowel(ch))
                            vowelS += ch;
                    else if(ch != "")
                            newS += ch;			
            }
            System.out.println(newS);
            System.out.println(vowelS);
	}
}