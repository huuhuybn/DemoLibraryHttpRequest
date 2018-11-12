package vn.edu.poly.demolibraryhttprequest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.edu.poly.demolibraryhttprequest.model.CategoryResponse;

public class MainActivity extends AppCompatActivity {


    String urlHttpGet = "http://www.tapetee.com/api.php?latest";
    String urlHttpPost = "http://dotplays.com/thilan2.php";
    //param : username : admin | password : admin123
    //Viet http get and post bang retrofit

    private RecyclerView lvList;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        lvList = findViewById(R.id.lvList);
        linearLayoutManager = new LinearLayoutManager(this);
        lvList.setLayoutManager(linearLayoutManager);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApiInterface apiService =
                        ApiClient.getClient().create(ApiInterface.class);

                Call<CategoryResponse> call = apiService.getCategories();

                call.enqueue(new Callback<CategoryResponse>() {
                    @Override
                    public void onResponse(Call<CategoryResponse> call, Response<CategoryResponse> response) {
                        if (response.isSuccessful()) {
                            Log.e("data",
                                    response.body().getHDWALLPAPER().size() + "");

                        }
                    }

                    @Override
                    public void onFailure(Call<CategoryResponse> call, Throwable t) {

                    }
                });


            }
        });
    }

}
