package com.techyourchance.mvc.screens.questionslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.techyourchance.mvc.R;
import com.techyourchance.mvc.questions.Question;
import com.techyourchance.mvc.screens.common.BaseObservableViewMvc;
import com.techyourchance.mvc.screens.common.BaseViewMvc;

import java.util.ArrayList;
import java.util.List;

public class QuestionsListItemViewMvcImpl extends BaseObservableViewMvc<QuestionsListItemViewMvc.Listener> implements QuestionsListItemViewMvc {

    private  Question mQuestion;

    private TextView mTxtTitle;

    public QuestionsListItemViewMvcImpl(LayoutInflater inflater, ViewGroup parent) {
        setRootView(inflater.inflate(R.layout.layout_question_list_item, parent, false));

        mTxtTitle = findViewById(R.id.txt_title);
        getRootView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Listener listener: getListeners()) {
                    listener.onQuestionClicked(mQuestion);
                }
            }
        });

    }

    @Override
    public void bindQuestion(Question question) {
        mQuestion = question;
        mTxtTitle.setText(question.getTitle());
    }
}
