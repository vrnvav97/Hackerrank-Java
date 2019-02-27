import java.io.*;
import java.util.*;
class A
 { 
public static void main (String []p)  throws 

Exception
{ 
int i =0;
String s;
BufferedReader br = new BufferedReader ( new 

InputStreamReader (System.in)) ;
loop:
while (true)
{ 
 s = br.readLine ();
StringTokenizer st = new StringTokenizer (s); 
while ( st.hasMoreTokens())
{ 
 if (st.nextToken().equals("end-of-file."))
break loop;
} 
System.out.println (++i + " " + s);
}

System.out.println (++i + " " +s);
} }