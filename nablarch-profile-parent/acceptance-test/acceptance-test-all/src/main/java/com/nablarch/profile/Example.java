package com.nablarch.profile;

import nablarch.core.log.Logger;
import nablarch.core.log.LoggerManager;
import nablarch.fw.ExecutionContext;
import nablarch.fw.action.BatchAction;
import nablarch.fw.web.servlet.WebFrontController;

/**
 * TODO write document comment.
 *
 * @author T.Kawasaki
 */
public class Example {
    /** ÉçÉKÅ[ */
    private static final Logger LOGGER = LoggerManager.get(Example.class);

    private ExecutionContext executionContext = null;
    private WebFrontController webFrontController = null;

    private BatchAction<?> batchAction = null;
}
