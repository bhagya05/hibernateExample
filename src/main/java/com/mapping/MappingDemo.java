package com.mapping;

import com.tut.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class MappingDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Many to One and One to Many
//        Answer answer1 = new Answer(1,"Bhagya");
//        Answer ans2 = new Answer(2,"Anukriti");
//        Answer ans3 = new Answer(3,"Rohit");
//        List<Answer> answers = new ArrayList<>();
//        answers.add(answer1);
//        answers.add(ans2);
//        answers.add(ans3);
//        Question question = new Question(10,"what is your name",answers);
//        answers.forEach(answer -> answer.setQuestion(question));
//
//
//        Transaction transaction = session.beginTransaction();
//
//        session.save(answer1);
//        session.save(ans2);
//        session.save(ans3);
//        session.save(question);;
//        transaction.commit();


//         Many to Many mapping
//        Book b1 = new Book(10,"Life of pi");
//        Book b2 = new Book(20,"Diary of a young girl");
//        Book b3 = new Book(30,"Monk who sold his ferrari");
//        Author a1 = new Author(1,"Bhagya");
//        Author a2 = new Author(2,"Rohit");
//        List<Book>books = new ArrayList<>();
//        books.add(b1);
//        books.add(b2);
//        books.add(b3);
//
//        List<Author>authors = new ArrayList<>();
//        authors.add(a1);
//        authors.add(a2);
//
//        b1.setAuthors(authors.subList(0,1));
//        b2.setAuthors(authors);
//        b3.setAuthors(authors.subList(1,2));
//
//        a1.setBooks(books);
//        a2.setBooks(books);
//        Transaction transaction = session.beginTransaction();
//        session.save(b1);
//        session.save(b2);
//        session.save(b3);
//        session.save(a1);
//        session.save(a2);
//        transaction.commit();
//
//
        //Many to Many Fetching
        Author author = session.find(Author.class,1);
        System.out.println("Author :"+author.getName());
        for(Book book:author.getBooks())
        {
            System.out.println(book.getTitle());
            for(Author a: book.getAuthors())
            {
                System.out.println(a.getName());
            }
        }

        Book book = session.find(Book.class,10);
        System.out.println("Book :" +book.getTitle());
        for (Author a : book.getAuthors()) {
            System.out.println(a.getName());
        }

    }
}
