package commons;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Listing {
    @Id
    private long id ;
    private LocalDate creationDate ;
}
