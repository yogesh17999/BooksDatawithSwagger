package dto;

import Model.Author;
import Model.Publisher;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bookdto {

    @NotNull
    private String  Book_name;

    @NotNull
    @Min(200)
    @Max(1000)
    private long price;

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
