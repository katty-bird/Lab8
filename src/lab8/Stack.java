package lab8;

/**
 * This class contains the new Abstract Data Type - Stack
 * @author katja
 * @author lana
 * @version 0.1
 */

public interface Stack<T> {

	//Methods
	abstract void push(T element);
	
	abstract T pop();
	
	abstract boolean isEmpty();
	
	abstract T peek();
	
	abstract long getSize();

}
