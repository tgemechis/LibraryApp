package com.company;

import java.awt.print.Book;
import java.util.*;


import static com.company.BookAdd.*;

public class Main {

    public static void main(String[] args) {


        String[] myStrings = new String[]{"Elem1", "Elem2", "Elem3", "Elem4", "Elem5"};

        List mylist = Arrays.asList(myStrings);
        Iterator itr = mylist.iterator();


        Scanner keyboard = new Scanner(System.in);
        int option;


        //Declaring all variables

        //Event anEvent;

        BookAdd aBookAdd;
        String eventAnswer = " ";
        String bookAddAnswer = " ";
        String menuAnswer = " ";
        boolean bookDone = false;
        boolean menuDone = false;
        boolean bookAddDone = true;

        String bookName;

        ArrayList<BookAdd> books = new ArrayList<>();

        //menu
        do {
            System.out.println("1. Do you want to see available Books? ");
            System.out.println("2. Do you want to add Books?  ");
            System.out.println("3. Do you want to borrow books? ");

            System.out.println("Enter your choice from the menu");
            option = keyboard.nextInt();
            keyboard.nextLine();


//        System.out.println("Displaying List Elements,");
//
//        while(itr.hasNext())
//
//            System.out.println(itr.next());


            if (option == 1) do {


                System.out.println("Enter the name of the title");
                aBookAdd.setTitle(keyboard.nextLine());
                System.out.println("Enter the name of the author");
                aBookAdd.setAuthor(keyboard.nextLine());
                System.out.println("Enter the year of publication");
                aBookAdd.setYear(keyboard.nextLine());
                System.out.println("Enter the ISBN number");
                aBookAdd.setIsbn(keyboard.nextLine());

                books.add(aBookAdd);

                System.out.println("Do you want to add another book?");


                if (eventAnswer.equalsIgnoreCase("No") || eventAnswer.equalsIgnoreCase("n"))

                    bookDone = false;
                else bookDone = true;


            } while (bookDone);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (option == 2) do {
                System.out.println("Enter the title of the book you want to add");
                bookName = keyboard.nextLine();

                do {
                    aBookAdd = new BookAdd();
                    System.out.println("Enter the author of the title");
                    aBookAdd.setTitle(keyboard.nextLine());

                    System.out.println("Enter the author of the book");
                    aBookAdd.setAuthor(keyboard.nextLine());

                    System.out.println("Enter the publication year");
                    aBookAdd.setYear(keyboard.nextLine());

                    System.out.println("Enter the ISBN ");
                    aBookAdd.setIsbn(keyboard.nextLine());

                    do {
                        System.out.println("Do you want to add another book");
                        eventAnswer = keyboard.nextLine();

                        if (eventAnswer.equalsIgnoreCase("no") || eventAnswer.equalsIgnoreCase("n"))
                            bookDone = false;
                        else bookDone = true;

                    } while (bookDone);


                }
            }

            else if (option == 3) for (BookAdd eachBookAdd : books) {
                System.out.println("The title of the book is :" + eachBookAdd.getTitle());
                System.out.println("The author of the book is :" + eachBookAdd.getAuthor());
                System.out.println("The year of publication :" + eachBookAdd.getYear());
                System.out.println("The ISBN is:" + eachBookAdd.getIsbn());
                if (!eachBookAdd.getBookAdds().isEmpty()) {
                    for (BookAdd eachBookAdds : eachBookAdd.getBookAdds()) {
                        System.out.println("All speakers for all events are " + eachBookAdds.getBookAdds());
                    }
                } else System.out.println("No speakers for this event");

            }


                    System.out.println("Do you want to see the menu again");
                    menuAnswer = keyboard.nextLine();


                    if (eventAnswer.equalsIgnoreCase("no") || eventAnswer.equalsIgnoreCase("n"))
                        bookDone = false;
                    else bookDone = true;

                } while (true);

            }
        }

