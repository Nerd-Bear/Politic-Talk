package com.java_team_project.politictalk.model.politician;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document(collection = "politician")
public class Committee {
    @Id
    private String committeeId;
    private ArrayList<String> congressman;
}
