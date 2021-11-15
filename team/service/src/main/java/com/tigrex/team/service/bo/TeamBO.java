package com.tigrex.team.service.bo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString
public class TeamBO implements Serializable {

    private static final long serialVersionUID = 1L;
}
