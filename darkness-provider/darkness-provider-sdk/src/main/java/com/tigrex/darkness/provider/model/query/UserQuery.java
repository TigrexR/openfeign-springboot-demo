package com.tigrex.darkness.provider.model.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author linus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    private String scriptCode;
    private String scriptName;
    private String script;
    private String memo;
}
