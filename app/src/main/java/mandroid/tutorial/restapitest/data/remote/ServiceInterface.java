package mandroid.tutorial.restapitest.data.remote;

import mandroid.tutorial.restapitest.data.model.CurrencyConverterResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface ServiceInterface {

    @Headers("Content-Type: application/json")
    @GET("/currency/convert")
    Call<CurrencyConverterResponse> getCurrencyRate(@Header("X-RapidAPI-Key") String token);

}
