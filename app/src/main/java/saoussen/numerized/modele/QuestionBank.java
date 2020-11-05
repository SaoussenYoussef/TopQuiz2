package saoussen.numerized.modele;

import java.util.Collections;
import java.util.List;

public class QuestionBank {

    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;

        // Shuffle the questio List

        Collections.shuffle(mQuestionList);

        mNextQuestionIndex = 0;
    }

    public Question getQuestion(){

        // Ensure we loop over the question
        if (mNextQuestionIndex == mQuestionList.size()){
            mNextQuestionIndex = 0;
        }

        // Please note the post increme,ntation

        return mQuestionList.get(mNextQuestionIndex++);
    }




}
