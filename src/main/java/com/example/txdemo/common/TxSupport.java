package com.example.txdemo.common;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.function.Supplier;

/**
 * 事务辅助类
 */
public class TxSupport {


    /**
     * 在一个新事务里执行一段业务代码，且不需要业务的返回值
     * <p>
     * 通常用于该业务的异常不影响其它业务方法时
     * <p>
     * 调用者应对此方法加入 try/catch ，以免影响外层事务方法
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void runInNewTransaction(Runnable runnable) {
        runnable.run();
    }

    /**
     * 在一个新事务里执行一段业务代码，需要业务的返回值
     * <p>
     * 通常用于该业务的异常不影响其它业务方法时
     * <p>
     * 调用者应对此方法加入 try/catch ，以免影响外层事务方法
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public <T> T runInNewTransaction(Supplier<T> supplier) {
        return supplier.get();
    }


}
