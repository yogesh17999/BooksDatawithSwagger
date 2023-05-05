package Mapper;

import Model.Author;
import dto.Authordto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface Authormapper {

      Author toauthor (Authordto authordto);

      Authordto todto(Author author);




}
