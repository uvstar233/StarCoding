package com.uvstar.starcoding.judge.codesandbox;

import com.uvstar.starcoding.judge.codesandbox.model.ExecuteCodeRequest;
import com.uvstar.starcoding.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
