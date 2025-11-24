package me.seungwoo.repository.vote;

import me.seungwoo.domain.user.User;
import me.seungwoo.domain.vote.Vote;
import me.seungwoo.domain.vote.VoteRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VoteResponseRepository extends JpaRepository<VoteRecord, Long> {

    /**
     * 특정 유저(User)가 특정 투표(Vote)에 참여했는지 확인합니다.
     * VoteResponse -> VoteOption -> Vote 를 거쳐서 조회합니다.
     */
    @Query("SELECT COUNT(vr) > 0 FROM VoteRecord vr " +
            "WHERE vr.user = :user AND vr.voteOption.vote = :vote")
    boolean existsByUserAndVote(@Param("user") User user, @Param("vote") Vote vote);
}
