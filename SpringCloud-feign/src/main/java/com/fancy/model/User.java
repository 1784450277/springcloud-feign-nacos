package com.fancy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author fancy
 * @date 2022/4/9 20:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String username;
    private String password;
}