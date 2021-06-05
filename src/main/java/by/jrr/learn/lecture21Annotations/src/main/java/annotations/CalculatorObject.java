package annotations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorObject {

    @GenerateIntValue
    private Integer firstValue;

    @GenerateIntValue
    private Integer secondValue;

    @TimeFrameDefinition
    public Integer calculate() {
        return firstValue + secondValue;
    }

    @TimeFrameDefinition
    public Integer calculate(Integer firstValue, Integer secondValue) {
        return firstValue + secondValue;
    }
}
