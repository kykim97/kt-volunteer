package ktvolunteer.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktvolunteer.AssociationApplication;
import lombok.Data;

@Entity
@Table(name = "AssociationInfo_table")
@Data
//<<< DDD / Aggregate Root
public class AssociationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long associationId;

    @Embedded
    private Address address;

    private String tel;

    private Integer bizNumber;

    private String email;

    private String place;

    private String schedule;

    private String title;

    private String category;

    public static AssociationInfoRepository repository() {
        AssociationInfoRepository associationInfoRepository = AssociationApplication.applicationContext.getBean(
            AssociationInfoRepository.class
        );
        return associationInfoRepository;
    }
}
//>>> DDD / Aggregate Root
