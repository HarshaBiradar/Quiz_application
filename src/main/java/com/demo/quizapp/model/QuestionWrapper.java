package com.demo.quizapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class QuestionWrapper {

   /* private Integer id;

    @Column(name = "question_title")
    private String questionTitle;

    @Column(name = "option1")
    private String option1;

    @Column(name = "option2")
    private String option2;

    @Column(name = "option3")
    private String option3;

    @Column(name = "option4")
    private String option4;*/

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("question_title")
    private String questionTitle;

    @JsonProperty("option1")
    private String option1;

    @JsonProperty("option2")
    private String option2;

    @JsonProperty("option3")
    private String option3;

    @JsonProperty("option4")
    private String option4;



    public QuestionWrapper() {
    }

    public QuestionWrapper(Integer id, String questionTitle, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}
