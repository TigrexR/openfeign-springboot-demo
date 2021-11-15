package com.tigrex.game.service.po;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "team")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString
public class TeamDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Field(name = "team")
    private String team;
    @Field(name = "season")
    private String season;
    @Field(name = "date")
    private String date;
    @Field(name = "wol")
    private String wol;
    @Field(name = "head_coach")
    private String headCoach;
}
