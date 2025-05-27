import java.util.Map;

public record TasaCambioResponse(String result,
                                 String base_code,
                                 double conversion_rates,
                                 double conversion_result) {
}
