package model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryId;

    private String name;
    private float area;
    private LocalDate nationalDay;
    private String countryCode2;
    private String countryCode3;
    private int regionId;

    

}
