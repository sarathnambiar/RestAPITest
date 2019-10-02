package mandroid.tutorial.restapitest.view;

import android.content.Context;
import android.util.Log;
import android.view.View;

import mandroid.tutorial.restapitest.data.local.LocalDataSource;
import mandroid.tutorial.restapitest.data.remote.APIConstants;
import mandroid.tutorial.restapitest.data.remote.RetrofitClient;
import mandroid.tutorial.restapitest.data.remote.ServiceInterface;
import mandroid.tutorial.restapitest.data.model.CurrencyConverterResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View mView;
    private static String TAG = "MAIN";

    public MainPresenter(MainContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void test(Context context) {
        ServiceInterface service = RetrofitClient.getRetrofitInstance().create(ServiceInterface.class);
        Call<CurrencyConverterResponse> call = service.getCurrencyRate(APIConstants.API_KEY);
        call.enqueue(new Callback<CurrencyConverterResponse>() {
            @Override
            public void onResponse(Call<CurrencyConverterResponse> call, Response<CurrencyConverterResponse> response) {
                if (response.code() == 200) {
                    Log.e(TAG, "onResponse: "+response.body().getAmount());
                    LocalDataSource dbHelper = new LocalDataSource(context);
                    dbHelper.insertUserData("sarath "+ response.body().getBaseCurrencyName());
                    System.out.println(dbHelper.getData());
                }
            }

            @Override
            public void onFailure(Call<CurrencyConverterResponse> call, Throwable t) {
                Log.e(TAG, "onResponse: "+t.getMessage());
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
