package mandroid.tutorial.restapitest.view;

import android.content.Context;

public class MainContract {

    interface View {
        void initView();
        //void setViewData(String data);
    }

//    interface Model {
//        void setData(String data);
//        String getData();
//    }

    interface Presenter {
        void test(Context context);
        void onClick(android.view.View view);
    }
}
