package Mapper;

import Model.Books;
import dto.Bookdto;
import dto.Bookresponsedto;
import dto.Updatebookdto;
import org.mapstruct.Mapper;

import java.awt.print.Book;

@Mapper(componentModel = "spring")
public interface Bookmapper {


    Books tobook (Bookdto bookdto);

    Bookdto tobooksdto(Books books);

    Updatebookdto toupdatebookdto(Books books);
    Book updatebookdtotobook(Updatebookdto dto);

      Bookresponsedto booktoresponsedto(Books books);

}
