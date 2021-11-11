package com.tigrex.game.api.bo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString
public class StatsBO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String player;
    private String team;
    private String season;
    private String date;
    private Integer min;
    private Integer pts;
    private Integer reb;
    private Integer oreb;
    private Integer dreb;
    private Integer ast;
    private Integer tov;
    private Integer stl;
    private Integer blk;
    private Integer fga;
    private Integer fgm;
    private Integer threePa;
    private Integer threePm;
    private Integer fta;
    private Integer ftm;
    private String wol;
}
