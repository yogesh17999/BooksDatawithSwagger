package dto;

import Model.Author;
import Model.Publisher;

import javax.validation.constraints.NotNull;

public class Bookresponsedto {

    private  long id;
    private long page;

    private String Language;
    private String comments;

    private Publisher publisher;
    private Author auther;
}
