package dto;

import Model.Author;
import Model.Publisher;

import javax.validation.constraints.NotNull;

public class Updatebookdto {

    @NotNull
    private long page;
    @NotNull
    private String Language;
    private String comments;
    @NotNull
    private Publisher publisher;
    @NotNull
    private Author auther;
}
