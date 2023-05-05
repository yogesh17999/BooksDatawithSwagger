package Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
   private long id;
   private String  Book_name;
   private long price;
   private long page;
   private String Language;
   private String comments;


   @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
   private Publisher publisher;

   @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   private  Author auther;







}
