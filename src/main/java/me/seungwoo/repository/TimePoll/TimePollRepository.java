package me.seungwoo.repository.TimePoll;

import me.seungwoo.domain.timepoll.TimePoll;
import me.seungwoo.domain.timeResponse.TimeResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TimePollRepository extends JpaRepository<TimePoll, Long> {

}

