package com.tigrex.game.api.po;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "game")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString
public class GameDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Field(name = "team")
    private String homeTeam;
    @Field(name = "guest_team")
    private String guestTeam;
    @Field(name = "date")
    private String date;
    @Field(name = "arena")
    private String arena;
}
