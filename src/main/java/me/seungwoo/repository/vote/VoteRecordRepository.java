package me.seungwoo.repository.vote;

import me.seungwoo.domain.user.User;
import me.seungwoo.domain.vote.Vote;
import me.seungwoo.domain.vote.VoteOption;
import me.seungwoo.domain.vote.VoteRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoteRecordRepository extends JpaRepository<VoteRecord, Long> {

    boolean existsByUserAndVoteOption_Vote(User user, Vote vote);

    List<VoteRecord> findByUserAndVoteOption_Vote(User user, Vote vote);

    // 같은 옵션을 두 번 찍는 것 방지용
    boolean existsByUserAndVoteOption(User user, VoteOption voteOption);
}