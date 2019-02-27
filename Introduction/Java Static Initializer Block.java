
static byte B,H;
static boolean flag;
static 
{ 
    BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
    try
    {   flag = false;
        B = Byte.parseByte(br.readLine ());
        H = Byte.parseByte(br.readLine ());
        if  (B <= 0 || H <= 0)
        throw new Exception();
        flag = true;
    } 
    catch (Exception e)
    { System.out.println ("java.lang.Exception: Breadth and height must be positive");}
    } 