package com.rafael.SpringBatchXmlToDatabase.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class User {
    private Integer id;
    private String name;
}
