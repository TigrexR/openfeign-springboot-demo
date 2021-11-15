package com.tigrex.game.service.po;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "game")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString
public class GameDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Field(name = "home_team")
    private String homeTeam;
    @Field(name = "guest_team")
    private String guestTeam;
    @Field(name = "season")
    private String season;
    @Field(name = "date")
    private String date;
    @Field(name = "start_date_time")
    private Date startDateTime;
    @Field(name = "end_date_time")
    private Date endDateTime;
    @Field(name = "arena")
    private String arena;
}
