package Test_ng_3;
import org.testng.IDataProviderMethod;
import org.testng.IRetryDataProvider;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Simple retry handler for DataProviders.
 * Will allow the data provider to be retried up to MAX_ATTEMPTS times.
 */
public class RetryDataProvider implements IRetryDataProvider {

    private static final int MAX_ATTEMPTS = 2; 
    private final AtomicInteger counter = new AtomicInteger(1);

    @Override
    public boolean retry(IDataProviderMethod dataProvider) {
        boolean shouldRetry = counter.getAndIncrement() <= MAX_ATTEMPTS;

        String clazz = dataProvider.getMethod().getDeclaringClass().getName();
        String dataProviderMethodName = dataProvider.getMethod().getName();
        String methodName = clazz + "." + dataProviderMethodName + "()";

        System.err.printf("Retry the data provider method %s ? %s (attempt %d of %d)%n",
                methodName, shouldRetry, counter.get() - 1, MAX_ATTEMPTS);

        return shouldRetry;
    }
}
