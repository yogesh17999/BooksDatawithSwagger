package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {
    private long id;
    private String company_name;
    private String headqueter;
    private String ceo;
    private String history;
    private String  Website;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,mappedBy = "publisher")
    private List<Books> books;




}
