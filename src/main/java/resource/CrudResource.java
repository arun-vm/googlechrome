package resource;

import db.BookDAO;
import db.TestDao;
import pojo.Book;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


@Path("/library")
public class CrudResource {

    @Path("/addbook")
    @POST
    @Consumes(APPLICATION_JSON)
    public void addBook(Book book)
    {
        BookDAO bookDBService = new BookDAO();
        bookDBService.addBook(book);
    }
    


}
