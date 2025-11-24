package me.seungwoo.repository.vote;

import me.seungwoo.domain.vote.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
