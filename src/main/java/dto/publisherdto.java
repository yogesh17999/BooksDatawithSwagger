package dto;

import Model.Books;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import javax.validation.constraints.NotNull;
import java.util.List;

public class publisherdto {
    @NotNull
    private String company_name;

    @NotNull
    private String headqueter;

    @NotNull
    private String ceo;
    private String about;
    private String  Website;
    private List<Books> books;


}
