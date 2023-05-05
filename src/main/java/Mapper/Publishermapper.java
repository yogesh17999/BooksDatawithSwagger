package Mapper;

import Model.Publisher;
import dto.publisherdto;


public interface Publishermapper {


     Publisher topublisher(publisherdto publisherdto);
     publisherdto topublisherdto(Publisher publisher);
}
