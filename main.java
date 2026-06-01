package main;
import java.util.ArrayList; 
//public
class ListPrinter<T> { 
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
public class main { 
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
ListPrinter<String>CityPrinter=new ListPrinter<>(citiesList);// i crated on object listprinter 
    //Invoke printList to print out citiesList 
        //1b. Your code goes here 
System.out.println("The city list:");
CityPrinter.printList();
    //2. Your code goes here    
ArrayList<Integer>number=new ArrayList<>();// i create an array list 
for (int i =1;i<=5;i++) {// for loop to make the list 1 to 5 :)
	number.add(i);
}
ListPrinter<Integer>numberPrinter=new ListPrinter<>(number);// here I am creating anther object but for Integer 
System.out.println("the number list:");//print this 
numberPrinter.printList();// print the list of numbers 
}
    } 
