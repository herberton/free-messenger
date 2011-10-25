package pattern.singleton;
import java.util.HashMap;  
import java.util.Map;  

import exception.SingletonException;

public class SingletonFactory {
	
	// VARIABLES...
	@SuppressWarnings("rawtypes")
	private final Map<Class, ISingleton> instanceMap = new HashMap<Class, ISingleton>();
	private static final SingletonFactory singletonFactory = new SingletonFactory();
	
	
	// CONSTRUCTORS...
	private SingletonFactory() {};  
    
	
	// GETTERS...
	public static SingletonFactory getSingletonFactory() { return singletonFactory; }
	@SuppressWarnings("unchecked")
	public <T> ISingleton<T> getInstance(Class<T> ofClass) throws SingletonException {  
    	
		ISingleton<T> instance = null;  
        synchronized(ofClass)  
        {
            if (instanceMap.containsKey(ofClass)) {
                instance = instanceMap.get(ofClass);  
            } else {
                try {
					instance = new Singleton<T>(ofClass);
				} catch (InstantiationException e) {
					e.printStackTrace();
					throw new SingletonException(e);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					throw new SingletonException(e);
				}
                instanceMap.put(ofClass, instance);  
            } 
        }
        return instance;
    }
    
	
	// CLASSES...
    private class Singleton<T> implements ISingleton<T>  
    {  
        private T singleton;
          
        Singleton(Class<T> type) throws InstantiationException, IllegalAccessException {
        	this.singleton = type.newInstance();
    	}  
          
        public T getSingleton() { return this.singleton; }  
        //public void setSingleton(T singleton) { this.singleton = singleton; }  
    } 
}
