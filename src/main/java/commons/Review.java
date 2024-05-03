package commons;

import jakarta.persistence.Id;

import java.time.LocalDate;

public class Review {
    @Id
    private long writer ;
    @Id
    private long receiver ;
    private String body ;
    private LocalDate creationDate ;
}
