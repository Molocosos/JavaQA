import java.io.IOException;

public class HW7 {
    public static void main(String[] args) throws IOException {
        String cityCode = WeatherResponse.getCityId("Sochi");
        System.out.println(cityCode);
        String forecast = WeatherResponse.getForecast(cityCode);
        System.out.println(forecast);

    }
}
