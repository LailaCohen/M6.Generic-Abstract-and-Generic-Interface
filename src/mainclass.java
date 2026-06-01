package MainClass;
	import java.util.ArrayList; 
	// part 4 
	interface Printable{
		void print();
	}
	//part 1
	abstract class ListPrinter<T> implements Printable{
		protected ArrayList<T> list;
	//class ListPrinter<T> { 
	 //   private ArrayList<T> list; 
	    public ListPrinter(ArrayList<T> list) { 
	        this.list = list; cfc
	    } 
	    @Override
	    public abstract void print();
	}
	// part 2
	class SringListPrinter extends Listprinter<String>{
		public void print() {
			super(list);
		}
		@Override
	    public void printList() { 
	        for (T item : list) { 
	            System.out.println(item); 
	        } 
	    } 
	} 
	// part 3 
	class IntegerListPrinter extends Listprinter<String>{
		public IntegerListPrinter printer(ArrayList<Integer>list) {
			super(list);
		}
		@Override
		  public void print() { 
	        for (Integer item : list) { 
	            System.out.println("Value"+item);
	        }
		}
	}
	public class mainclass {
	    public static void main(String[] args) { 
	        ArrayList<String> citiesList = new ArrayList<>(); 
	        citiesList.add("San Francisco"); 
	        citiesList.add("Paris"); 
	        citiesList.add("Lima"); 
	        citiesList.add("Saigon"); 
	        citiesList.add("Bangkok"); 
	        citiesList.add("Tokyo"); 
	        citiesList.add("Cairo");      
	    } 
	} 
	//1. Modify class ListPrinter<T> using abstract class. First,
	// you declare an abstract class, ListPrinter<T>, to provide member variables and methods that are shared by all subclasses, such as ArrayList<T> list, Generic ListPrinter(ArrayList<T> list) and the abstract void print() method. The abstract print() method needs to be implemented by all subclasses but must be implemented in different ways. 
	// The ListPrinter<T> class can look something like this:  
	abstract class ListPrinter<T> { 
	    protected ArrayList<T> list;  
	    public ListPrinter(ArrayList<T> list) { 
	        //Your code goes here 
	    } 
	    public abstract void print(); 
	} 
	//Complete the code where the “Your code goes here” is for the abstract class ListPrinter<T>. 
//	2. Continuing with your answer to the previous question, complete the sections where it says “Your code goes here” to create a subclass of ListPrinter, such as StringListPrinter and provide implementation for the print method. Your subclasses can look something like this: 
	class StringListPrinter extends ListPrinter<String> { 
	    public StringListPrinter(ArrayList<String> list) { 
	        //Your code goes here 
	    } 
	    @Override 
	    public void print() { 
	        //Your code goes here 
	    } 
	} 
//	Use the following code to test your changes: 
	public class Main { 
	    public static void main(String[] args) { 
	        ArrayList<String> citiesList = new ArrayList<>(); 
	        citiesList.add("San Francisco"); 
	        citiesList.add("Paris"); 
	        citiesList.add("Lima"); 
	        citiesList.add("Saigon"); 
	        citiesList.add("Bangkok"); 
	        citiesList.add("Tokyo"); 
	        citiesList.add("Cairo"); 
	        StringListPrinter printer = new StringListPrinter(citiesList); 
	        printer.print(); 
	} 
//	3. Create another subclass IntegerListPrinter that inherits all properties of the abstract class ListPrinter. Also modify MainClass to test your changes. Hint: Code is similar to #2.  
//	4. Modify the code from the previous question to implement an interface. Note that you must implement all of the interface's print() methods. Use MainClass in previous question to test your code. Your code can look something like this: 
	interface Printable { 
	    //Your code goes here 
	}  
	abstract class ListPrinter<T> implements Printable { 
	    protected ArrayList<T> list;  
	    public ListPrinter(ArrayList<T> list) { 
	        //Your code goes here 
	    } 
	     @Override 
	    public abstract void print(); 
	}  
	class StringListPrinter extends ListPrinter<String> { 
	    public StringListPrinter(ArrayList<String> list) { 
	        //Your code goes here 
	    } 
	    @Override 
	    public void print() {
	        //Your code goes here 
	    } 
	}  
	class IntegerListPrinter extends ListPrinter<Integer> { 
	    public IntegerListPrinter(ArrayList<Integer> list) { 
	        //Your code goes here 
	    }  
	    @Override 
	    public void print() { 
	        //Your code goes here 
	    } 
	}
	
