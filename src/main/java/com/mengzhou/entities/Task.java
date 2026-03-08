package com.mengzhou.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Task {
    private String id;
    private String name;
    private Boolean done;
}