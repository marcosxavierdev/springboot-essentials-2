package academy.devdojo.springboot2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Anime {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;

}
