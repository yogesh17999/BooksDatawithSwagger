package Service;

import Mapper.Bookmapper;
import Model.Books;
import Repository.Bookrepo;
import dto.Apimessage;
import dto.Bookdto;
import dto.Updatebookdto;
import jdk.jshell.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class Bookservice {

    @Autowired
      private Bookrepo repo;
    @Autowired
    private Bookmapper bookmapper;

    public   Apimessage addnewbook(Bookdto dto)
    {
        Books book=repo.findByBookname(dto.getBook_name(),dto.getLanguage());
        if(book != null)
        {
            return new  Apimessage(HttpStatus.BAD_REQUEST,"Book name is alread exist in given language");

        }

       Books books =repo.save(bookmapper.tobook(dto));
        return new Apimessage(HttpStatus.CREATED, "Book successfully added",bookmapper.booktoresponsedto(books));

    }
    public  Apimessage updatebookdetails(Updatebookdto updatedto)
    {
        Apimessage apimessage =new Apimessage();



        return apimessage;
    }
    public Apimessage deletebook(String bookname, String kanguage)
    {
        Apimessage apimessage =new Apimessage();

        return apimessage;
    }

    public Apimessage getbookbynameandlanguage(String bookname , String language)
    {
        Apimessage apimessage =new Apimessage();

        return apimessage;
    }
    public Apimessage getallbooks()
    {
        Apimessage apimessage =new Apimessage();

        return apimessage;
    }



}
