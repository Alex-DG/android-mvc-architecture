package com.techyourchance.mvc.networking;

import com.techyourchance.mvc.common.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StackoverflowApi {

    @GET("/questions?key=" + Constants.STACKOVERFLOW_API_KEY + "&sort=activity&order=desc&site=stackoverflow&filter=withbody")
    Call<QuestionsListResponseSchema> fetchLastActiveQuestions(@Query("pagesize") Integer pageSize);

    @GET("/questions/{questionId}?site=stackoverflow&filter=withbody")
    Call<QuestionsListResponseSchema> fetchQuestionDetails(@Path("questionId") String quetionId);

}
