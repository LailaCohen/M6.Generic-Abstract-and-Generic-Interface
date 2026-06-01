package generic;
import java.util.ArrayList; 
		public class ListPrinter<T> { 

		    private ArrayList<T> list; 

		    public ListPrinter(ArrayList<T> list) { 

		        this.list = list; 

		    } 

		    public void printList() { 

		        for (T item : list) { 

		            System.out.println(item); 

		        } 

		    } 

		} 

		public class MainClass { 

		    public static void main(String[] args) { 

		        ArrayList<String> citiesList = new ArrayList<>(); 

		        citiesList.add("San Francisco"); 

		        citiesList.add("Paris"); 

		        citiesList.add("Lima"); 

		        citiesList.add("Saigon"); 

		        citiesList.add("Bangkok"); 

		        citiesList.add("Tokyo"); 

		        citiesList.add("Cairo"); 

		        //Instantiate an object of type ListPrinter<String> 

		        //1a. Your code goes here 

		    //Invoke printList to print out citiesList 

		        //1b. Your code goes here 

		 

		    //2. Your code goes here    

		    } 

		} 
	}

}
