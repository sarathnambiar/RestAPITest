package mandroid.tutorial.restapitest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import mandroid.tutorial.restapitest.R;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
        mPresenter.test(this);
    }

    @Override
    public void initView() {
    }
}
