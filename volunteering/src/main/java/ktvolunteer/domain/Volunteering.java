package ktvolunteer.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktvolunteer.VolunteeringApplication;
import lombok.Data;

@Entity
@Table(name = "Volunteering_table")
@Data
//<<< DDD / Aggregate Root
public class Volunteering {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long volunteeringId;

    @Embedded
    private Address place;

    private Date schedule;

    private String title;

    private String category;

    private Integer personnel;

    public static VolunteeringRepository repository() {
        VolunteeringRepository volunteeringRepository = VolunteeringApplication.applicationContext.getBean(
            VolunteeringRepository.class
        );
        return volunteeringRepository;
    }

    //<<< Clean Arch / Port Method
    public void editVolunteering(
        EditVolunteeringCommand editVolunteeringCommand
    ) {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void cancelVolunteering(
        CancelVolunteeringCommand cancelVolunteeringCommand
    ) {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void completeVolunteering(
        CompleteVolunteeringCommand completeVolunteeringCommand
    ) {
        //implement business logic here:

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
