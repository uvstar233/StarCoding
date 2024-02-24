package com.uvstar.starcoding.judge;

import com.uvstar.starcoding.judge.codesandbox.model.JudgeInfo;
import com.uvstar.starcoding.model.entity.QuestionSubmit;
import com.uvstar.starcoding.judge.strategy.DefaultJudgeStrategy;
import com.uvstar.starcoding.judge.strategy.JavaLanguageJudgeStrategy;
import com.uvstar.starcoding.judge.strategy.JudgeContext;
import com.uvstar.starcoding.judge.strategy.JudgeStrategy;
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
