package commons;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NoArgsConstructor
public class Product {
    @Id
    private long id ;
    private String brand ;
    private List<String> attributes ;
}
