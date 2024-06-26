package com.a508.studyservice.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FeignUserScoreResponse {

    private Integer userId;
    private Integer fact;
    private Integer inference;
    private Integer voca;
    private Integer recognition;
    private Integer speed;
}

