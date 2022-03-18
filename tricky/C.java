package tricky;

public class C {
	public static void main(String args[]) 
    { 
		
        String GfG[] = { "a", "b", "c", "a", "c" }; 
        for (int i = 0; i < GfG.length; i++) 
            for (int j = i + 1; j < GfG.length; j++) 
                if (GfG[i].compareTo(GfG[j]) == 0) 
                    System.out.print(GfG[j]); 
    } 
}
