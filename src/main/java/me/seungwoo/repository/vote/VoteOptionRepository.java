package me.seungwoo.repository.vote;

import me.seungwoo.domain.vote.VoteOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteOptionRepository extends JpaRepository<VoteOption, Long> {
}
