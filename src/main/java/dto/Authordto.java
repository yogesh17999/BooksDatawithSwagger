package dto;

import Model.Books;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

public class Authordto {

    @NotNull
    private String author_name;
    @NotNull
    private LocalDate dob;
    private String place_of_birth;
    private  String social_media;

    @NotNull
    private List<Books> books;

}
