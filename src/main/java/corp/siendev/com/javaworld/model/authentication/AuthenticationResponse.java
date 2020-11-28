/*
 * Copyright (c) 2020. Iurii Golubnichenko aka Ghost Rider
 */

package corp.siendev.com.javaworld.model.authentication;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class AuthenticationResponse implements Serializable {

    private final String jwtToken;
}
