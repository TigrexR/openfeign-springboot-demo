package com.tigrex.team.service.query;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString
public class TeamQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
}
