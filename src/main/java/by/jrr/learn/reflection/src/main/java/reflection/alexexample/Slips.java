package reflection.alexexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Slips {
    private Boolean original;
    private List<Line> lines;

}
