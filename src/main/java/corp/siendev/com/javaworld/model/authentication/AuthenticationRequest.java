/*
 * Copyright (c) 2020. Iurii Golubnichenko aka Ghost Rider
 */

package corp.siendev.com.javaworld.model.authentication;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AuthenticationRequest implements Serializable {

    private String userName;
    private String password;
}
