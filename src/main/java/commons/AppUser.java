package commons;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
public class AppUser {
    @Id
    private long id ;
    private String username ;
    private String password ;
    private String email ;
    private String phoneNr ;
    private String location ;
    private String iban ;
    private LocalDate creationDate ;
    private List<Listing> listings ;
    private List<Review> reviews ;

}
