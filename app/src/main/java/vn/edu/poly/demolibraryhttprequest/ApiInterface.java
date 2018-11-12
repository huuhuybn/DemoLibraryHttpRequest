package vn.edu.poly.demolibraryhttprequest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import vn.edu.poly.demolibraryhttprequest.model.CategoryResponse;

public interface ApiInterface {

    @GET("api.php?latest")
    Call<CategoryResponse> getCategories();

}
