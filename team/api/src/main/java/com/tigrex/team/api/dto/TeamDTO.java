package com.tigrex.team.api.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString
public class TeamDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
}
