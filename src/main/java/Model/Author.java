package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    private  long id;
    private String author_name;
    private LocalDate dob;
    private String place_of_birth;
    private  String social_media;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "auther")
    private List<Books> books;


}
