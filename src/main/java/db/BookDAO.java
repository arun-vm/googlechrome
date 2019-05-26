package db;

import pojo.Book;

public class BookDAO {

    private static final String DATABASE = "library";
    private static final String COLLECTION = "books";
    private MongoService mongoService;

    public BookDAO()
    {
        mongoService = new MongoService(DATABASE,COLLECTION);
    }

    public void addBook(Book book)
    {
        mongoService.addDocument(DocumentConverter.getDocument(book));
    }



}
