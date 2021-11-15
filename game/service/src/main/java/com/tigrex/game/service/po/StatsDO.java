package com.tigrex.game.service.po;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "stats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString
public class StatsDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Field(name = "player")
    private String player;
    @Field(name = "team")
    private String team;
    @Field(name = "season")
    private String season;
    @Field(name = "date")
    private String date;
    @Field(name = "min")
    private Integer min;
    @Field(name = "pts")
    private Integer pts;
    @Field(name = "reb")
    private Integer reb;
    @Field(name = "oreb")
    private Integer oreb;
    @Field(name = "dreb")
    private Integer dreb;
    @Field(name = "ast")
    private Integer ast;
    @Field(name = "tov")
    private Integer tov;
    @Field(name = "stl")
    private Integer stl;
    @Field(name = "blk")
    private Integer blk;
    @Field(name = "fga")
    private Integer fga;
    @Field(name = "fgm")
    private Integer fgm;
    @Field(name = "threePa")
    private Integer threePa;
    @Field(name = "threePm")
    private Integer threePm;
    @Field(name = "fta")
    private Integer fta;
    @Field(name = "ftm")
    private Integer ftm;
    @Field(name = "wol")
    private String wol;
}
