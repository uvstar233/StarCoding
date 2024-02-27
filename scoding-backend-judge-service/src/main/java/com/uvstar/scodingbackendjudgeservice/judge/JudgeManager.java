package com.uvstar.scodingbackendjudgeservice.judge;

import com.uvstar.scodingbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.uvstar.scodingbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.uvstar.scodingbackendjudgeservice.judge.strategy.JudgeContext;
import com.uvstar.scodingbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.yupi.yuojbackendmodel.model.codesandbox.JudgeInfo;
import com.yupi.yuojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
