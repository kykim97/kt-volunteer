package ktvolunteer.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktvolunteer.MatchingApplication;
import ktvolunteer.domain.Matched;
import ktvolunteer.domain.MatchingComfirmed;
import ktvolunteer.domain.MatchingEditted;
import lombok.Data;

@Entity
@Table(name = "MatchingInfo_table")
@Data
//<<< DDD / Aggregate Root
public class MatchingInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matchingId;

    private Long userId;

    private Long associationId;

    @Embedded
    private Address location;

    private String category;

    @PostPersist
    public void onPostPersist() {
        Matched matched = new Matched(this);
        matched.publishAfterCommit();

        MatchingComfirmed matchingComfirmed = new MatchingComfirmed(this);
        matchingComfirmed.publishAfterCommit();

        MatchingEditted matchingEditted = new MatchingEditted(this);
        matchingEditted.publishAfterCommit();
    }

    public static MatchingInfoRepository repository() {
        MatchingInfoRepository matchingInfoRepository = MatchingApplication.applicationContext.getBean(
            MatchingInfoRepository.class
        );
        return matchingInfoRepository;
    }
}
//>>> DDD / Aggregate Root
