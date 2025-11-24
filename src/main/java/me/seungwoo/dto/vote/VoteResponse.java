package me.seungwoo.dto.vote;

import lombok.Getter;
import me.seungwoo.domain.vote.Vote;
import me.seungwoo.domain.vote.VoteOption;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class VoteResponse {
    private Long id;
    private String title;
    private List<VoteOptionDto> options; // 아래 내부 클래스 사용

    // Entity -> DTO 변환 생성자
    public VoteResponse(Vote vote) {
        this.id = vote.getId();
        this.title = vote.getTitle();
        this.options = vote.getVoteOptions().stream()
                .map(VoteOptionDto::new)
                .collect(Collectors.toList());
    }

    @Getter
    public static class VoteOptionDto {
        private Long id;
        private String content;
        private Integer count;

        public VoteOptionDto(me.seungwoo.domain.vote.VoteOption option) {
            this.id = option.getId();
            this.content = option.getContent();
            this.count = option.getCount();
        }
    }
}