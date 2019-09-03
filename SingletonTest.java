package com.collabera.singleton;

class Singleton {
    private static volatile Singleton instance = null;
     String payload;
   
    private Singleton() {
    	 payload = "PUSH THAT CART!";
     }
    
 
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // Double check
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

 class SingletonTest{
	 
	 public static void main(String[] args) {
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println(newInstance.payload);
	}
	 
 }