package com.techyourchance.mvc.screens.questionslist;

import android.view.View;

import com.techyourchance.mvc.questions.Question;

import java.util.List;

interface QuestionsListViewMvcImpl {
    interface Listener {
        void onQuestionClicked(Question question);
    }

    void registerListerner(Listener listener);

    void unregisterListener(Listener listener);

    View getRootView();

    void bindQuestions(List<Question> questions);


}
